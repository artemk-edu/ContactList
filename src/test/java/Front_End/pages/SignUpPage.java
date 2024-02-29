package Front_End.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SignUpPage extends BasePage {
    @FindBys(@FindBy(xpath = "//form//p//input"))
    private List<WebElement> registrationFormFields;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    public List<WebElement> getRegistrationFormFields() {
        return registrationFormFields;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
}
