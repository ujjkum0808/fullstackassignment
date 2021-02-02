package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import bean.Product;

public class Productservice implements Serializable
{
	HashMap hm = new HashMap<String, Product>();
	String pid = "I";
	String ppid = "I";
	
	
	public String addProduct(int a, String name,float price) throws IOException
	{
		pid = ppid + a;
		Product pd = new Product(pid,name,price);
		FileOutputStream fs=new FileOutputStream("newobjectfile.txt");
		ObjectOutputStream out=new ObjectOutputStream(fs);
		out.writeObject(pd);
		out.close();
		fs.close();
		hm.put(pid,pd);
		return pid;
	}
	
	public int updateProduct(String pid,float price)
	{
		Product p = (Product) hm.get(pid);
		p.setPrice(price);
		
		return 1;
	}
	
	public int deleteProduct(String pid)
	{
		hm.remove(pid);
		return 1;
	}
	
	public HashMap displayAllProduct() 
	{		
		return hm;
	}
	
	public float retrieveProductPrice(String pid)
	{
		Product p = (Product) hm.get(pid);
		return p.getPrice();
	}
	
}
