package day44DependencyGroupingtestng;

import org.testng.annotations.Test;

public class Group2 {
 
	  @Test( priority =1, groups = {"regression"})
	   void hello() {
		  
		  System.out.println("hello printing");
	  }
	  
	  @Test( priority =2, groups = {"regression"})
	   void bollo() {
		  
		  System.out.println("bollo printing");
	  }
	  
	  @Test( priority =3, groups = {"regression"})
	   void solo() {
		  
		  System.out.println("solo printing");
	  }
}
