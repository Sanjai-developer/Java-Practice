import java.util.*;
class Myclass extends Thread{
    public void run(){
        System.out.println(" Threads are Running");
        for(int i=0;i<=5;i++){
            System.out.println(" Thread : " + i + " is Running");
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
        Myclass t1 = new Myclass();
        t1.start();
    }
}