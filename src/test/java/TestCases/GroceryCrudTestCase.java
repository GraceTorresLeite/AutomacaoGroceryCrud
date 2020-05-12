package TestCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fundatec.automacao.GroceryCrud.BaseTestFw;

import Tasks.FormularioCustomerTask;
import Tasks.HomeTask;

public class GroceryCrudTestCase extends BaseTestFw {
	
	private WebDriver driver = this.getDriver();
	
	@Test
    public void selecionaVersion() throws InterruptedException{

    HomeTask login = new HomeTask(driver);
    FormularioCustomerTask formularioCustomerTask = new FormularioCustomerTask(driver);

    login.home();
    formularioCustomerTask.preencherFormularioCustomer();

    }

}
