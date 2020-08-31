package CodeSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HCLWebsiteAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//********Landing to HCL Website*********

		driver.get("https://www.hcl.com/");
		
		driver.manage().window().maximize();
		
		//******Navigating to next page**************

		WebElement e1 = driver.findElement(By.xpath("//*[text()='Who we are ']"));

		Actions a1 = new Actions(driver);

		a1.moveToElement(e1).perform();

		driver.findElement(By.xpath("(//*[@class='leaf'])[2]")).click();
		
		//******Verifying Founder and chairman on the web page********
		//****** Also Capturing screenshot using the method created in the previous file*****
		
		TakeScreenshot tk = new TakeScreenshot();
		
		tk.TakeScreenshots(driver);

		WebElement e2 = driver.findElement(By.xpath("//*[text()=' Shiv Nadar']"));

		if(e2!=null) {

		System.out.println("Element is Present");
		}

		else {

		System.out.println("Element is not Present");

		}
		}

		}

	

	


