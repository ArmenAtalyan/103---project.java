package administrator;

import objectPages.MyPageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class NetWorksTest {

    MyPageFactory pageFactory = new MyPageFactory();

    @AfterMethod
    public void screenShot(ITestResult result) throws IOException {
        pageFactory.getScreenShotPage().takeScreenShotFail(result);
    }

    @Test(priority = 1)
    public void toNetWork() throws InterruptedException {
        pageFactory.getMainPage().waitFor();
        pageFactory.getNetWorksPage().onNetWork();
    }

    @Test(priority = 2)
    public void onAdd() throws InterruptedException {
        pageFactory.getMainPage().waitFor();
        pageFactory.getNetWorksPage().addButton();
    }

    @Test(priority = 3)
    public void inputName() throws InterruptedException {
        pageFactory.getMainPage().waitFor();
        pageFactory.getNetWorksPage().typeName("Test");
    }

    @Test(priority = 4)
    public void onSubmit() throws InterruptedException {
        pageFactory.getMainPage().waitFor();
        pageFactory.getNetWorksPage().submitButton();
        Assert.assertTrue(pageFactory.getNetWorksPage().getSuccessMessage().isDisplayed());
    }

    @Test(priority = 5)
    public void deleteNetWork() throws InterruptedException {
        pageFactory.getMainPage().waitFor();
        pageFactory.getNetWorksPage().onDelete();
    }

    @Test(priority = 6)
    public void confirmDeleteNetWork() throws InterruptedException {
        pageFactory.getMainPage().waitFor();
        pageFactory.getNetWorksPage().onYesButton();
        Assert.assertFalse(pageFactory.getNetWorksPage().getEdit().isSelected());
    }
}
