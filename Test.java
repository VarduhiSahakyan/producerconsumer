package producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Producer.produce(queue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Consumer.consumer(queue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        writer.start();
        reader.start();
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
