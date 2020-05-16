package MappedPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListCustomersPage {

    private WebDriver driver;

    public ListCustomersPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement buttonAddCustumer () {
        return this.driver.findElement(By.xpath("//a[@class='btn btn-default' and @href='/demo/bootstrap_theme/add']"));
    }

    public WebElement searchName () {
        return this.driver.findElement(By.xpath("//input[@name='customerName' and @placeholder='Search Name']"));
    }

    public WebElement buttonMore () {
        return this.driver.findElement(By.xpath(
                "//table[@class='table table-bordered grocery-crud-table table-hover']" +
                "/tbody" +
                "/tr[1]" +
                "/td[2]" +
                "/div[@class='only-desktops']" +
                "/div[@class='btn-group']" +
                "/button[@class='btn btn-default dropdown-toggle gc-bootstrap-dropdown']"));
    }

    public WebElement buttonMoreOptionView () {
        return this.driver.findElement(By.xpath(
                "//table[@class='table table-bordered grocery-crud-table table-hover']" +
                "/tbody" +
                "/tr[1]" +
                "/td[2]" +
                "/div[@class='only-desktops']" +
                "/div[@class='btn-group']" +
                "/ul[@class='dropdown-menu']" +
                "/li[1]"));
    }
}
