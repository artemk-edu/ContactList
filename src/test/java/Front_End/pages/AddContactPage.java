package Front_End.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import java.util.List;

public class AddContactPage extends BasePage{
    @FindBys(@FindBy(xpath = "//form//p//input"))
    private List<WebElement> contactFormFields;

    @FindBy(id="submit")
    private WebElement submitButton;

    public List<WebElement> getContactFormFields() {
        return contactFormFields;
    }

    @Override
    public WebElement getSubmitButton() {
        return submitButton;
    }
}
