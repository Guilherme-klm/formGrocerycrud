package MappedPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustumerPage {

    private WebDriver driver;

    public CustumerPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public WebElement inputName () {
        return this.driver.findElement(By.id("field-customerName"));
    }

    public WebElement inputLastName () {
        return this.driver.findElement(By.id("field-contactLastName"));
    }

    public WebElement inputContactFirstName () {
        return this.driver.findElement(By.id("field-contactFirstName"));
    }

    public WebElement inputPhone () {
        return this.driver.findElement(By.id("field-phone"));
    }

    public WebElement inputAddresUm () {
        return this.driver.findElement(By.id("field-addressLine1"));
    }

    public WebElement inputAddresDois () {
        return this.driver.findElement(By.id("field-addressLine2"));
    }

    public WebElement inputCity () {
        return this.driver.findElement(By.id("field-city"));
    }

    public WebElement inputState () {
        return this.driver.findElement(By.id("field-state"));
    }

    public WebElement inputPostalCode () {
        return this.driver.findElement(By.id("field-postalCode"));
    }

    public WebElement inputCountry () {
        return this.driver.findElement(By.id("field-country"));
    }

    public WebElement selectFromEmployeer () {
        return this.driver.findElement(By.id("field_salesRepEmployeeNumber_chosen"));
    }

    public WebElement selectFromEmployeerValueBott () {
        return this.driver.findElement(By.xpath("//div[@class='chosen-drop']//ul[@class='chosen-results']/li[3]"));
    }

    public WebElement inputCreditLimit () {
        return this.driver.findElement(By.id("field-creditLimit"));
    }

    public WebElement buttonSave () {
        return this.driver.findElement(By.id("form-button-save"));
    }

    public WebElement linkBackToList () {
        return this.driver.findElement(By.xpath("//a[@href='/demo/bootstrap_theme/']"));
    }
}
