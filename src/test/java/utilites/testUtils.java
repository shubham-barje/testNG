package utilites;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class testUtils extends BaseTest {
	public void getScreenShort() throws IOException{
		Date currentdate = new Date();
		String screenshortFilename = currentdate.toString().replace(" ","-").replace(":", "-");
		File ScreenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenShotFile, new File(".//screenshot//"+screenshortFilename+".png"));
		
	}
}
