package pkgTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

class RectangleTest {

	@Test
	public void Rectangle_Test1() {
		Rectangle r = new Rectangle(5,5);
		assertTrue(r.getiWidth()==5);
	}
	
	@Test
	public void getiWidth_Test1() {
		Rectangle r = new Rectangle(2,2);
		assertTrue(r.getiWidth()==2);
	}
	
	@Test
	public void setiWidth_Test1() {
		Rectangle r = new Rectangle(1,1);
		r.setiWidth(2);
		assertTrue(r.getiWidth()==2);
	}
	
	@Test
	public void getiLength_Test1() {
		Rectangle r = new Rectangle(1,1);
		assertTrue(r.getiLength()==1);
	}
	
	@Test
	public void setiLength_Test1() {
		Rectangle r = new Rectangle(3,3);
		r.setiLength(2);
		assertTrue(r.getiLength()==2);
	}
	
	@Test
	public void area_Test1() {
		Rectangle r = new Rectangle(1,2);
		assertTrue(r.area()==2.0);
	}
	
	@Test
	public void area_Test2() {
		Rectangle r = new Rectangle(2,2);
		assertTrue(r.area()==4.0);
	}
	
	
	@Test
	public void perimeter_Test1() throws Exception {
		Rectangle r = new Rectangle(1,1);
		assertTrue(r.perimeter()==4.0);
	}
	
	@Test
	public void perimeter_Test2() throws Exception {
		Rectangle r = new Rectangle(5,6);
		assertTrue(r.perimeter()==22.0);
	}
	
	@Test
	public void compareTo_Test1(){
		Rectangle r1 = new Rectangle(1,1);
		Rectangle r2 = new Rectangle(2,3);
		
		assertTrue(r1.compareTo(r2)<0);
	}
	
	@Test
	public void compareTo_Test2(){
		Rectangle r1 = new Rectangle(1,1);
		Rectangle r2 = new Rectangle(1,1);
		
		assertTrue(r1.compareTo(r2)==0);
	}
	
	@Test
	public void compareTo_Test3(){
		Rectangle r1 = new Rectangle(2,3);
		Rectangle r2 = new Rectangle(1,1);
		
		assertTrue(r1.compareTo(r2)>0);
	}
	
	@Test
	public void compareTo_Test4(){
		Rectangle r1 = new Rectangle(3,5);
		Double d = new Double(5.0);
		
		try 
		{
			r1.compareTo(d);
			fail("expected exception was not occured.");
		}
		catch(Exception e)
		{
		}
	}
	

}
