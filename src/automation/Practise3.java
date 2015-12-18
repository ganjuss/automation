package automation;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise3 {
	public static void main(String[] args) throws InterruptedException{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.DemoQa.com");
	driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(1000);
	driver.navigate().to("http://www.DemoQa.com");
	Thread.sleep(1000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	driver.close();
	
	
	}

}
