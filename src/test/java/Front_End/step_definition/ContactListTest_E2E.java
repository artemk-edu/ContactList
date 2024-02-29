package Front_End.step_definition;

import Front_End.pages.*;
import Front_End.utils.ConfigReader;
import Front_End.utils.DataReader;
import Front_End.utils.Driver;
import io.restassured.RestAssured;

import org.openqa.selenium.WebElement;
import org.testng.annotations.*;


import java.util.List;



public class ContactListTest_E2E extends BasePage {
    SignUpPage signUpPage = new SignUpPage();
    AddContactPage addContactPage = new AddContactPage();
    ContactListPage contactListPage = new ContactListPage();
    ContactDetailsPage contactDetailsPage = new ContactDetailsPage();

    @BeforeTest
    public void init() {
        Driver.getDriver().get(ConfigReader.getProperty("baseURL"));
        RestAssured.baseURI = ConfigReader.getProperty("baseURL");
    }

    @AfterTest
    public void tearDown() {
        Driver.closeDriver();
    }

//    @Test(priority = 0)
//    public void checkIfRegistered() {
//        String notUser = "Not yet a user";
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue(getNotAUserText().getText().contains(notUser));
//    }

    @Test(priority = 1)
    public void logIn() {
        getLogInFields().forEach(e -> e.sendKeys(DataReader.getData("credentials", e.getAttribute("id"))));
        getSubmitButton().click();
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(4000));
        //wait.until(ExpectedConditions.visibilityOf(getErrorElement()));
        if(getErrorElement().isDisplayed() & getErrorMessageText().contains("Incorrect username or password")){
            clickSignUpButton();
        signUpPage.getRegistrationFormFields().forEach(e -> {
                    e.sendKeys(DataReader.getData("credentials", e.getAttribute("id")));
                }
        );
        signUpPage.getSubmitButton().click();
        }

    }

    @Test(priority = 2)
    public void addNewContact() {
        contactListPage.getAddNewContactButton().click();
    }

    @Test(priority = 3)
    public void fillUpContactForm() {
        addContactPage.getContactFormFields().forEach(e -> e.sendKeys(DataReader.getData("data", e.getAttribute("id"))));
        addContactPage.getSubmitButton().click();
    }

    @Test(priority = 4)
    public void DeleteContact() {
        List<WebElement> list = contactListPage.getContactRowCells();
        for (WebElement webElement : list) {
            if (webElement.getText().contains("Tester2")) {
                webElement.click();
                break;
            }
        }
            contactDetailsPage.getDeleteContactButton().click();
            Driver.getDriver().switchTo().alert().accept();
        }
    }
