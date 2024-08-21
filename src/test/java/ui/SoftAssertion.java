package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertion {
	@Test
	public void testSoftAssertion() {
		//SoftAssert ---> When an assertion fails, don't throw an exception but 
		//record the failure. Calling assertAll() will cause an 
		//exception to be thrown if at least one assertion failed.

		SoftAssert softAssertion = new SoftAssert ();
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		String expectedText = "Search";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		String actualTitle = driver.getTitle();
		
		softAssertion.assertEquals(expectedTitle, actualTitle,"done...");
		softAssertion.assertEquals(expectedText, actualText,"done..");
		
		softAssertion.assertAll();
		driver.close();
	}
}
