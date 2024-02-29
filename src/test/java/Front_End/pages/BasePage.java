package Front_End.pages;

import Front_End.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "signup")
    private WebElement signUpButton;
    @FindBy(id = "submit")
    private WebElement submitButton;
    @FindBy(xpath = "//form/following-sibling::p")
    private WebElement notAUserText;
    @FindBys(@FindBy(xpath = "//form//p//input"))
    private List<WebElement> logInFields;
    @FindBy(xpath = "//span[@id='error']")
    private WebElement errorElement;
    public void clickSignUpButton() {
        signUpButton.click();
    }
    public WebElement getNotAUserText() {
        return notAUserText;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public List<WebElement> getLogInFields() {
        return logInFields;
    }
    public String getErrorMessageText(){
        return errorElement.getText();
    }

    public WebElement getErrorElement() {
        return errorElement;
    }
}
