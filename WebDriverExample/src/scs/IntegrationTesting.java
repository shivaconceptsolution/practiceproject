package scs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class IntegrationTesting {
public static void main(String args[])
	 {
	  System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://shivaconceptsolution.com/ims/");
	  WebElement ele = driver.findElement(By.name("email"));
	  ele.sendKeys("nitinscs@gmail.com");
	  WebElement ele1 = driver.findElement(By.name("pass"));
	  ele1.sendKeys("12345");
	  WebElement ele2 = driver.findElement(By.name("submit"));
	  ele2.click();
	  driver.manage().window().maximize();
	  WebElement ele3 = driver.findElement(By.name("txtname"));
	  ele3.sendKeys("nitin mahajan");
	  WebElement ele4 = driver.findElement(By.name("txtlist"));
	  ele4.sendKeys("testing purpose");
	  Select s = new Select(driver.findElement(By.name("branch")));
	  s.selectByIndex(1);
	  WebElement ele5 = driver.findElement(By.name("btnsubmit"));
	  ele5.click();
	  driver.switchTo().alert().accept();
	  
	 }

	
}
