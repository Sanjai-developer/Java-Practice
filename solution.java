
class A    //parent class
{
  public A()
  {
    System.out.println("in A");
  }
  
}
class B extends A    //child class
{
  public B()
  {
    System.out.println("in B");
  }
  
}

public class solution 
{
    public static void main(String args[]) 
    {
          B obj = new B();

    }
}