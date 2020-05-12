package Tasks;

import static java.lang.Thread.sleep;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;

public class HomeTask {
	
	private WebDriver driver;
	private HomePage page;
	
	public HomeTask(WebDriver driver) {
		// super();
		this.driver = driver;
		page = new HomePage(this.driver);
	}
	
	public void home() throws InterruptedException {

	page.homeSelectVersionDois().click();
	sleep(5000);
		
	page.homeSelectVersionUm().click();
	sleep(5000);
	
	page.buttonAddCustomer().click();
	sleep(5000);
	
	}
	
}
