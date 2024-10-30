package day43TestNGannotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class C2 {
  @Test
  public void f() {
	  System.out.println("testing 2");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
	  
  }

  

}
