package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		// super();
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public WebElement homeSelectVersionUm() {
		return this.driver.findElement(By.xpath("//div[@class='switch-versions-container']"
				+ "//select[@onchange='switchVersionSelect()']/option[@value ='bootstrap_theme']"));
	}
	
	public WebElement homeSelectVersionDois() {
		return this.driver.findElement(By.xpath("//div[@class='switch-versions-container']"
				+ "//select[@onchange='switchVersionSelect()']/option[@value ='bootstrap_theme_v4']"));
	}
	
	public WebElement buttonAddCustomer() {
		return this.driver.findElement(By.xpath("//div[@class='floatL t5']/a[@href='/demo/bootstrap_theme/add']"));
	}
}
