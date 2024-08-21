package ui;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest {
	@Test
	public void reporterTest1() {
		Reporter.log("test1");
		System.out.println("This is test1");
	}
	
	@Test
	public void reporterTest2() {
		Reporter.log("test2");
		System.out.println("This is test2");
	}
	
	@Test
	public void reporterTest3() {
		Reporter.log("test3");
		System.out.println("This is test3");
	}
	
	@Test
	public void reporterTest4() {
		Reporter.log("test4");
		System.out.println("This is test4");
	}
	
}
