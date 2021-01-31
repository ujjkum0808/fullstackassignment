import java.util.Scanner;
public class StringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of strings:");
		int n=sc.nextInt();
		
		String []str=new String[n];
	
		System.out.println("Enter strings:");
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				String str1 = str[i];
				String str2 = str[j];
				int c=str1.compareToIgnoreCase(str2);
				if(c<0)
				{
					String str3=str[j];
						   str[j]=str[i];
					       str[i]=str3;
				}	
			}
		}	
		System.out.println("\n");
			for(int i=0;i<n;i++)
			{
				System.out.println(str[i]);
			}
	}
}
