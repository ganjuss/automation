package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice7 {

	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://test.myplanlink.com/web/testing1");
		List<WebElement> radio=driver.findElements(By.name("smoker"));
		Boolean Smoke=false;
		Smoke=radio.get(0).isSelected();
		if(Smoke==true)
		{
			radio.get(1).click();
			
		}
		else
		{
			
			radio.get(0).click();
		}
	}
}
