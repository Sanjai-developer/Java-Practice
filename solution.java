
class A    //parent class
{
  public A()
  { 
    super();
    System.out.println("in A");
  }
  public A(int n){
    super();
    System.out.println(" In A int");
  }
}
class B extends A    //child class
{
  public B()
  {
    super();
    System.out.println("in B");
  }
  public B(int n)
  {
    this();
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
