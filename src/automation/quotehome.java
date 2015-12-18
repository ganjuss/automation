package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class quotehome {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://test.myplanlink.com/web/exchange");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='quoteformhandler-quote-form']/div[1]/div/div[1]/fieldset[1]/div/div[2]/span[2]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean healthcheckbox=false;
		healthcheckbox=driver.findElement(By.xpath(".//*[@id='insurance-type-Health']")).isSelected();
		
		if(healthcheckbox==true)
		{
			System.out.println("default plantype selected");
		}
		else
		{
			System.out.println("default plantype selection fail");
			driver.findElement(By.xpath(".//*[@id='insurance-type-Health']")).click();
		}
		driver.findElement(By.xpath(".//*[@id='insurance-type-Dental']")).click();
		
		driver.findElement(By.xpath(".//*[@id='insurance-type-Medigap']")).click();
		driver.findElement(By.xpath(".//*[@id='quoteformhandler-quote-form']/div[1]/div/div[1]/fieldset[2]/div/div[1]/span[2]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> gender=driver.findElements(By.name("gender"));
		gender.get(0).click();
		driver.findElement(By.name("dob")).click(); 
		driver.findElement(By.name("dob")).sendKeys("01/23/1985"); 
		driver.findElement(By.id("zipcode")).sendKeys("37010"); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> smoker=driver.findElements(By.name("smoker"));
		smoker.get(0).click();
		//Select affinitygroup=new Select(driver.findElement(By.xpath(".//*[@id='affinity-group']")));
		//affinitygroup.selectByIndex(1);
		
		driver.findElement(By.xpath(".//*[@id='first-name']")).sendKeys("muni");
		driver.findElement(By.xpath(".//*[@id='last-name']")).sendKeys("narayana");
		driver.findElement(By.xpath(".//*[@id='phone-no']")).sendKeys("1234567890");
		driver.findElement(By.xpath(".//*[@id='email-id']")).sendKeys("ghdshg@JG.sf");
		driver.findElement(By.xpath(".//*[@id='effective-date']")).click();
		driver.findElement(By.xpath(".//*[@id='effective-date']")).clear();
		driver.findElement(By.xpath(".//*[@id='effective-date']")).sendKeys("10/26/2015");
		driver.findElement(By.xpath(".//*[@id='quoteformhandler-quote-form']/div[1]/div/div[3]/div/div/div/div/div/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='quoteformhandler-quote-form']/div[1]/div/div[3]/div/div/div/div/div/div[2]")).click();
		Select householdsize=new Select(driver.findElement(By.xpath(".//*[@id='household-size']")));
		householdsize.selectByIndex(1);
		driver.findElement(By.xpath(".//*[@id='yearly-income']")).sendKeys("20000");
		driver.findElement(By.xpath(".//*[@id='quoteformhandler-quote-form']/div[1]/div/div[3]/fieldset[2]/input")).click();
		List<WebElement> gender1=driver.findElements(By.name("gender"));
		gender1.get(0).click();
		driver.quit();
		
	}
		
	}
	

