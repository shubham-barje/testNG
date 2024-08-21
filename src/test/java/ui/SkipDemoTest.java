package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	boolean datasetup = false;
	
	//method 1 use enabled
	@Test(enabled=false)
	public void skipTest1() {
		System.out.println("Skipping this test as it is not complete");
	}
	
	//method 2 use SkipException
	@Test
	public void skipTest2() {
		System.out.println("Skipping this test forcefully");
		throw new SkipException("Skipping this test");
	}
	
	
	//method 3 use if else
	@Test
	public void skipTest3() {
		System.out.println("Skipping this test forcefully");
		if(datasetup=true) {
			System.out.println("Execute the test");
		}else {
			System.out.println("Do not Execute the further steps ");
			throw new SkipException("Do not Execute the further steps");
		}
	}
}
