package administrator;

import objectPages.MyPageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class AdminPageTest {

    MyPageFactory pageFactory =  new MyPageFactory();

    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
        pageFactory.getScreenShotPage().takeScreenShotFail(result);
    }

    @BeforeTest
    public void clickBurgerButton(){
        pageFactory.getMainPage().burgerClick();
        pageFactory.getMainPage().mainDropDownClick();
    }

    @Test(priority = 1)
    public void clickAdminButton(){
        pageFactory.getAdminPage().adminButtonClick();
        Assert.assertTrue(pageFactory.getAdminPage().getAdminPageMenu().isDisplayed());
    }
}
