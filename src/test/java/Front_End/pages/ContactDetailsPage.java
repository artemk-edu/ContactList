package Front_End.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDetailsPage extends BasePage{
    @FindBy(id="delete")
    private WebElement deleteContactButton;
    @FindBy(tagName = "h1")
    private WebElement h1tag;

    public WebElement getDeleteContactButton() {
        return deleteContactButton;
    }

    public WebElement getH1tag() {
        return h1tag;
    }
}
