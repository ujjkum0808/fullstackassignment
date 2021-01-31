import java.util.Scanner;
class EmployeeDetails
{
Scanner sc=new Scanner(System.in);

int n;
EmployeeDetails(int size)
{
n=size;
id=new int [size];
name=new String [size];
salary=new float [size];
salarycpy=new float[size];
desg=new String [size];
}
int []id;
String []name;
float []salary;
float []salarycpy;
String []desg;
//......................................................................
void read()
{
for(int i=0;i<n;i++)
{
System.out.println("Enter id of employee "+(i+1));
id[i]=sc.nextInt();
sc.nextLine();

System.out.println("Enter name of employee "+(i+1));
name[i]=sc.nextLine();

System.out.println("Enter salary of employee "+(i+1));
salary[i]=sc.nextFloat();
salarycpy[i]=salary[i];
sc.nextLine();

System.out.println("Enter designation of employee "+(i+1));
desg[i]=sc.nextLine();
System.out.println("\n");
}
}
//....................................................................
void calsalary()
{
for(int k=0;k<n;k++)
{
	float hra,da,pf;
	hra=salary[k]*0.1f;
	da=salary[k]*0.07f;
	pf=salary[k]*0.05f;
	salary[k]=salary[k]+hra+da-pf;
}
}
//.....................................................................
void bonus()
{
for(int k=0;k<n;k++)
{
	salary[k]=salarycpy[k];
	float hra,da,pf;
	hra=salary[k]*0.1f;
	da=salary[k]*0.07f;
	pf=salary[k]*0.05f;
	if(desg[k].equals("manager"))
	{
		salary[k]=(salary[k]+hra+da-pf)+(salary[k]*0.15f);
	}
	else if(desg[k].equals("developer"))
	{
		salary[k]=(salary[k]+hra+da-pf)+(salary[k]*0.1f);
	}
	else
	{
		salary[k]=(salary[k]+hra+da-pf)+(salary[k]*0.05f);
	}
}	
}
//.......................................................................
void display()
{
for(int k=0;k<n;k++)
{
	System.out.println("Details of Employee:"+(k+1));
	System.out.println("id="+id[k]);
	System.out.println("Name="+name[k]);
	System.out.println("Salary="+salary[k]);
	System.out.println("Designation="+desg[k]);
	System.out.println("\n");
}	
}

}
//........................................................................
class EmployeeTest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of records you want to store:");
int x=sc.nextInt(); 
EmployeeDetails empd=new EmployeeDetails(x);
empd.read();
empd.calsalary();
empd.bonus();
empd.display();
}
}