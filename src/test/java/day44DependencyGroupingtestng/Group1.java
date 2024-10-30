package day44DependencyGroupingtestng;

import org.testng.annotations.Test;

public class Group1 {

  @Test( priority=1,groups= {"Sanity"})
  void one1() {
	  
	  System.out.println("one printing");
  }
  
  @Test( priority=2,groups= {"Sanity"})
   void two2() {
	  
	  System.out.println("two printing");
  }
  
  @Test( priority=3,groups= {"Sanity"})
   void three3() {
	  
	  System.out.println("three printing");
  }
  
}
