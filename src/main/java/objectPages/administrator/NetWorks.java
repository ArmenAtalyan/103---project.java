package objectPages.administrator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.StartDriver;

public class NetWorks {

    @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(3) > li > a")
    private WebElement netWork;
    @FindBy(css = "#dataTables_networks > tbody > tr:nth-child(1) > td.text-center > a.edit_button")
    private WebElement edit;
    @FindBy(css = "#page-wrapper > div > div.panel-body > a")
    private WebElement add;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(4) > div > input")
    private WebElement name;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(5) > div > button")
    private WebElement submit;
    @FindBy(css = "#page-wrapper > div.alert.alert-info > strong")
    private WebElement successMessage;
    @FindBy(xpath = "//*[@id=\"dataTables_networks\"]/tbody/tr[4]/td[3]/a[2]")
    private WebElement delete;
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div/div/div[2]/form/div/div/button")
    private WebElement yesButton;


    public NetWorks(){
        PageFactory.initElements(StartDriver.getInstance().getDriver(), this);
    }

    public void onNetWork(){
        netWork.click();
    }

    public void addButton(){
        add.click();
    }

    public void typeName(String newName){
        name.sendKeys(newName);
    }

    public void submitButton(){
        submit.click();
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public void onDelete(){
        delete.click();
    }

    public void onYesButton(){
        yesButton.click();
    }

    public WebElement getEdit() {
        return edit;
    }
}
