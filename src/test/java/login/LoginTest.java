package login;

import objectPages.MyPageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(listeners.TestListener.class)

public class LoginTest {

    MyPageFactory pageFactory = new MyPageFactory();

    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
        pageFactory.getScreenShotPage().takeScreenShotFail(result);
    }

    @Test(priority = 1)
    public void testLogin() {
        pageFactory.getMainPage().typeUsername("admin");
        Assert.assertTrue(pageFactory.getMainPage().getUsername().isDisplayed());
    }

    @Test(priority = 2)
    public void testPassword() {
        pageFactory.getMainPage().typePassword("123456");
        Assert.assertTrue(pageFactory.getMainPage().getPassword().isDisplayed());
    }

    @Test(priority = 3)
    public void testEnter() {
        pageFactory.getMainPage().enterButton();
        Assert.assertTrue(pageFactory.getMainPage().getBurgerButton().isDisplayed());
    }

}

