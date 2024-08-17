import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import android.os.Handler;
//import android.os.HandlerThread;

// 1. Using the Thread Class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Running in MyThread: " + Thread.currentThread().getName());
    }
}

// 2. Using the Runnable Interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Running in MyRunnable: " + Thread.currentThread().getName());
    }
}

// 3. Using Handler and HandlerThread
/*class MyHandlerThread {
    private Handler handler;

    public MyHandlerThread() {
        HandlerThread handlerThread = new HandlerThread("MyHandlerThread");
        handlerThread.start();
        handler = new Handler(handlerThread.getLooper());
    }

    public void postTask() {
        handler.post(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in HandlerThread: " + Thread.currentThread().getName());
            }
        });
    }
}*/

// 4. Using ExecutorService
class MyExecutorService {
    private ExecutorService executorService;

    public MyExecutorService() {
        executorService = Executors.newFixedThreadPool(4);
    }

    public void submitTask() {
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in ExecutorService: " + Thread.currentThread().getName());
            }
        });
    }

    public void shutdown() {
        executorService.shutdown();
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Using the Thread Class
        MyThread myThread = new MyThread();
        myThread.start();

        // 2. Using the Runnable Interface
        Thread threadWithRunnable = new Thread(new MyRunnable());
        threadWithRunnable.start();

        // 3. Using Handler and HandlerThread
        /*MyHandlerThread myHandlerThread = new MyHandlerThread();
        myHandlerThread.postTask();*/

        // 4. Using ExecutorService
        MyExecutorService myExecutorService = new MyExecutorService();
        myExecutorService.submitTask();
        myExecutorService.shutdown();
    }
}
