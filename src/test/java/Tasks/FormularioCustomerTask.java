package Tasks;

import static java.lang.Thread.sleep;

import org.openqa.selenium.WebDriver;

import PageObjects.FormularioCustomer;

public class FormularioCustomerTask {
	
	private  WebDriver driver;
	private  FormularioCustomer formularioCustomer;
	
	
	public FormularioCustomerTask(WebDriver driver) {
		super();
		this.driver = driver;
		this.formularioCustomer = new FormularioCustomer(driver);
	}
	
	public void preencherFormularioCustomer() throws InterruptedException {
		
		formularioCustomer.preenchendoName().click();
		formularioCustomer.preenchendoName().sendKeys("GraceTL");
		sleep(1000);
		
		formularioCustomer.preenchendoLastName().click();
		formularioCustomer.preenchendoLastName().sendKeys("Tôrres");
		sleep(1000);
		
		formularioCustomer.preenchendoFirstName().click();
		formularioCustomer.preenchendoFirstName().sendKeys("Grace");
		sleep(3000);
		
		formularioCustomer.preenchendoPhone().click();
		formularioCustomer.preenchendoPhone().sendKeys("(xx)xxx-xxxxx");
		sleep(1000);
		
		formularioCustomer.preenchendoLine1().click();
		formularioCustomer.preenchendoLine1().sendKeys("Rua 1");
		sleep(1000);
		
		formularioCustomer.preenchendoLine2().click();
		formularioCustomer.preenchendoLine2().sendKeys("Rua 2");
		sleep(1000);
		
		formularioCustomer.preenchendoCity().click();
		formularioCustomer.preenchendoCity().sendKeys("Porto Alegre");
		sleep(1000);
		
		formularioCustomer.preenchendoState().click();
		formularioCustomer.preenchendoState().sendKeys("Rio Grande do Sul");
		sleep(1000);
		
		formularioCustomer.preenchendoPostalCode().click();
		formularioCustomer.preenchendoPostalCode().sendKeys("91000-000");
		sleep(1000);
		
		formularioCustomer.preenchendoCountry().click();
		formularioCustomer.preenchendoCountry().sendKeys("Brasil");
		sleep(1000);
		
		formularioCustomer.selectEmployeer().click();
		sleep(2000);
		
//		formularioCustomer.valueSelectEmployeer().click();
//		formularioCustomer.valueSelectEmployeer().sendKeys("Bott");
//		sleep(2000);
		
		formularioCustomer.preenchendoCreditLimit().click();
		formularioCustomer.preenchendoCreditLimit().sendKeys("100000");
		sleep(3000);
		
		formularioCustomer.clickSubmit().click();
        sleep(5000);
		
	}

}
