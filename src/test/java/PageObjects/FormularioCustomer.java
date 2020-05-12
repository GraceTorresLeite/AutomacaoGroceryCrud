package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormularioCustomer {
	
	private WebDriver driver;

	public FormularioCustomer(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement preenchendoName() {
		return this.driver.findElement(By.xpath("//div[@class='col-sm-9']/input[@id='field-customerName']"));
	}
	
	public WebElement preenchendoLastName() {
		return this.driver.findElement(By.xpath("//div[@class='col-sm-9']/input[@id='field-contactLastName']"));
	}
	
	public WebElement preenchendoFirstName() {
		return this.driver.findElement(By.xpath("//div[@class='col-sm-9']/input[@id='field-contactFirstName']"));
	}
	
	public WebElement preenchendoPhone() {
		return this.driver.findElement(By.xpath("//div[@class='col-sm-9']/input[@id='field-phone']"));
	}
	
	public WebElement preenchendoLine1() {
		return this.driver.findElement(By.xpath("//div[@class='col-sm-9']/input[@id='field-addressLine1']"));
	}
	
	public WebElement preenchendoLine2() {
		return this.driver.findElement(By.xpath("//div[@class='col-sm-9']/input[@id='field-addressLine2']"));
	}
	
	public WebElement preenchendoCity() {
		return this.driver.findElement(By.xpath("//div[@class='col-sm-9']/input[@id='field-city']"));
	}
	
	public WebElement preenchendoState() {
		return this.driver.findElement(By.xpath("//div[@class='col-sm-9']/input[@id='field-state']"));
	}
	
	public WebElement preenchendoPostalCode() {
		return this.driver.findElement(By.xpath("//div[@class='col-sm-9']/input[@id='field-postalCode']"));
	}
	
	public WebElement preenchendoCountry() {
		return this.driver.findElement(By.xpath("//div[@class='col-sm-9']/input[@id='field-country']"));
	}

	public WebElement selectEmployeer() {
		return this.driver.findElement(By.xpath("//a[@tabindex='-1']/div/b"));
	//	return this.driver.findElement(By.xpath("//option[@value='1501']"));
	//	return this.driver.findElement(By.xpath("//div[@class='chosen-search']/input[@type='text']"));
	//	return this.driver.findElement(By.xpath("//ul/li[2]"));
	//	return this.driver.findElement(By.xpath("//div[@class='col-sm-9']
	//	+/select[@name='salesRepEmployeeNumber']/option[@value='1337']"));
	//	return this.driver.findElement(By.xpath("//div[@class='chosen-search']
	//	+/ul[@class='chosen-results']/li[@data-option-array-index='1']"));
	//	return this.driver.findElement(By.xpath("//select[@id='field-salesRepEmployeeNumber']
	//	+/option[@value='1337']"));
    //	return this.driver.findElement(By.xpath("//ul[@class='chosen-results']
	//	+/li[@data-option-array-index='4']"));
	}
	
//	public WebElement valueSelectEmployeer() {
//		return this.driver.findElement(By.xpath("//a[@tabindex='-1']/span"));
//	return this.driver.findElement(By.xpath("//div[@class='form-group salesRepEmployeeNumber_form_group']"
//			+ "/label[@class='col-sm-3 control-label']"
//			+ "/select[@id='field-salesRepEmployeeNumber']"
//			+ "/option[@value='1337']"));
//		}
	
	public WebElement preenchendoCreditLimit() {
		return this.driver.findElement(By.xpath("//div[@class='col-sm-9']"
				+ "/input[@id='field-creditLimit']"));
	}
	
	public WebElement clickSubmit () {
        return this.driver.findElement(By.xpath("//div[@class='col-sm-offset-3 col-sm-7']"
        		+ "/button[@id='save-and-go-back-button']"));
    }
}
