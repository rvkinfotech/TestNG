package demo.parameters;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
 
  @Parameters({"name"})
  @Test
  public void f(@Optional("Vihaan") String name) {
	  System.out.println(name);
  }
  
  @Parameters({ "datasource", "jdbcDriver" })
  @BeforeMethod
  public void beforeTest(String ds, String driver) {
 System.out.println(ds);
 System.out.println(driver);
  }

}
