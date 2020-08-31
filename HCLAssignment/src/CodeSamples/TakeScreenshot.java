package CodeSamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TakeScreenshot {

	public static void TakeScreenshots(WebDriver driver) {
		
		//********EventFiringWebDriver to capture screenshots***********
		
		EventFiringWebDriver et = new EventFiringWebDriver(driver);
		
		File f1 = et.getScreenshotAs(OutputType.FILE);
		
		try {
			//*****Saving screenshots within project********
			//*******This method call in another class file to capture screenshot***********
			
			FileUtils.copyFile(f1, new File("/HCLAssignment/Screenshots/screenshot.png"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
	

		
