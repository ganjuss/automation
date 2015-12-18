package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice4 {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
driver.get("http://www.toolsqa.com/automation-practice-form/");
driver.findElement(By.name("firstname")).sendKeys("Muni");
driver.findElement(By.name("lastname")).sendKeys("Narayana");
driver.findElement(By.id("submit")).click();
}
}
