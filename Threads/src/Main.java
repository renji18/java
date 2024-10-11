class MyThread1 extends Thread {
    @Override
    public void run(){
//        while(true){
            System.out.println("My Thread 1 is running!!");
            System.out.println("I am cooking!!");
//        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run(){
//        while(true){
            System.out.println("My Thread 2 is running!!");
            System.out.println("I am coding!!");
//        }
    }
}

class MyRunnableInterface implements Runnable {
    public void run() {
        System.out.println("I am a thread, not a threat.");
    }
}

class MyRunnableInterface2 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am a thread, not a threat v2.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        MyRunnableInterface bullet1 = new MyRunnableInterface();
        Thread gun1 = new Thread(bullet1);

        MyRunnableInterface2 bullet2 = new MyRunnableInterface2();
        Thread gun2 = new Thread(bullet2);

        t1.start();
        t2.start();

        gun1.start();
        gun2.start();
    }
}