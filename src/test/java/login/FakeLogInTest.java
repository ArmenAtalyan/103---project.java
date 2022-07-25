package login;

import objectPages.MyPageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import util.StartDriver;

import java.io.IOException;

public class FakeLogInTest {

    MyPageFactory pageFactory = new MyPageFactory();

    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
        pageFactory.getScreenShotPage().takeScreenShotFail(result);
    }

    @Test (priority = 1)
    public void testFakeLogin1(){
        pageFactory.getMainPage().typeUsername("admin");
        pageFactory.getMainPage().typePassword("");
        pageFactory.getMainPage().enterButton();
    }

    @Test (priority = 2)
    public void testFakeLogin2(){
        pageFactory.getMainPage().typeUsername("");
        pageFactory.getMainPage().typePassword( "12346");
        pageFactory.getMainPage().enterButton();
    }

    @Test (priority = 3)
    public void testFakeLogin3(){
        pageFactory.getMainPage().typeUsername("ad");
        pageFactory.getMainPage().typePassword( "12");
        pageFactory.getMainPage().enterButton();
        Assert.assertTrue(pageFactory.getMainPage().showError());
    }

    @Test (priority = 4)
    public void testFakeLogin4(){
        pageFactory.getMainPage().typeUsername(" admin ");
        pageFactory.getMainPage().typePassword( " 123456 ");
        pageFactory.getMainPage().enterButton();
        Assert.assertTrue(pageFactory.getMainPage().showError());
    }

    @Test (priority = 5)
    public void testFakeLogin5() throws InterruptedException {
        pageFactory.getMainPage().typeUsername("");
        pageFactory.getMainPage().typePassword( "");
        pageFactory.getMainPage().enterButton();
        Assert.assertTrue(pageFactory.getMainPage().showError());
        pageFactory.getMainPage().waitFor();
    }

}
