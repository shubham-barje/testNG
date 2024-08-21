package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Dataproviderdemo2a {
	//Mark a method as supplying data for a test method.
	@DataProvider(name ="create")
	public Object[][] dataSet1(Method m) {
		
		Object[][] testdata = null;
		
		if(m.getName().equals("test"))
		{
			testdata = new Object[][]
					{ 
						{ "username", "password" }, 
						{ "username1", "password1" } 
				};
		}
		else if(m.getName().equals("test1")) 
		{
			testdata =new Object[][] 
					{
						{ "username", "password","test" }, 
						{ "username1", "password1","test1" } 
					};
		}
		return testdata;
	}
	

	
}
