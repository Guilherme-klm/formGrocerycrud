package Tasks;

import MappedPages.ListCustomersPage;
import org.openqa.selenium.WebDriver;

public class ListCustomersTask {

    private static WebDriver driver;
    private static ListCustomersPage listCustomersPage;

    public ListCustomersTask(WebDriver driver) {
        this.driver = driver;
        listCustomersPage = new ListCustomersPage(driver);
    }

    public void addCustomer () {
        listCustomersPage.buttonAddCustumer().click();
    }

    public void viewCustumer () throws InterruptedException {
        Thread.sleep(1000);
        listCustomersPage.searchName().sendKeys("Guilherme");
        Thread.sleep(2500);
        listCustomersPage.buttonMore().click();
        Thread.sleep(1500);
        listCustomersPage.buttonMoreOptionView().click();
        Thread.sleep(4000);
    }
}
