package reflect;

/**
 * Created by ${李朋}
 * on 2017/5/9.
 */
public class MT4 implements Runnable {

    public static void main(String[] args) {

        Thread thread = new Thread(new MT4());
        thread.setName("thread");
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running...");
            try {
                Thread.sleep(1000 * 3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
