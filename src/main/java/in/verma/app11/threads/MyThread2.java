package in.verma.app11.threads;

public class MyThread2 extends Thread {
        private MyThread1 thread1;
        private boolean isFinish = false;

        public MyThread2(MyThread1 thread1) {
            this.thread1 = thread1;
        }

        @Override
        public void run() {
            while (!thread1.isStart()) {
            }
            ;
            System.out.println("Поток_2 запущен!");

            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("Поток_2");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            isFinish = true;
            System.out.println("Поток_2 завершён!");
        }

        public boolean isFinish() {
            return isFinish;
        }
    }