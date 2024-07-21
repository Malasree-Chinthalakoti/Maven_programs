package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonbuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement search=	driver.findElement(By.id("nav_cs_fresh"));
	search.click();
	WebElement fshoe=	driver.findElement(By.className("a-section aok-relative s-image-tall-aspect"));
	fshoe.click();
	}

}
