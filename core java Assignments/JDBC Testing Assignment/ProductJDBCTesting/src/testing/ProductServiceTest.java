package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import service.ProductService;
import bean.Product;
import java.util.*;

public class ProductServiceTest {
	static ProductService ps;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		ps=new ProductService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception
	{
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("After");
	}

	//@Test
	public void testDisplayallproduct() 
	{
		List<Product> listofproduct = ps.Displayallproduct();
		assertEquals(3,listofproduct.size());
	}

	//@Test
	public void testAddproduct()
	{
		Product p=new Product();
		p.setPid(104);
		p.setPname("charger");
		p.setPrice(1700);
		String res=ps.Addproduct(p);
		String msg="Recored Added Successfully";
		assertEquals(msg,res);
	}

	//@Test
	public void testUpdateproduct()
	{
		Product p=new Product();
		p.setPid(101);
		p.setPrice(1200);
		String res	= ps.Updateproduct(p);
		assertEquals("Product Updated Successfully", res);
	}

	//@Test
	public void testDeleteproduct()
	{
		Product p=new Product();
		p.setPid(103);
		String res=ps.DeleteProduct(p);
		assertEquals("Product deleted",res);
	}
	
	//@Test
	public void testDisplayProductBYPriceASC()
	{
		List<Product> listofproduct=ps.DisplayProductBYPriceASC();
		assertEquals(3, listofproduct.size());
		Product p= listofproduct.get(0);
		assertEquals("Earphone", p.getPname());
		Product p1= listofproduct.get(1);
		assertEquals("charger", p1.getPname());
		Product p2= listofproduct.get(2);
		assertEquals("TV", p2.getPname());		
	}
	
	//@Test
	public void testDisplayProductBYPriceDESC()
	{
		List<Product> listofproduct=ps.DisplayProductBYPriceDESC();
		assertEquals(3, listofproduct.size());
		Product p= listofproduct.get(0);
		assertEquals("TV", p.getPname());
		Product p1= listofproduct.get(1);
		assertEquals("charger", p1.getPname());
		Product p2= listofproduct.get(2);
		assertEquals("Earphone", p2.getPname());		
	}
	
	@Test
	public void testDisplayProductBYNameASC()
	{
		List<Product> listofproduct=ps.DisplayProductBYNameASC();
		assertEquals(2, listofproduct.size());
		Product p= listofproduct.get(0);
		assertEquals("Earphone", p.getPname());
		/*Product p1= listofproduct.get(1);
		assertEquals("Earphone", p1.getPname());
		Product p2= listofproduct.get(2);
		assertEquals("TV", p2.getPname());*/		
	}
	//@Test
	public void testDisplayProductBYNameDESC()
	{
		List<Product> listofproduct=ps.DisplayProductBYNameDESC();
		assertEquals(2, listofproduct.size());
		Product p= listofproduct.get(0);
		assertEquals("mobile", p.getPname());
		/*Product p1= listofproduct.get(1);
		assertEquals("Earphone", p1.getPname());
		Product p2= listofproduct.get(2);
		assertEquals("TV", p2.getPname());*/		
	}

}
