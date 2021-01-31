package testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Daolayer.ProductDao;
import bean.Product;

public class ProductDaoTest {
	static ProductDao pd;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pd=new ProductDao();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void testDisplayallproduct() {
		List<Product> listofproduct = pd.Displayallproduct();
		assertEquals(3,listofproduct.size());
	}

	//@Test
	public void testAddproduct() {
		Product p=new Product();
		p.setPid(106);
		p.setPname("mobile");
		p.setPrice(1700);
		int res=pd.Addproduct(p);
		int msg=1;
		assertEquals(msg,res);
	}

	//@Test
	public void testUpdateproduct() {
		Product p=new Product();
		p.setPid(101);
		p.setPrice(1600);
		int res	= pd.Updateproduct(p);
		assertEquals(1, res);
	}

	@Test
	public void testDeleteProduct() {
		Product p=new Product();
		p.setPid(102);
		int res=pd.DeleteProduct(p);
		assertEquals(1,res);
	}

}
