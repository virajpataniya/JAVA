#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

#define BUFFER_SIZE 25

// Shared buffer and indices
int buffer[BUFFER_SIZE];
int free_index = 0;
int full_index = 0;
//POSIX threads (pthreads) library provides set of synchronization primitives, including mutexes
pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;

void* producer(void* arg) {
    while (1) {
        pthread_mutex_lock(&mutex);
        if ((free_index + 1) % BUFFER_SIZE != full_index) {
            buffer[free_index] = rand(); // Produce an item
            free_index = (free_index + 1) % BUFFER_SIZE;
        }
        pthread_mutex_unlock(&mutex);
        sleep(1); // Simulate work
    }
    return NULL;
}

void* consumer(void* arg) {
    while (1) {
        pthread_mutex_lock(&mutex);
        if (free_index != full_index) {
            int item = buffer[full_index]; // Consume an item
            full_index = (full_index + 1) % BUFFER_SIZE;
        }
        pthread_mutex_unlock(&mutex);
        sleep(1); // Simulate work
    }
    return NULL;
}

int main() {
    pthread_t producer_thread, consumer_thread;

    pthread_create(&producer_thread, NULL, producer, NULL);
    pthread_create(&consumer_thread, NULL, consumer, NULL);

    pthread_join(producer_thread, NULL);
    pthread_join(consumer_thread, NULL);

    return 0;
}
