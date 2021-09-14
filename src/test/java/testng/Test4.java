package testng;

import org.testng.annotations.Test;

public class Test4 {
  
	 @Test(groups = { "functest", "checkintest" })
	  public void testMethod1() {
	  }
	 
	  @Test(groups = {"functest", "checkintest"} )
	  public void testMethod2() {
	  }
	 
	  @Test(groups = { "functest" })
	  public void testMethod3() {
	  }

}
