import java.util.Scanner;
class Employee
{
int id;
String name;
float salary;
Scanner sc=new Scanner(System.in);
Address add=new Address();
void read()
{
	System.out.println("Enter id:");
	id=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Name:");
	name=sc.nextLine();
	System.out.println("Enter salary:");
	salary=sc.nextFloat();
}
void calsalary()
{
	float hra,da,pf;
	hra=salary*0.1f;
	da=salary*0.07f;
	pf=salary*0.05f;
	salary=salary+hra+da-pf;
}
void display()
{
	System.out.println("\n");
	System.out.println("Id="+id);
	System.out.println("name="+name);
	System.out.println("salary="+salary);
}
}
//..........................................................................
class Manager extends Employee
{
int number;
void readmgr()
{
	System.out.println("Enter Number of Employee:");
	number=sc.nextInt();
	add.readadd();
}
void dismgr()
{
	System.out.println("Number of Employee="+number);
	add.disadd();
}
}
//.......................................................................
class Programmer extends Employee
{
String projectname;
void readprg()
{
	sc.nextLine();
	System.out.println("Enter name of project:");
	projectname=sc.nextLine();
	add.readadd();
}
void disprg()
{
	System.out.println("Project="+projectname);
	add.disadd();
}
}
//.......................................................................
class Address
{
String city,state;
int pincode;
Scanner obj=new Scanner(System.in);
void readadd()
{	
	System.out.println("Enter city:");
	city=obj.nextLine();
	System.out.println("Enter state:");
	state=obj.nextLine();
	System.out.println("Enter pincode:");
	pincode=obj.nextInt();
}
void disadd()
{
	System.out.println("city="+city);
	System.out.println("state="+state);
	System.out.println("pincode="+pincode);
}	
}
//.......................................................................
class Employeetesting
{
public static void main(String args[])
{
	System.out.println("Manager Details");
	Manager mgr=new Manager();
	mgr.read();
	mgr.readmgr();
	
	System.out.println("Programmer Details");
	Programmer prg=new Programmer();
	prg.read();
	prg.readprg();
	
	mgr.calsalary();
	prg.calsalary();
	
	mgr.display();
	mgr.dismgr();
	
	prg.display();
	prg.disprg();

}
}