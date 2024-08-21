package ui;

import org.testng.annotations.Test;

//groups are used to defined the type of test like regression,smoke test etc..
@Test(groups="user-registration")
public class GroupDemoTest {
	@Test(priority=1,groups="regression",description="first test")
	public void aTest1() {
		System.out.println("test1");
	}
	
	@Test(priority=2,groups={"regression","bvt"})
	public void bTest2() {
		System.out.println("test2");
	}
	
	@Test(groups="regression")
	public void aTest3() {
		System.out.println("test3");
	}
}
