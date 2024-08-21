package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class BeforeGoups_BeforeClass extends CommonDataSetup {
	@BeforeClass
	public void beforeClass() {
	System.out.println("BeforeClass");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("AfterClass");
	}
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(priority=1,groups="regression")
	public void Test2() {
		System.out.println("Test2");
	}@Test
	public void Test3() {
		System.out.println("Test3");
	}
	@BeforeGroups(value="regression")
	public void beforeGroup()
	{
		System.out.println("beforeGroup");
	}
	@AfterGroups(value="regression")
	public void afterGroups() {
		System.out.println("afterGroups");
	}
	
}
