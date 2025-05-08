package step_definition;

import config.env_target;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObject.homePage;

import org.openqa.selenium.chrome.ChromeDriver;

public class hooks extends env_target {

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(parabank);

        homePage home = new homePage(driver);
        home.inputCredentials("john2987", "123456");
        home.clickLogin();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            // driver.quit();
        }
    }
}
