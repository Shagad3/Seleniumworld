package day43TestNGannotations;

import org.testng.annotations.Test;

import org.testng.Assert;

public class HardAssertions {
  @Test
  public void f() {
	  //hard assertions are below
	  Assert.assertEquals(123, 123);
	  System.out.println("hello passed");
	  Assert.assertEquals("XYZ", "pXYZ");
	  System.out.println("hello Failed");
  Assert.assertEquals(123, 123);
  System.out.println("hello passed");
	 Assert.assertEquals("123", 123);
	 System.out.println("hello passed");
	  Assert.assertEquals("XYZ", "pXYZ");
	  System.out.println("hello Failed");
	 // Assert.assertEquals("XYZ", "xyz");
	 // Assert.assertEquals("XYZ", 123);
	 //Assert.assertTrue(1==2); 
	// Assert.assertNotEquals("XYZ", 123);
	 // Assert.assertTrue(1==1); 
	//Assert.assertFalse(1==2); 
	  //Assert.assertFalse(1==1);
	// Assert.fail(); 
	  
	  
	  
  }
}
