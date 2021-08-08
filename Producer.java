package producerconsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer {
    public static void produce(BlockingQueue<Integer> queue) throws InterruptedException {
        Random random = new Random();
        while (true) {
            queue.put(random.nextInt(100));
        }


    }
}
