package multithreading;

/**
 * Created by ${李朋}
 * on 2017/5/8.
 */
public class Test implements Runnable {
    public static void main(String[] args) {
        //进程 process
        //线程 thread
        Test test= new Test();
        Thread thread = new Thread(test);//Runnable
        thread.start();
    }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
    }

}
