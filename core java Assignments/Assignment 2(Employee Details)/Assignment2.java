import java.util.Scanner;
class Assignment2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of details you want to store:");
int n=sc.nextInt();

int []id= new int[n];
String []name=new String[n];
float []salary=new float[n];
String []desg=new String[n];

for(int i=0;i<n;i++)
{
System.out.println("Enter id of employee "+(i+1));
id[i]=sc.nextInt();
sc.nextLine();

System.out.println("Enter name of employee "+(i+1));
name[i]=sc.nextLine();

System.out.println("Enter salary of employee "+(i+1));
salary[i]=sc.nextFloat();
sc.nextLine();

System.out.println("Enter designation of employee "+(i+1));
desg[i]=sc.nextLine();
System.out.println("\n");
}

for(int k=0;k<n;k++)
{
	float hra,da,pf;
	hra=salary[k]*0.1f;
	da=salary[k]*0.07f;
	pf=salary[k]*0.05f;
	if(desg[k].equals("manager"))
	{
		salary[k]=(salary[k]+hra+da-pf)+(salary[k]*0.15f);
		System.out.println("\n");
		System.out.println("Details of Employee:"+(k+1));
		System.out.println("id="+id[k]);
		System.out.println("Name="+name[k]);
		System.out.println("Salary="+salary[k]);
		System.out.println("Designation="+desg[k]);
	}
	else if(desg[k].equals("developer"))
	{
		salary[k]=(salary[k]+hra+da-pf)+(salary[k]*0.1f);
		System.out.println("\n");
		System.out.println("Details of Employee:"+(k+1));
		System.out.println("id="+id[k]);
		System.out.println("Name="+name[k]);
		System.out.println("Salary="+salary[k]);
		System.out.println("Designation="+desg[k]);
	}
	else
	{
		salary[k]=(salary[k]+hra+da-pf)+(salary[k]*0.05f);
		System.out.println("\n");
		System.out.println("Details of Employee:"+(k+1));
		System.out.println("id="+id[k]);
		System.out.println("Name="+name[k]);
		System.out.println("Salary="+salary[k]);
		System.out.println("Designation="+desg[k]);
	}
}
}
}