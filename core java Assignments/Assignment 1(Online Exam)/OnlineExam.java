import java.util.Scanner;
public class OnlineExam
{
public static void main(String args[])
{
System.out.println("Online Examination System");
Scanner sc=new Scanner(System.in);
int choice;
int c=0,d=0,e=0,n=3,marks1=0,marks2=0,marks3=0;
do{
System.out.println("Press 1 for English \nPress 2 for Maths \nPress 3 for GK ");
choice=sc.nextInt();

switch(choice)
{
	case 1:if(c==0)
			{
			System.out.println("Welcome to English Examination");
			System.out.println("1.Please,stop.....so many mistakes.");
			System.out.println("1. to make\n2. make\n3. making\n4. makes");
			int p1=sc.nextInt();
			if(p1==3)
			{
				marks1=marks1+10;
			}
			else{
				System.out.println("Wrong Answer.");
			}
			System.out.println("2.The English.....English");
			System.out.println("1. speak\n2. spoke\n3. spoken\n4. is spoken");
			int p2=sc.nextInt();
			if(p2==1)
			{
				marks1=marks1+10;
			}
			else{
				System.out.println("Wrong Answer.");
			}
			System.out.println("3.The rain comes.....the clouds.");
			System.out.println("1. in\n2. near\n3. from\n4. under");
			int p3=sc.nextInt();
			if(p3==3)
			{
				marks1=marks1+10;
			}
			else{
				System.out.println("Wrong Answer.");
			}
			System.out.println("This Section Completed successfully...");
			c++;	
			n--;
	        break;
			}
			else{
			System.out.println("You have already done this section");
			break;
			}
	case 2:if(d==0)
			{
			System.out.println("Welcome to Maths Examination");
			System.out.println("1.Can we write 0 in the form of p/q?");
			System.out.println("1. Yes\n2. No\n3. Cannot be explained\n4. None of the above");
			int q1=sc.nextInt();
			if(q1==1)
			{
				marks2=marks2+10;
			}
			else{
				System.out.println("Wrong Answer.");
			}
			System.out.println("2.Every rational number is:");
			System.out.println("1. Whole number\n2. Natural number\n3. Integer\n4. Real number");
			int q2=sc.nextInt();
			if(q2==4)
			{
				marks2=marks2+10;
			}
			else{
				System.out.println("Wrong Answer.");
			}
			System.out.println("3.If the coordinates of a point are(0,-4),then it lies in:");
			System.out.println("1. X-axis\n2. Y-axis\n3. At origin\n4. Between x-axis and y-axis");
			int q3=sc.nextInt();
			if(q3==2)
			{
				marks2=marks2+10;
			}
			else{
				System.out.println("Wrong Answer.");
			}
			System.out.println("This Section Completed successfully...");
			d++;
			n--;
			break;
			}
			else{
			System.out.println("You have already done this section");
			break;
			}
	case 3:if(e==0)
			{
			System.out.println("Welcome to GK Examination");
			System.out.println("1.Which is longest river in the world?");
			System.out.println("1. Ganga\n2. Nile\n3. Amazon\n4. Niger");
			int r1=sc.nextInt();
			if(r1==2)
			{
				marks3=marks3+10;
			}
			else{
				System.out.println("Wrong Answer.");
			}
			System.out.println("2.Which is the biggest continent in the world?");
			System.out.println("1. North America\n2. Aisa\n3. Africa\n4. Australia");
			int r2=sc.nextInt();
			if(r2==2)
			{
				marks3=marks3+10;
			}
			else{
				System.out.println("Wrong Answer.");
			}
			System.out.println("3.Which is india's first super computer?");
			System.out.println("1. Param8000\n2. param80000\n3. param800\n4. param8");
			int r3=sc.nextInt();
			if(r3==1)
			{
				marks3=marks3+10;
			}
			else{
				System.out.println("Wrong Answer.");
			}
			System.out.println("This Section Completed successfully...");
			e++;
			n--;
			break;
			}
		else{
			System.out.println("You have already done this section");
			break;
			}
	default:System.out.println("invalied choice...");
	
}
if(n!=0)
{
System.out.println("Do you want to continue with another section?\nPress 1 for YES \nPress 2 for NO ");
int ch=sc.nextInt();

switch(ch)
{
	case 1:System.out.println("YES");
			break;
	case 2:System.out.println("NO");
			if(c==0 || d==0 || e==0)
			{
				System.out.println("You have not completed the Exam...Please Complete");
			}
			break;
	default:System.out.println("invalied choice...");
}
}
else{
	System.out.println("Exam Completed");
	System.out.println("Thank You");
}

}while(n!=0);
int result=0;
System.out.println("Marks in english="+marks1);
System.out.println("Marks in maths="+marks2);
System.out.println("Marks in GK="+marks3);
int totalmarks=marks1+marks2+marks3;
System.out.println("Total Marks="+totalmarks);
if(totalmarks>=70)
{
	result=totalmarks+10;
	System.out.println("Final Marks="+result);
}
if(result>=90)
{
	System.out.println("Congratulations. You are Selected");	
}
else{
	System.out.println("Sorry, not passed. Please try next time");
}


}
}