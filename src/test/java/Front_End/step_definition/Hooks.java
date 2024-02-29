package Front_End.step_definition;

import Front_End.utils.ConfigReader;
import Front_End.utils.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class Hooks {
//    @BeforeTest
//    public void init() {
//        Driver.getDriver().get(ConfigReader.getProperty("baseURL"));
//    }

    @AfterTest
    public void close() {
        Driver.closeDriver();
    }
}
