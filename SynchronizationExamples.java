import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizationExamples {

    // 1. Using Synchronized Methods
    public static class SynchronizedMethodExample {
        private int count = 0;

        // Synchronized method
        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    // 2. Using Synchronized Blocks
    public static class SynchronizedBlockExample {
        private int count = 0;

        public void increment() {
            synchronized (this) {
                count++;
            }
        }

        public int getCount() {
            return count;
        }
    }

    // 3. Using ReentrantLock
    public static class ReentrantLockExample {
        private int count = 0;
        private final Lock lock = new ReentrantLock();

        public void increment() {
            lock.lock(); // Acquire the lock
            try {
                count++;
            } finally {
                lock.unlock(); // Ensure the lock is released
            }
        }

        public int getCount() {
            return count;
        }
    }

    // 4. Using ReadWriteLock
    public static class ReadWriteLockExample {
        private int count = 0;
        private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
        private final Lock readLock = rwLock.readLock();
        private final Lock writeLock = rwLock.writeLock();

        public void increment() {
            writeLock.lock(); // Acquire write lock
            try {
                count++;
            } finally {
                writeLock.unlock(); // Release write lock
            }
        }

        public int getCount() {
            readLock.lock(); // Acquire read lock
            try {
                return count;
            } finally {
                readLock.unlock(); // Release read lock
            }
        }
    }

    // 5. Using Atomic Classes
    public static class AtomicExample {
        private AtomicInteger count = new AtomicInteger(0);

        public void increment() {
            count.incrementAndGet();
        }

        public int getCount() {
            return count.get();
        }
    }

    public static void main(String[] args) {
        // Test Synchronized Method Example
        SynchronizedMethodExample syncMethodExample = new SynchronizedMethodExample();
        syncMethodExample.increment();
        System.out.println("Synchronized Method Example Count: " + syncMethodExample.getCount());

        // Test Synchronized Block Example
        SynchronizedBlockExample syncBlockExample = new SynchronizedBlockExample();
        syncBlockExample.increment();
        System.out.println("Synchronized Block Example Count: " + syncBlockExample.getCount());

        // Test Reentrant Lock Example
        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();
        reentrantLockExample.increment();
        System.out.println("Reentrant Lock Example Count: " + reentrantLockExample.getCount());

        // Test ReadWrite Lock Example
        ReadWriteLockExample readWriteLockExample = new ReadWriteLockExample();
        readWriteLockExample.increment();
        System.out.println("ReadWrite Lock Example Count: " + readWriteLockExample.getCount());

        // Test Atomic Example
        AtomicExample atomicExample = new AtomicExample();
        atomicExample.increment();
        System.out.println("Atomic Example Count: " + atomicExample.getCount());
    }
}
