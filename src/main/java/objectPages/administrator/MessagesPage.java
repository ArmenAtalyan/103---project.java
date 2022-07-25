package objectPages.administrator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.StartDriver;



public class MessagesPage {

    @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(2) > li > a")
    private WebElement messagesButton;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(3) > div > div > ul")
    private WebElement roleLine;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(3) > div > div > div > ul > li:nth-child(1)")
    private WebElement role1;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(3) > div > div > div > ul > li:nth-child(8)")
    private WebElement role2;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(4) > div > div > ul")
    private WebElement userLine;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(4) > div > div > div > ul > li:nth-child(17)")
    private WebElement user1;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(4) > div > div > div > ul > li:nth-child(42)")
    private WebElement user2;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(6) > div > textarea")
    private WebElement text;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > div > strong")
    private WebElement successMessage;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(7) > div > button")
    private WebElement confirmButton;

    public MessagesPage(){
        PageFactory.initElements(StartDriver.getInstance().getDriver(), this);
    }

    public void messagesButtonOn(){
        messagesButton.click();
    }

    public void roleLineOn(){
        roleLine.click();
    }

    public void role1Click(){
        role1.click();
    }

    public void role2Click(){
        role2.click();
    }

    public void userLineOn(){
        userLine.click();
    }

    public void user1Click(){
        user1.click();
    }

    public void user2Click(){
        user2.click();
    }

    public void typeText(String message){
        text.sendKeys(message);
    }

    public void confButton(){
        confirmButton.click();
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }
}
