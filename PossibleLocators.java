package task_19_guvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PossibleLocators {

	public static void main(String[] args) {
//		Setting up the Chrome Driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		Maximizing the window
		driver.manage().window().maximize();
//		Opening drag and drop url
		driver.get("https://www.guvi.in/register");
		
//		Locating WebElement using id locator
		WebElement idLocator = driver.findElement(By.id("name"));
		idLocator.sendKeys("Aravindhan S");

//		Locating WebElement using class name locator
		WebElement classLocator = driver.findElement(By.className("certificates"));
		System.out.println(classLocator.getText());
		
//		Locating WebElement using tag name locator
		WebElement tagLocator = driver.findElement(By.tagName("form"));
		System.out.println(tagLocator.isDisplayed());
		
//		Locating WebElement using CSS selector locator
		WebElement cssLocator = driver.findElement(By.cssSelector("div#emailgroup input"));
		cssLocator.sendKeys("aravindhan.s@gmail.com");
		
//		Locating WebElement using XPath locator
		WebElement xpathLocator = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		xpathLocator.sendKeys("9876543210");

	}

}
