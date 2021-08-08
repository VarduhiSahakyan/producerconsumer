package producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer {
    public static void consumer(BlockingQueue<Integer> queue) throws InterruptedException {

        while (true) {
            Thread.sleep(200);
            System.out.println(" Deleted " + queue.take());
            System.out.println("Queue array " + queue.toString() + " size " + queue.size());
        }

    }
}
