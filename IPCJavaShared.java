import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class IPCJavaShared {
    /*IPC(Inter Process Communication) in OS has been working by 2 methods 
    This class describes Shared memory concept
    a) Shared Memory
    b) Message Passing */

    private static final int BUFF_MAX = 25;
    private static final Item[] sharedBuff = new Item[BUFF_MAX];
    private static final AtomicInteger freeIndex = new AtomicInteger(0);
    private static final AtomicInteger fullIndex = new AtomicInteger(0);
    private static final Lock lock = new ReentrantLock(); //This will work in Java as mutex of C/C++

    static class Item {
        // Define the structure of the item here
        // Define item properties here
        private final int id;
        private final String data;

        // Constructor
        public Item(int id, String data) {
            this.id = id;
            this.data = data;
        }

        // Getters
        public int getId() {
            return id;
        }

        public String getData() {
            return data;
        }

        // Optionally, override toString() for debugging or logging
        @Override
        public String toString() {
            return "Item{id=" + id + ", data='" + data + "'}";
        }
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            while (true) {
                Item newItem = new Item(0, null);
                try {
                    TimeUnit.MILLISECONDS.sleep(100); // Simulate item production
                    boolean added = false;
                    while (!added) {
                        int freeIdx = freeIndex.get();
                        int nextFreeIdx = (freeIdx + 1) % BUFF_MAX;
                        if (nextFreeIdx != fullIndex.get()) {
                        //Locking other threads to access sharedBuff as this(producer thread) is adding new items to sharedBuff
                            lock.lock();
                            try {
                                if (freeIndex.get() == freeIdx && nextFreeIdx != fullIndex.get()) {
                                    sharedBuff[freeIdx] = newItem;
                                    freeIndex.set(nextFreeIdx);
                                    added = true;
                                }
                            } finally {
                        //Unlocking it as this thread has did its work so now any other thraed can acess sharedBuff
                                lock.unlock(); 
                            }
                        } else {
                            // Buffer is full, wait for consumer thread to use sharedBuff
                            TimeUnit.MILLISECONDS.sleep(100);
                        }
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    while (freeIndex.get() == fullIndex.get()) {
                        // Buffer is empty, wait for producer
                        TimeUnit.MILLISECONDS.sleep(100);
                    }
                //Locking other threads to access/update sharedBuff as this(consumer thread) is consuming sharedBuff items
                    lock.lock();
                    try {
                        if (freeIndex.get() != fullIndex.get()) {
                            int fullIdx = fullIndex.get();
                            Item consumedItem = sharedBuff[fullIdx];
                            fullIndex.set((fullIdx + 1) % BUFF_MAX);
                            // Consume the item here
                        }
                    } finally {
                //Unlocking it as this thread has did its work so now any other thraed can acess sharedBuff 
                        lock.unlock();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
