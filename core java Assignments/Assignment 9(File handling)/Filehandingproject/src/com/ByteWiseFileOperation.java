package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;



public class ByteWiseFileOperation {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		FileInputStream fis= new FileInputStream("C:\\Users\\HP\\Desktop\\filehanding.txt");
		FileOutputStream fos=new FileOutputStream("info.txt");
		
		System.out.println("1 for copy file in Uppercase\n2 for copy file in Lowercase\n3 for copy all sentence first letter in uppercase\n4 for disply number of character\n5 for disply no of words in file\n ");
		int choose=sc.nextInt();
		int ch,count=0;
		
		switch(choose)
		{
		case 1: while((ch=fis.read())!=-1)
				{
					if(Character.isLowerCase(ch))
						{
							ch=Character.toUpperCase(ch);
						}
					fos.write(ch);
				}
				fis.close();
				fos.close();
				System.out.println("File copied...");
				break;			
		case 2: while((ch=fis.read())!=-1)
				{
					if(Character.isUpperCase(ch))
						{
							ch=Character.toLowerCase(ch);
						}
					fos.write(ch);
				}
				fis.close();
				fos.close();
				System.out.println("File copied...");
				break;
					
		case 3: BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Sentence");
				String str1;
				str1=br1.readLine();
				char chr[]=str1.toCharArray();
				for(int i=0;i<str1.length();i++)
				{
					if(i==0 && chr[i]!=' ' && chr[i]!='\n' || chr[i-1]=='.')
					{
						if(chr[i]>='a' && chr[i]<='z')
						{
							chr[i]=(char) (chr[i]-'a'+'A');
						}
					}
				}
				String s=new String(chr);
				System.out.println(s);
				break;
		case 4: while((ch=fis.read())!=-1)
				{

					if(Character.isLetter(ch))
					{
					count=count+1;
					}
					fos.write(ch);
				}
				System.out.println("number of character="+count);
				fis.close();
				fos.close();
				break;
		case 5: FileReader fr=new FileReader("C:\\Users\\HP\\Desktop\\filehanding.txt");
				BufferedReader br=new BufferedReader(fr);
				String c;
				
				while((c=br.readLine())!=null)
				{
					String[] words=c.split(" ");
					count=count+words.length;
				}
				System.out.println("number of words="+count);
				br.close();
				break;
		default: System.out.println("Invalied choice");
		}
	}

}
