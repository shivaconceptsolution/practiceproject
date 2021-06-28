package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginScript {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	/*WebDriver scs=null;
	ChromeDriver ch = new ChromeDriver();
	scs=ch;*/
	WebDriver scs = new ChromeDriver();
	scs.get("https://eroomrent.in/login.php");
	scs.manage().window().maximize();
	WebElement eleuser = scs.findElement(By.name("txtEmail"));
	eleuser.sendKeys("gau100@gmail.com");
	WebElement elepass = scs.findElement(By.name("txtPassword"));
	elepass.sendKeys("Gaurav@12345");
	scs.findElement(By.name("btnsubmit")).click();
	Actions actions = new Actions(scs);
	WebElement mainMenu = scs.findElement(By.partialLinkText("Dashboard"));
	actions.moveToElement(mainMenu);
	actions.build().perform();
    scs.findElement(By.linkText("Logout")).click();
	}

}
