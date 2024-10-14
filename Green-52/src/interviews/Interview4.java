package interviews;

import java.util.concurrent.CountDownLatch;

public class Interview4 {

    public static void main(String[] args) {
        // intialising count down latch by 3, as it will wait for 3 threads to
        // finish execution
        final CountDownLatch latch = new CountDownLatch(3);

        // making two threads for 3 services
        Thread service1 = new Thread(new ServiceOne(latch));
        Thread service2 = new Thread(new ServiceTwo(latch));
        Thread service3 = new Thread(new ServiceThree(latch));

        service1.start();
        service2.start();
        service3.start();

        // latch waits till the count becomes 0
        // this way we can make sure that the execution of main thread only
        // finishes ones 3 services have executed
        try {
            System.out.println("Waiting for 3 services have started ... ");
            latch.await();
            System.out.println("Starting main Thread ... ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!!!");
    }
}

class ServiceOne implements Runnable {

    private final CountDownLatch latch;

    public ServiceOne(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Started service One");
        latch.countDown();
    }
}

class ServiceTwo implements Runnable {

    private final CountDownLatch latch;

    public ServiceTwo(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Started service Two");
        latch.countDown();
    }

}

class ServiceThree implements Runnable {

    private final CountDownLatch latch;

    public ServiceThree(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Started service three");
        latch.countDown();
    }

}