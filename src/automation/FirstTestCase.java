package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {
public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

        //Launch the Online Store Website
		driver.get("http://www.google.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.google.com");

		//Wait for 5 Sec
		Thread.sleep(233);

        // Close the driver
		 String x=driver.getTitle();
	        System.out.println(x);
	        System.out.println(driver.getPageSource());
        driver.quit();
        System.out.println("Successfully closed the website www.google.com");

    }
}


/*helo*/
