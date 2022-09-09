package Questions;

public class ThreadConstructor extends Thread {

    public ThreadConstructor(Runnable r , String name) {
        System.out.println("Name is "+name);
    }

    public void run(){
        System.out.println("run...");
    }
}

class RunnableT implements Runnable{

    @Override
    public void run() {
        System.out.println("/..........");
    }
}

class Main{
    public static void main(String[] args) {
        RunnableT t1 = new RunnableT();
        ThreadConstructor t = new ThreadConstructor(new Thread(t1) , "hello");
        t.start();
    }
}