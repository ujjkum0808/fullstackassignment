package Daolayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import bean.Product;
public class ProductDao {
	public List<Product> Displayallproduct()
	{
		List<Product> listofproduct=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "ujjwal");
			PreparedStatement pstmt = con.prepareStatement("select * from product");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				p.setStoreDate(rs.getString(4));
				listofproduct.add(p);
				
			}
		}
		catch(Exception e)
		{
			
		}
		return listofproduct;
	}
	
	public List<Product> DisplayallproductAsc()
	{
		List<Product> listofproduct=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "ujjwal");
			PreparedStatement pstmt = con.prepareStatement("select * from product order by price ASC");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				p.setStoreDate(rs.getString(4));
				listofproduct.add(p);
				
			}
		}
		catch(Exception e)
		{
			
		}
		return listofproduct;
	}
	
	public List<Product> DisplayallproductNameAsc()
	{
		List<Product> listofproduct=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "ujjwal");
			PreparedStatement pstmt = con.prepareStatement("select * from product order by pname ASC");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				p.setStoreDate(rs.getString(4));
				listofproduct.add(p);
				
			}
		}
		catch(Exception e)
		{
			
		}
		return listofproduct;
	}
	
	public List<Product> DisplayallproductNameDesc()
	{
		List<Product> listofproduct=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "ujjwal");
			PreparedStatement pstmt = con.prepareStatement("select * from product order by pname DESC");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				p.setStoreDate(rs.getString(4));
				listofproduct.add(p);
				
			}
		}
		catch(Exception e)
		{
			
		}
		return listofproduct;
	}
	
	public List<Product> DisplayallproductDesc()
	{
		List<Product> listofproduct=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "ujjwal");
			PreparedStatement pstmt = con.prepareStatement("select * from product order by price DESC");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				p.setStoreDate(rs.getString(4));
				listofproduct.add(p);
				
			}
		}
		catch(Exception e)
		{
			
		}
		return listofproduct;
	}
	
	public int Addproduct(int i,String j,float k)
	{
		Product p=new Product();
		p.setPid(i);
		p.setPname(j);
		p.setPrice(k);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "ujjwal");
			PreparedStatement pstmt=con.prepareStatement("insert into product values(?,?,?,?)");
			pstmt.setInt(1, p.getPid());
			pstmt.setString(2, p.getPname());
			pstmt.setFloat(3, p.getPrice());
			pstmt.setDate(4, null);
			int res1=pstmt.executeUpdate();	
		}
		catch(Exception e)
		{
			
		}
		return p.getPid();
	}
	public void Updateproduct(int id,float price)
	{
		int i=id;
		float p=price;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "ujjwal");
			PreparedStatement stmt=con.prepareStatement("Update product set price=? where pid=?");
			stmt.setFloat(1, p);
			stmt.setInt(2, i);
			int res1=stmt.executeUpdate();
		}
		catch(Exception e)
		{
			
		}
	}
	public void Deleteproduct(int id)
	{
		int did=id;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "ujjwal");
			PreparedStatement pstmt=con.prepareStatement("delete from product where pid=?");
			pstmt.setInt(1, did);
			int res1=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			
		}
	}

	

}
