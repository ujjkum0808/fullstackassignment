package service;

import java.io.Serializable;
import java.util.HashMap;

import bean.Product;

public class Productservice implements Serializable
{
	HashMap hm = new HashMap<String, Product>();
	String pid = "pid";
	String ppid = "pid";
	
	
	public String addProduct(int a, String name,float price)
	{
		pid = ppid + a;
	
		Product pd = new Product(pid,name,price);
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
