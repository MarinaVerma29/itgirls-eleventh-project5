package in.verma.app11.threads;

public class MyThread1 extends Thread{
    private MyThread2 thread2;
    private boolean isStart = false;
    @Override
    public void run() {
        System.out.println("Поток_1 запущен");
        isStart = true;
        for (int i = 0; i < 10; i++) {
            try {
                while (!thread2.isFinish() && i == 9){};
                System.out.println("Поток_1");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        isStart = false;
        System.out.println("Поток_1 завершён!");
    }

    public void setThread2(MyThread2 thread2) { this.thread2 = thread2; }
    public boolean isStart() { return isStart; }
}
