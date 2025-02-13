
class A    //parent class
{
  public A()
  {
    System.out.println("in A");
  }
  public A(int n){
    System.out.println(" In A int");
  }
}
class B extends A    //child class
{
  public B()
  {
    System.out.println("in B");
  }
  public B(int n)
  {
    super(n);
    System.out.println("in B int");
  }
  
}

public class solution 
{
    public static void main(String args[]) 
    {
          B obj = new B(10);

    }
}
