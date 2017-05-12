package reflect;

/**
 * Created by ${李朋}
 * on 2017/5/9.
 */
public class ThreadPriority implements Runnable {
    @Override
    public void run() {
        System.out.println("running thread: " + Thread.currentThread().getName());
        System.out.println("thread priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadPriority());
        Thread thread2 = new Thread(new ThreadPriority());
        Thread thread3 = new Thread(new ThreadPriority());

        thread1.setName("thread1");
        thread2.setName("thread2");
        thread3.setName("thread3");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

