package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice9 {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.toolsqa.com/automation-practice-switch-windows");
	driver.findElement(By.id("timingAlert")).click();
	System.out.println("element found");
	WebDriverWait wait= new WebDriverWait(driver, 10);
	Alert alert= wait.until(ExpectedConditions.alertIsPresent());
	alert.accept();
	System.out.println("alert accepted");
	driver.quit();
	
}
}
