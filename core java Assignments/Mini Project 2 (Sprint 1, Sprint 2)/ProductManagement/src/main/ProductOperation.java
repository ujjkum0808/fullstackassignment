package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import service.Productservice;
import bean.Product;
public class ProductOperation {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		Productservice ps=new Productservice();
		 HashMap hm=new HashMap<Integer, Product>();
		int num,a=100,count=0;
		boolean flag=true; 
		String id = null;
		float price;
		String name;
		
		//Deserialisation
		FileInputStream fis=new FileInputStream("newobjectfile.txt");
		ObjectInputStream in=new ObjectInputStream(fis);
		Product p1=(Product)in.readObject();
		System.out.println("id="+p1.getPid()+", Name="+p1.getPname()+", Price="+p1.getPrice());
		in.close();
		fis.close();
		
		
		do
		{
		System.out.println("1 for Add product\n2 for Update product\n3 for Delete product\n4 for Display all products\n5 for retrive price\n6 for exit.");
		int choose =sc.nextInt();
		switch(choose)
		{
		case 1:
				System.out.println("Add product");
				
				sc.nextLine();
				System.out.println("Enter product name:");
				name=sc.nextLine();
				System.out.println("Enter product price:");
				price=sc.nextFloat();
				id=ps.addProduct(a, name, price);
				a++;
				System.out.println("This Product Id="+id);
				break;
				
		case 2: System.out.println("Enter Your product id:");
				id=sc.next();
				hm=ps.displayAllProduct();
				Collection c1=hm.values();
				Iterator i1=c1.iterator();
				while(i1.hasNext())
				{
					Product pc=(Product)i1.next();
					if(pc.getPid().equals(id))
					{
						count=0;
						System.out.println("Enter price of product:");
						price=sc.nextFloat();
						num=ps.updateProduct(id, price);
						System.out.println("Price Updated...");
					}
					else
					{
						count=1;
						break;
					}
				}
				if(count==1)
				{
					System.out.println("Product Id is incorrect");
				}
				
				break;
			
		case 3: System.out.println("Enter product id:");
				id=sc.next();
				hm=ps.displayAllProduct();
				Collection c2=hm.values();
				Iterator i2=c2.iterator();
				
				while(i2.hasNext())
				{
					Product pc=(Product)i2.next();
					if(pc.getPid().equals(id))
					{
						count=0;
						num=ps.deleteProduct(id);
						System.out.println("Product Deleted...");
					}
					else
					{
						count=1;
						break;
					}
				}
				if(count==1)
				{
					System.out.println("Product Id is incorrect");
				}
				break;
			
		case 4: hm=ps.displayAllProduct();
				Collection c=hm.values();
				Iterator i=c.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
				break;
			
		case 5: System.out.println("Enter product Id:");
				id=sc.next();
				price=ps.retrieveProductPrice(id);
				System.out.println("Product price="+price);
				break;
			
		case 6: System.out.println("Thankyou...");
				flag=false;
				break;
			
		default:System.out.println("Invalied choice...");
				break;
		}
			
		
		
		}while(flag);

	}

}
