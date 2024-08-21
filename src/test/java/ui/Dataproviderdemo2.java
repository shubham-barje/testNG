package ui;

import org.testng.annotations.Test;

public class Dataproviderdemo2 {
	@Test(dataProvider = "create",dataProviderClass=Dataproviderdemo2a.class)
	public void test(String username, String password) {
		System.out.println(username + "==" + password);

	}
	
	@Test(dataProvider="create",dataProviderClass=Dataproviderdemo2a.class)
	public void test1(String username,String password,String test) {
		System.out.println(username + "==" + password+"=="+test);
	}
}
