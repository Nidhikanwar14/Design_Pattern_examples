package Questions;

class RunnableThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable thread1.......");
    }
}
class RunnableThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable thread2.......");
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        RunnableThread1 bullet1 = new RunnableThread1();
        Thread gun1 = new Thread(bullet1);

        RunnableThread2 bullet2 = new RunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();


    }
}
