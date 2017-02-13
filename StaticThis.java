
package staticthis;
public class StaticThis {
    int box1;
  static int box2;
  public StaticThis()
  {
    this. box1++;
    this. box2++;
             
  }

   
    public static void main(String[] args) {
        StaticThis st1=new StaticThis();
        System.out.println(st1.box1);
        System.out.println(st1.box2);
        StaticThis st2=new StaticThis();
        System.out.println(st2.box1);
        System.out.println(st2.box2);
        
       
    }
    
}
