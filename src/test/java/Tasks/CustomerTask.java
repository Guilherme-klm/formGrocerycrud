package Tasks;

import MappedPages.CustumerPage;
import org.openqa.selenium.WebDriver;

public class CustomerTask {

    private static WebDriver driver;
    private static CustumerPage custumerPage;

    public CustomerTask(WebDriver webDriver) {
        driver = webDriver;
        custumerPage = new CustumerPage(driver);
    }

    public void preencherNovoCustumerSucess () throws InterruptedException {
        custumerPage.inputName().sendKeys("Guilherme");
        custumerPage.inputLastName().sendKeys("Martins");
        custumerPage.inputContactFirstName().sendKeys("736473264");
        custumerPage.inputPhone().sendKeys("91923829389");
        custumerPage.inputAddresUm().sendKeys("Rua nao sei qual");
        custumerPage.inputAddresDois().sendKeys("Avenida Brasil");
        custumerPage.inputCity().sendKeys("Sao Paulo");
        custumerPage.inputState().sendKeys("Sao Paulo");
        custumerPage.inputPostalCode().sendKeys("987678768");
        custumerPage.inputCountry().sendKeys("Brasil");
        custumerPage.selectFromEmployeer().click();
        custumerPage.selectFromEmployeerValueBott().click();
        custumerPage.inputCreditLimit().sendKeys("10000");
        custumerPage.buttonSave().click();
        Thread.sleep(1600);
        custumerPage.linkBackToList().click();
    }
}
