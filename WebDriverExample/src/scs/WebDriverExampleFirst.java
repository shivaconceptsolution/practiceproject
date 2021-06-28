package scs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExampleFirst {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://eroomrent.in");
		String s = driver.getTitle();
		System.out.println("Title is "+s);
		if(s.length()>60)
		{
			System.out.println("Title is Invalid");
		}
		else
		{
			System.out.println("Title is valid");
		}
		

	}

}
