package MethodandClasses.MultithreadingProgramming;

class NewThreadDemo implements Runnable{
    String name;
    Thread t;

    NewThreadDemo(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start();
    }

    public void run() {
    try{
        for (int i = 5; i > 0; i--){
            System.out.println(name + ": " + i);
            Thread.sleep(1000);
        }
    }
    catch (InterruptedException e){
        System.out.println(name + " Interrupted");
    }
        System.out.println(name + " exiting.");
    }
}

public class MultipleThreadDemo {
    public static void main(String[] args) {
        NewThreadDemo ob1 = new NewThreadDemo("One");
        NewThreadDemo ob2 = new NewThreadDemo("Two");
        NewThreadDemo ob3 = new NewThreadDemo("Three");

        System.out.println("Thread one is alive: " + ob1.t.isAlive());
        System.out.println("Thread two is alive: " + ob2.t.isAlive());
        System.out.println("Thread three is alive: " + ob3.t.isAlive());

//        if(ob1.t.isAlive() == true && ob2.t.isAlive() == true && ob3.t.isAlive() == true){
            try{
                System.out.println("Waiting for threads to finish");
                ob1.t.join();
                ob2.t.join();
                ob3.t.join();
            }
            catch (InterruptedException e){
                System.out.println("Main Thread Interrupted");
            }
//        }

        System.out.println("Thread one is alive: " + ob1.t.isAlive());
        System.out.println("Thread one is alive: " + ob2.t.isAlive());
        System.out.println("Thread one is alive: " + ob3.t.isAlive());
        System.out.println("Main thread exiting.");
    }
}
