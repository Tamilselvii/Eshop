package setter.java;
public class Setget {
    private String name;
    private int id;
  public String getname()
  {
      return name;
  }
  public void setname(String name)
  {
      this.name=name;
  }
  public int getId(){
      return id;
  }
  public void setId(int id)
  {
      this.id=id;
  }
public static void main(String[] args) {
    Setget sg=new Setget();
    sg.setname("java");
    sg.setId(5);
    System.out.println(sg.getname());
    System.out.println(sg.getId());
    
    
}
    
        
    }
    

