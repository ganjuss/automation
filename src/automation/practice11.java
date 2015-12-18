package automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice11 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		driver.findElement(By.name("New Message Window")).click();
		Set handles=driver.getWindowHandles();
		System.out.println(handles);
		for(String handle1:driver.getWindowHandles())
		{
			
		System.out.println(handle1);
		driver.switchTo().window(handle1);
		
		}
		driver.close();
		driver.quit();
		}
}
