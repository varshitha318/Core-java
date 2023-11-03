package programs;
import java.util.*;
class students{
	int rollno;
	String name;
	float marks;
	public students(int rollno, String name, float marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "students [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
public class tostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      students obj1=new students(1,"abc",35);
      students obj2=new students(1,"abcd",45);
      students obj3=new students(1,"abcde",75);
      System.out.println(obj1);
      System.out.println(obj2);
      System.out.println(obj3);

	}

}
