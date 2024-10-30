package day44DependencyGroupingtestng;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependencyMethods {
	SoftAssert sr ;
	
  @Test( priority =1)
  public void openapp() {
	  String a="a";
	  String b="a";
	  Assert.assertEquals(a, b);
	  System.out.println("hello1");
	  
  }
  @Test( priority =2, dependsOnMethods= {"openapp"})
  public void login() {
	  
	  Assert.assertTrue(true);
	  System.out.println("hello2");
  }
  @Test( priority =3, dependsOnMethods= {"login"})
  public void search() {
	  
	  
	  Assert.assertTrue(true);
	  System.out.println("hello3");
  }
  @Test( priority =4, dependsOnMethods= {"login","search"})
  public void advsearch() {
	  System.out.println("hello4");
	  Assert.assertTrue(true);
	  
  }
  
  @Test( priority =5, dependsOnMethods= {"login"})
  public void logout() {
	  
	  Assert.assertTrue(true);
  }
  
  
}
