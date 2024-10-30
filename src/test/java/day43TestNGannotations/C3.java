package day43TestNGannotations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class C3 {
  @Test
  public void f() {
	  System.out.println("testing 3");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("After test");
	  
  }

}
