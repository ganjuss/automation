package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice1 {
public static void main(String[] args)
{ WebDriver driver= new FirefoxDriver(); 
String url="https://test2.myplanlink.com/quotehome";
 driver.get(url);
 if(url.equals(driver.getCurrentUrl()))
 {
	  System.out.println("url opened is correct");
 }
 else
 {
	System.out.println("url opened is incorrect");  
	System.out.println("current url is "+driver.getCurrentUrl());
 }
  System.out.println("Title is "+driver.getTitle()); 
  System.out.println("Titlelength is "+driver.getTitle().length()); 

  String pagessource= driver.getPageSource();
  int pagelength=pagessource.length();
  System.out.println("page length is "+pagelength);
  driver.close();
  }
}
