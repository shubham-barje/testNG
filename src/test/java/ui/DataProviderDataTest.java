package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDataTest {
	@Test(dataProvider = "dataSet")
	public void test(String username, String password) {
		System.out.println(username + "==" + password);

	}
	
	@Test(dataProvider = "create")
	public void Test1(String username,String password,String test){
		System.out.println(username+"="+password+"="+test);
	}

	@DataProvider(name ="create")
	public Object[][] dataSet1() {
		Object[][] dataSet1 = { { "username", "password","test" }, { "username1", "password1","test1" } };
		return dataSet1;
	}

	// Mark a method as supplying data for a test method.
	@DataProvider
	public Object[][] dataSet() {
		Object[][] dataSet = new Object[4][2];

		// first row
		dataSet[0][0] = "user1";
		dataSet[0][1] = "pass1";

		// Second row
		dataSet[1][0] = "user2";
		dataSet[1][1] = "pass2";

		// Third row
		dataSet[2][0] = "user3";
		dataSet[2][1] = "pass3";

		// fourth row
		dataSet[3][0] = "user4";
		dataSet[3][1] = "pass4";

		return dataSet;

	}
}
