package objectPages.mainPage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.StartDriver;

public class MainPage {

    @FindBy (name = "username")
    private WebElement username;
    @FindBy (name = "password")
    private WebElement password;
    @FindBy (css = "body > div > div.login > form > button")
    private WebElement loginButton;
    @FindBy(css = "body > nav > div > div.header_logo > a.menu_button")
    private WebElement burgerButton;
    @FindBy(css = "body > div.menu_div_left.menu_div_left_act > ul > li")
    private WebElement mainDropDown;
    @FindBy(css = "body > div.menu_div_left.menu_div_left_act > div.user_div > div:nth-child(4) > form > a")
    private WebElement logOutButton;
    @FindBy(xpath = "/html/body/div/div[2]/form/span")
    private WebElement errMessage;

    public MainPage(){
        PageFactory.initElements(StartDriver.getInstance().getDriver(), this);
    }

    public void typeUsername(String login){
        username.sendKeys(login);
    }

    public void typePassword(String passWord){
        password.sendKeys(passWord);
    }

    public void enterButton(){
        loginButton.click();
    }

    public void burgerClick(){
        burgerButton.click();
    }

    public void mainDropDownClick(){
        mainDropDown.click();
    }

    public void logoutClick(){
        logOutButton.click();
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getBurgerButton() {
        return burgerButton;
    }

    public WebElement getMainDropDown() {
        return mainDropDown;
    }

    public WebElement getLogOutButton() {
        return logOutButton;
    }

    public void refresh(){
        StartDriver.getInstance().getDriver().navigate().refresh();
    }

    public void prop(){
        PropertyConfigurator.configure("log4j.properties");
    }

    public void waitFor() throws InterruptedException {
        Thread.sleep(200);
    }
    public boolean showError(){
        return errMessage.isDisplayed();
    }
}
