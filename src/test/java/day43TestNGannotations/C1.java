package day43TestNGannotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class C1 {
  @Test
  public void f() {
	  System.out.println("testing 1");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Aftersuite");
  }

}
