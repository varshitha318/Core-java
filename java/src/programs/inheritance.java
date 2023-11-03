package programs;

class Employee
{  
float salary=40000;  
}  

class b extends Employee{
	String name="abc";
}


public class  inheritance  extends b
{  
int age=22;  
public static void main(String args[])
{  

 inheritance  p=new  inheritance ();  
 System.out.println("Programmer salary is:"+p.salary); 
 System.out.println("name of Programmer is:"+p.name);  
 System.out.println("age of Programmer is:"+p.age);  
}  
}


