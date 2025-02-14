import tools.AdvCalc; 
import tools.Calc; //import package name 

public class solution 
{
    public static void main(String args[]) 
    {   Calc obj2 = new Calc();
        AdvCalc  obj = new AdvCalc();
       System.out.println( obj2.add(10,20));
       System.out.println( obj2.sub(10,20));
       System.out.println( obj.mul(10,20));
       System.out.println( obj.div(10,20));

        
    }
}




