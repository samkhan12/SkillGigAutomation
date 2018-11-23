package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	

	WebDriver driver;
	public static void main(String args[]) {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://54.237.210.138/SignIn");

	}

}