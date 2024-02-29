package Front_End.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class ContactListPage extends BasePage{
    @FindBy(id="add-contact")
    private WebElement addNewContactButton;

    @FindBys(@FindBy(xpath = "//table//tr[@class='contactTableBodyRow']"))
    private List<WebElement> contactRowCells;

    public WebElement getAddNewContactButton() {
        return addNewContactButton;
    }

    public List<WebElement> getContactRowCells() {
        return contactRowCells;
    }
}
