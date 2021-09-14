package testng;

import org.testng.annotations.Test;

public class Test3 {
 

	@Test(dataProvider = "dp",dataProviderClass = Test2.class,invocationCount=1,threadPoolSize=2)
	public void f(Integer n, String s) {
		System.out.println("super Test");
	}
}
