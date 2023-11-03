package programs;
import java.util.Scanner;

class student{
	String name;
	String usn;
	int age;
	void get() {
Scanner sc=new Scanner(System.in);

System.out.println("enter the name:");
	name=sc.nextLine();
System.out.println("enter the usn:");
	usn=sc.nextLine();
System.out.println("enter age:");
    age=sc.nextInt();
	}
void print()
{
	System.out.println("name:"+name);
	System.out.println("usn:"+usn);
	System.out.println("age:"+age);
	}
}
public class student_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student obj=new student();
obj.get();
obj.print();
	}
}
