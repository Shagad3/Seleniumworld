package day43TestNGannotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsBeforeAfterMethod {
 
  @BeforeMethod //it will implement before evey test
  public void login() {
	  System.out.println("hello logged  in");
  }

  @AfterMethod  //it will implement before evey test
  public void logout() {
	  System.out.println("hello logged out");
  }
	
	@Test( priority = 1)
	void search () {
		System.out.println("hello searched  in");
		
	}
	@Test( priority = 2)
	void advancesearch () {
		System.out.println("hello Advsearched in");
		
	}

  
  

}
