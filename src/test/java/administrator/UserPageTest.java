package administrator;

import objectPages.MyPageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserPageTest {

    MyPageFactory pageFactory = new MyPageFactory();

    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
        pageFactory.getScreenShotPage().takeScreenShotFail(result);
    }

    @Test(priority = 1)
    public void userButton(){
        pageFactory.getUsersPage().usersButtonClick();
        Assert.assertTrue(pageFactory.getUsersPage().getUsersButton().isDisplayed());
    }

    @Test(priority = 2)
    public void dropDownStation(){
        pageFactory.getUsersPage().stationsDropDown();
        Assert.assertTrue(pageFactory.getUsersPage().getStationsDropDown().isDisplayed());
    }

    @Test(priority = 3)
    public void chooseStation() {
        pageFactory.getUsersPage().selectStation();
        Assert.assertTrue(pageFactory.getUsersPage().getSelectStation().isDisplayed());
    }

    @Test(priority = 4)
    public void dropDownUsers(){
        pageFactory.getUsersPage().userDropDown();
        Assert.assertTrue(pageFactory.getUsersPage().getUserDropDown().isDisplayed());
    }

    @Test(priority = 5)
    public void selectUsers(){
        pageFactory.getUsersPage().selectUser();
        Assert.assertTrue(pageFactory.getUsersPage().getSelectUser().isDisplayed());
    }

}

