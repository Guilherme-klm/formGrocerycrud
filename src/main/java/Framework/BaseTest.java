package Framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    private WebDriver driver;
    private String url = "https://www.grocerycrud.com/demo/bootstrap_theme";

    public WebDriver getDriver() {
        return this.driver = DriverManager.setDriver(DriverType.CHROME);
    }

    @Before
    public void setup() {
        getDriver().get(url);
    }

    @After
    public void quitDriver () {
        DriverManager.quitDriver();
    }
}
