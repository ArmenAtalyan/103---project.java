package administrator;

import objectPages.MyPageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import util.StartDriver;

import java.io.IOException;

public class MessagePageTest {

    MyPageFactory pageFactory = new MyPageFactory();


    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
        pageFactory.getScreenShotPage().takeScreenShotFail(result);
    }

    @Test(priority = 1)
    public void messagePageOn(){
        pageFactory.getMessagesPage().messagesButtonOn();
    }

    @Test(priority = 2)
    public void roleLineClick1(){
        pageFactory.getMessagesPage().roleLineOn();
    }

    @Test(priority = 3)
    public void role1Click(){
        pageFactory.getMessagesPage().role1Click();
    }

    @Test(priority = 4)
    public void roleLineClick2(){
        pageFactory.getMessagesPage().roleLineOn();
    }

    @Test(priority = 5)
    public void role2Click(){
        pageFactory.getMessagesPage().role2Click();
    }

    @Test(priority = 6)
    public void userLineClick1(){
        pageFactory.getMessagesPage().userLineOn();
    }

    @Test(priority = 7)
    public void user1Click(){
        pageFactory.getMessagesPage().user1Click();
    }

    @Test(priority = 8)
    public void userLineClick2(){
        pageFactory.getMessagesPage().userLineOn();
    }

    @Test(priority = 9)
    public void user2Click(){
        pageFactory.getMessagesPage().user2Click();
    }

    @Test(priority = 10)
    public void textType(){
        pageFactory.getMessagesPage().typeText("test test test");
    }

    @Test(priority = 11)
    public void clickConfirmButton(){
        pageFactory.getMessagesPage().confButton();
        Assert.assertTrue(pageFactory.getMessagesPage().getSuccessMessage().isDisplayed());
    }

}
