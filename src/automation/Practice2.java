package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice2 {
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new FirefoxDriver();
	String url="http://demoqa.com/frames-and-windows/";
	driver.get(url);
	driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
	System.out.println("button clicked");
	Thread.sleep(1234);
	driver.quit();
	}
}
