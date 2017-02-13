package methodoverloading1;
public class MethodOverloading1 {
static int add(int a,int b)
{
    return (a+b);
   
}
static double add(double a,double b)
{
    return(a+b);
}
public void add(int a,double  b)
{
    System.out.println(a+b);
}
public int add(int a,int b,int c)
{
    return(a+b+c);
}
    
    public static void main(String[] args) {
        MethodOverloading1 obj=new MethodOverloading1();
       System.out.println("Addition of two integer number:"+obj.add(3, 4));
       System.out.println("aaddition of two double numbers:"+obj.add(3, 5));
      System.out.println("aaddition of two  numbers:"+obj.add(3, 5,6));
       System.out.println("aaddition of two  numbers:"+obj.add(3, 5));
       
    }
    
}
