package automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("i m in Test");
  }
  
  @BeforeTest
  public void  before(){
	  System.out.println("i m in before");
  }
  
  @AfterTest
  public void after(){
	  System.out.println("i m in after");
  }
  
}
