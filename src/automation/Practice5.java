package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice5 {
public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	driver.get("http://test.myplanlink.com/web/testing1");
	System.out.println("pass1");
	driver.findElement(By.partialLinkText("HOM")).click();
	System.out.println("pass1");
	String s=driver.findElement(By.tagName("button")).toString();
	System.out.println(s);
	driver.findElement(By.linkText("HOME")).click();;
	System.out.println("pass1");
	
}
	
	
}
