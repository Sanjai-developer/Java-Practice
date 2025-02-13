
class A    //parent class
{
 public A(){
  System.out.println("in constructor A");
 }
 public void show()
 {
  System.out.println("in method show A");
 }
}

public class solution 
{
    public static void main(String args[]) 
    {
        A obj ;
        obj =  new A();
        obj.show();
        new A();   //anonymous object
    }
}
