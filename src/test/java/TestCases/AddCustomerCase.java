package TestCases;

import Framework.BaseTest;
import Tasks.CustomerTask;
import Tasks.ListCustomersTask;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AddCustomerCase extends BaseTest {

    private WebDriver driver = this.getDriver();

    @Test
    public void adicionarCustomerSucess () throws InterruptedException {
        ListCustomersTask listCustomersTask = new ListCustomersTask(driver);
        CustomerTask custumerTask = new CustomerTask(driver);

        listCustomersTask.addCustomer();
        custumerTask.preencherNovoCustumerSucess();
        listCustomersTask.viewCustumer();
    }
}
