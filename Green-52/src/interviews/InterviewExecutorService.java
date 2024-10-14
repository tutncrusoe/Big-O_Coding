package interviews;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterviewExecutorService {

    public static void main(String[] args) {

//        for (int i = 1; i <= 3; i++) {
//            newSingleThreadExecutor();
//        }

        for (int i = 1; i <= 5; i++) {
            newFixedThreadPool();
        }
    }

    private static void newSingleThreadExecutor() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 4; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }

        /*
         * Initiates an orderly shutdown in which previously submitted tasks are
         * executed, but no new tasks will be accepted. Invocation has no additional
         * effect if already shut down. This method does not wait for previously
         * submitted tasks to complete execution. Use awaitTermination to do that.
         */
        executor.shutdown();

        // Wait until all threads are finish
        while (!executor.isTerminated()) {
            // Running ...
        }

        System.out.println("Finished all threads");
    }

    public static final int NUM_OF_THREAD = 3;

    private static void newFixedThreadPool() {

        ExecutorService executor = Executors.newFixedThreadPool(NUM_OF_THREAD);

        for (int i = 1; i <= 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }

        /*
         * Initiates an orderly shutdown in which previously submitted tasks are
         * executed, but no new tasks will be accepted. Invocation has no additional
         * effect if already shut down. This method does not wait for previously
         * submitted tasks to complete execution. Use awaitTermination to do that.
         */
        executor.shutdown();

        // Wait until all threads are finish
        while (!executor.isTerminated()) {
            // Running ...
        }

        System.out.println("Finished all threads");
    }
}

class WorkerThread implements Runnable {

    private String task;

    public WorkerThread(String s) {
        this.task = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Starting. Task = " + task);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " Finished.");
    }

    private void processCommand() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}