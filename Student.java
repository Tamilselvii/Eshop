package constructoroL;

public class Student {

    int rollno;
    String name, address;

    public Student(String n, String ad, int rn) {
        name = n;
        address = ad;
        rollno = rn;
    }

    public void display() {
        System.out.println(name + "" + address + "" + rollno);
    }

    public static void main(String[] args) {
        Student s1 = new Student("java", "amabattur", 80);
        Student s2 = new Student("class", "chennai", 81);
        s1.display();
        s2.display();
    }

}
