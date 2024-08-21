package ui;

import org.testng.annotations.Test;

public class LoginTest {
	@Test(priority = 1)
	public void bloginTest()
	{
		System.out.println("login done");
	}
	@Test(priority = 2)
	public void aloginTest()
	{
		System.out.print("login done");
	}
}
//TestNg run the test according to the alphabetically ordered test so we set the priority 
//for this (priority = 1)
//It gives priority for test method.Lower priorities will be schedule first