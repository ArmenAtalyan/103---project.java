package objectPages.login;

import objectPages.mainPage.MainPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FakeLoginPage {

    @FindBy(xpath = "/html/body/div/div[2]/form/span")
    private WebElement errMessage;

    private MainPage mainPage;

    public void typeFakeUsernamePassword(String useName,String password){
        mainPage.typeUsername(useName);
        mainPage.typePassword(password);
    }

    public void clickLoginButton(){
       mainPage.enterButton();
    }

    public boolean showError(){
        return errMessage.isDisplayed();
    }

}
