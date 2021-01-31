import java.util.Scanner;
class Student
{
int id;
String name;
int age;
int []marks=new int[4];
char g;
Scanner sc=new Scanner(System.in);
void read()
{
System.out.println("Enter Details of student:");
System.out.println("Enter id:");
id=sc.nextInt();
sc.nextLine();
System.out.println("Enter name:");
name=sc.nextLine();
System.out.println("Enter age:");
age=sc.nextInt();
System.out.println("Enter marks of Phy, che, maths, bio:");
for(int i=0;i<marks.length;i++) 
{
	marks[i]=sc.nextInt();
}	
}
void calgrade()
{
	int total=0,avg;
	
	for(int i=0;i<marks.length;i++)
		{
		total=total+marks[i];
		}
		avg=total/4;
	if(avg>90)
			g='A';
	 else if(avg>80)
			g='B';
	else if(avg>70)
			g='C';
	else if(avg>55)
			g='D';
	else
			g='E';
}
void display()
{
	System.out.println("id="+id);
	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("Grade="+g);
}
 

}
class StudentTest
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("How many student details you want to store");
		int n=sc.nextInt();
		Student std[]=new Student[n];
		for(int i=0;i<n;i++)
		{
		std[i]=new Student();
		std[i].read();
		}
		for(int i=0;i<n;i++)
		{
		std[i].calgrade();
		}
		for(int i=0;i<n;i++)
		{
		std[i].display();
		}		
		
	}
}