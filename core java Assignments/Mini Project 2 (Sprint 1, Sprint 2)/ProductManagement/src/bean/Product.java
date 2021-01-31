package bean;

import java.io.Serializable;

public class Product implements Serializable
{
	
	private String pid;
	private String pname;
	private float price;
	
	public Product(String pid, String pname, float price) 
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getPid() 
	{
		return pid;
	}
	public void setPid(String pid) 
	{
		this.pid = pid;
	}
	
	public String getPname() 
	{
		return pname;
	}
	public void setPname(String pname) 
	{
		this.pname = pname;
	}
	
	public float getPrice() 
	{
		return price;
	}
	public void setPrice(float price) 
	{
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product id=" + pid + ", pname=" + pname + ", price=" + price + "";
	}
		
}