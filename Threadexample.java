import java.util.*;

// Concurrent Execution
class task1 implements Runnable{
    public void run(){
        System.out.println(" Threads are Running");
        for(int i=0;i<=5;i++){
            System.out.println(" Thread 1 : " + i + " is Running");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread Interrupted");
            }  
        }
        System.out.println("Thread Ended");
    }
}
class task2 implements Runnable{
    public void run(){
        System.out.println(" Threads are Running");
        for(int i=0;i<=6;i++){
            System.out.println(" Thread 2 : " + i + " is Running");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread Interrupted");
            }  
        }
        System.out.println("Thread Ended");
    }
}
public class Threadexample {
    public static void main(String[] args){
        Thread t1 = new Thread(new task1());
        Thread t2 = new Thread(new task2());
        t1.start();
        t2.start();
    }
}