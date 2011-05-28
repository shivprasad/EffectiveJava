package item66.synchronize;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Nov 1, 2009
 * Time: 11:38:24 AM
 */
public class SynchronizeAccessToSharedData {

    private static boolean isStopRequested = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable(){
            public void run() {
                int i=0;
                while(!stopRequested())
                    i++;
                System.out.println("Value of i "+i);
            }
        });

        thread.start();

        TimeUnit.SECONDS.sleep(1);

        requestStop();
    }

    private synchronized static void requestStop() {
        isStopRequested = true;
    }


    private synchronized static boolean stopRequested() {
        return isStopRequested;
    }

}
