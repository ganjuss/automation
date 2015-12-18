package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class practice10 {
public static void main(String[] args) throws InterruptedException{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
	
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(200, TimeUnit.MILLISECONDS);
		wait.withTimeout(2, TimeUnit.SECONDS);
		
		Function<WebDriver, Boolean> function=new Function<WebDriver, Boolean>() {
			int i=0;
			
			@Override
			public Boolean apply(WebDriver arg0) {
			WebElement element=  arg0.findElement(By.id("colorVar"));
			String color=element.getAttribute("style");
			System.out.println(color);
			 if(color.equals("color: red;")){
				 System.out.println("success");
				
				 return true;
			 }
		
				 return false;
		
			
			}
			
		}; 
		wait.until(function);
	driver.quit();	
}

}
