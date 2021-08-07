package producerconsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer {
    public static void consumer(BlockingQueue<Integer> queue ) throws InterruptedException {

        Random r = new Random();
        while (true){
            Thread.sleep(200);
            System.out.println(queue.take());
            System.out.println("Queue array "+ queue.toString() + " size "  + queue.size());
        }

    }
}
