package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	
	@Test
	public void titleTest() {
		//verification of title 
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		String actualTitle = driver.getTitle();
		
		//Assertion tool class. Presents assertion methods with a more natural parameter order. 
		//The orderis always actualValue, expectedValue [, message]. 
		//Important: Assertion methods comparing two values for equality, such as assertEquals, 
		//are only intended to test equality for an actual and an (un-)expectedresult value.

		Assert.assertEquals(expectedTitle, actualTitle);
		driver.close();
		
	}
}
