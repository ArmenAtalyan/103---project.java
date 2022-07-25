package objectPages.administrator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.StartDriver;

public class JournalPage {

    @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(4) > li")
    private WebElement other;
    @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(4) > li > ul > li:nth-child(17) > a")
    private WebElement onJournal;

    public JournalPage(){
        PageFactory.initElements(StartDriver.getInstance().getDriver(), this);
    }

    public void onOther(){
        other.click();
    }

    public void onJournal(){
        onJournal.click();
    }



}
