package day44DependencyGroupingtestng;

import org.testng.annotations.Test;

public class Group3 {
	 @Test( priority =1, groups = {"regression","sanity"})
	   void hello1() {
		  
		  System.out.println("hello1 printing");
	  }
	  
	  @Test( priority =2, groups = {"regression","sanity"})
	   void bollo2() {
		  
		  System.out.println("bollo2 printing");
	  }
	  
	  @Test( priority =3, groups = {"regression","sanity"})
	   void solo3() {
		  
		  System.out.println("solo3 printing");
	  }
}

