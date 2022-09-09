package Questions;

class MyThread1 extends Thread{
    public void run(){
        int i =0 ;
        while (i<4000) {
            System.out.println("Thread1 is running...");
            System.out.println("yeahhhhh!!!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<4000) {
            System.out.println("Thread2 is running...");
            System.out.println("fine!!!!");
            i++;
        }
    }
}class MyThread3 extends Thread{
    public void run(){
        int i = 0;
        while(i<4000) {
            System.out.println("Thread3 is running...");
            System.out.println("!!!!");
            i++;
        }
    }
}
public class MyThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        t2.start();
        t1.start();
        t3.start();
    }
}
