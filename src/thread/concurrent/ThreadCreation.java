package thread.concurrent;

public class ThreadCreation {
    public static void main(String args[]){
        NewThread t=new NewThread();
        Thread t1 =new Thread(t);
        NewThread1 t2=new NewThread1();

        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 3 "+ Thread.currentThread().getName());
            }
        });

        Thread t4=new Thread(()->{
            System.out.println("runnable 4 "+ Thread.currentThread().getName());
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class NewThread implements Runnable{
    @Override
    public void run(){
        System.out.println("runnable "+ Thread.currentThread().getName());
    }
}

class NewThread1 extends Thread{

    @Override
    public void run(){
        System.out.println("Thread "+ Thread.currentThread().getName());

    }
}
