package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {
		
		@BeforeGroups
		public void beforeGroups() {
			System.out.println("super beforeGroups");
		}
		
		@AfterGroups
		public void afterGroups() {
			System.out.println("super afterGroups");
		}
		
		
		@Test(dataProvider = "dp")
		public void f(Integer n, String s) {
			System.out.println("super Test");
		}

		@BeforeMethod
		public void beforeMethod() {
			System.out.println("super beforeMethod");
		}

		@AfterMethod
		public void afterMethod() {
			System.out.println("super afterMethod");
		}

		@DataProvider
		public Object[][] dp() {
			return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
		}

		@BeforeClass
		public void beforeClass() {
			System.out.println("super beforeClass");
		}

		@AfterClass
		public void afterClass() {
			System.out.println("super afterClass");
		}

		@BeforeTest
		public void beforeTest() {
			System.out.println("super beforeTest");
		}

		@AfterTest
		public void afterTest() {
			System.out.println("super afterTest");
		}

		@BeforeSuite
		public void beforeSuite() {
			System.out.println("super beforeSuite");
		}

		@AfterSuite
		public void afterSuite() {
			System.out.println("super afterSuite");
		}

}
