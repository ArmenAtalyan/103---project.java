package objectPages.administrator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.StartDriver;

public class UsersPage {

    @FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li/a")
    private WebElement usersButton;
    @FindBy(xpath= "//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div")
    private WebElement stationsDropDown;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div/div/ul/li[5]")
    private WebElement selectStation;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div/div")
    private WebElement userDropDown;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div/div/div/ul/li[2]")
    private WebElement selectUser;


    public UsersPage(){
        PageFactory.initElements(StartDriver.getInstance().getDriver(), this);
    }
    public void usersButtonClick(){
        usersButton.click();
    }
    public void stationsDropDown(){
        stationsDropDown.click();
    }
    public void selectStation(){
        selectStation.click();
    }
    public void userDropDown(){
        userDropDown.click();
    }
    public void selectUser(){
        selectUser.click();
    }

    public WebElement getUsersButton() {
        return usersButton;
    }

    public WebElement getStationsDropDown() {
        return stationsDropDown;
    }

    public WebElement getSelectStation() {
        return selectStation;
    }

    public WebElement getUserDropDown() {
        return userDropDown;
    }

    public WebElement getSelectUser() {
        return selectUser;
    }
}
