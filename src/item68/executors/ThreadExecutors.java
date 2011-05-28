package item68.executors;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Nov 1, 2009
 * Time: 11:49:44 AM
 */
public class ThreadExecutors {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.execute(new SquareOfNumber(10));
        executorService.execute(new SquareOfNumber(11));
        executorService.execute(new SquareOfNumber(12));
        executorService.execute(new SquareOfNumber(13));
        executorService.execute(new SquareOfNumber(14));
        executorService.execute(new SquareOfNumber(15));

        executorService.shutdown();
    }

    public static class SquareOfNumber implements Runnable{

        private int no;

        public SquareOfNumber() {}

        public SquareOfNumber(int no) {
            this.no = no;
        }


        public void run() {
            Random random = new Random();
            int i = random.nextInt() % 10;
            System.out.println("Starting Thread - "+i);
            try {
                TimeUnit.SECONDS.sleep(Math.abs(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Square of "+no + " is " + (no*no));
            System.out.println("Completed Thread - "+i);
        }
    }
    
}
