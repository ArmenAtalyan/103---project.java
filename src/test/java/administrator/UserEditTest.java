package administrator;

import objectPages.MyPageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserEditTest {

    MyPageFactory pageFactory = new MyPageFactory();

    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
        pageFactory.getScreenShotPage().takeScreenShotFail(result);
    }

    @Test(priority = 1)
    public void editButtonClick1(){
        pageFactory.getUserEditPage().editButtonOn1();
        Assert.assertTrue(pageFactory.getUserEditPage().getEnterSuccessMessage().isDisplayed());
    }

    @Test(priority = 2)
    public void generatePassBut(){
        pageFactory.getUserEditPage().generatePassOn();
        Assert.assertTrue(pageFactory.getUserEditPage().getGeneratePass().isDisplayed());
    }

    @Test(priority = 3)
    public void confirmBut() throws InterruptedException {
        pageFactory.getUserEditPage().confirmClick();
        pageFactory.getMainPage().refresh();
        pageFactory.getMainPage().waitFor();
    }

    @Test(priority = 4)
    public void pageChange(){
        pageFactory.getUserEditPage().changePage();
    }

    @Test(priority = 5)
    public void editButtonClick2(){
        pageFactory.getUserEditPage().editButtonOn2();
        Assert.assertTrue(pageFactory.getUserEditPage().getEnterSuccessMessage().isDisplayed());
    }

    @Test(priority = 6)
    public void inputName(){
        pageFactory.getUserEditPage().typeName("Samvel");
    }

    @Test(priority = 7)
    public void onLineRole1(){
        pageFactory.getUserEditPage().lineRole();
    }

    @Test(priority = 8)
    public void onRole1(){
        pageFactory.getUserEditPage().selectRole1();
    }

    @Test(priority = 9)
    public void onLineRole2(){
        pageFactory.getUserEditPage().lineRole();
    }

    @Test(priority = 10)
    public void onRole2(){
        pageFactory.getUserEditPage().selectRole2();
    }

    @Test(priority = 11)
    public void failedConfirmBut(){
        pageFactory.getUserEditPage().confirmClick();
        Assert.assertTrue(pageFactory.getUserEditPage().getEnterSuccessMessage2().isDisplayed());
    }

}
