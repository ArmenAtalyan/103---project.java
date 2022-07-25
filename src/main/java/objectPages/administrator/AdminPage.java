package objectPages.administrator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.StartDriver;

public class AdminPage {

    @FindBy(css = "body > div.menu_div_left.menu_div_left_act > ul > li > ul > li:nth-child(1) > ul > li:nth-child(1) > a")
    private WebElement adminButton;
    @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(1) > li > a")
    private WebElement adminPageMenu;

    public AdminPage(){
        PageFactory.initElements(StartDriver.getInstance().getDriver(), this);
    }

    public void adminButtonClick(){
        adminButton.click();
    }

    public WebElement getAdminPageMenu() {
        return adminPageMenu;
    }
}
