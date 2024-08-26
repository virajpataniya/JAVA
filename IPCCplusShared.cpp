#include <iostream>
#include <mutex>
#include <thread>
#include <vector>
#include <atomic>

#define BUFF_MAX 25

struct item {
    int id;          // Unique identifier for the item
    float value;     // Some data associated with the item
};


// An array is needed for holding the items. 
// This is the shared place which will be accessed by both producer and consumer   
item shared_buff[BUFF_MAX];

// Two variables which will keep track of the indexes of the items produced by producer 
// and consumed by consumer. The free index points to the next free index. The full index points to 
// the first full index. 
std::atomic<int> free_index(0);
std::atomic<int> full_index(0);
std::mutex mtx;

void producer() {
    item new_item;
    while (true) {
        // Produce the item
        // ...
        std::this_thread::sleep_for(std::chrono::milliseconds(100));
        
        // Add the item to the buffer
        while (((free_index.load() + 1) % BUFF_MAX) == full_index.load()) {
            // Buffer is full, wait for consumer thread to use sharedBuff
            std::this_thread::sleep_for(std::chrono::milliseconds(100));
        }
        //Locking other threads to access sharedBuff as this(producer thread) is adding new items to sharedBuff
        std::lock_guard<std::mutex> lock(mtx);
        // Add the item to the buffer
        shared_buff[free_index.load()] = new_item;
        free_index.store((free_index.load() + 1) % BUFF_MAX);
    }
}

void consumer() {
    item consumed_item;
    while (true) {
        while (free_index.load() == full_index.load()) {
            // Buffer is empty, wait for producer to add new items on sharedBuff
            std::this_thread::sleep_for(std::chrono::milliseconds(100));
        }
        //Locking other threads to access/update sharedBuff as this(consumer thread) is consuming sharedBuff items
        std::lock_guard<std::mutex> lock(mtx);
        // Consume the item from the buffer
        consumed_item = shared_buff[full_index.load()]; //Safely retrieves current value of an atomic variable
        full_index.store((full_index.load() + 1) % BUFF_MAX); //Safely updates value of an atomic variable
        
        // Consume the item
        // ...
        std::this_thread::sleep_for(std::chrono::milliseconds(100));
    }
}

int main() {
    // Create producer and consumer threads
    std::vector<std::thread> threads;
    threads.emplace_back(producer);
    threads.emplace_back(consumer);

    // Wait for threads to finish
    for (auto& thread : threads) {
        thread.join();
    }

    return 0;
}
