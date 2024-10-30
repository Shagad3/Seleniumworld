package day43TestNGannotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
  @Test
  public void f() {
	  SoftAssert sa =new SoftAssert();
	    sa.assertEquals(123, 123);
		sa.assertEquals("123", 123);
		sa.assertEquals("XYZ", "XYZ");
		sa.assertEquals("XYZ", "xyz");
		sa.assertEquals("XYZ", 123);
		sa.assertTrue(1==2); 
		sa.assertNotEquals("XYZ", 123);
		sa.assertTrue(1==1); 
		sa.assertFalse(1==2); 
		sa.assertFalse(1==1);
		System.out.println("assert");
		sa.assertAll();
  }
}
