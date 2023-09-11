package in.verma.app11.main;
import in.verma.app11.threads.MyThread1;
import in.verma.app11.threads.MyThread2;

public class Main {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2(thread1);

        thread1.setThread2(thread2);

        thread1.start();
        thread2.start();
    }
}
