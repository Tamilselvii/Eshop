
package factorial;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Factorial Number:");
    int n=scanner.nextInt();
    int result=Factorial(n);
    System.out.println("the factorial of "+ n +" is" +result  );
}
    public static int Factorial(int n)
    {
      int result=1;
      for(int i=1;i<n;i++)
          result=result*i;
      
    
    return result;
    }
}
    
    

