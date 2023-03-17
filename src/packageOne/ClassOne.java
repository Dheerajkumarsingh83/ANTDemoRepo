package packageOne;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassOne {
	
  @Test
  public void testOne(){
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.omayo.blogspot.com");
	  driver.findElement(By.linkText("XYZ")).click();
  }
  

}
