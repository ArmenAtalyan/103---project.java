package administrator;

import objectPages.MyPageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class JournalPageTest {

    MyPageFactory pageFactory = new MyPageFactory();

    @AfterMethod
    public void ScreenShot(ITestResult result) throws IOException {
        pageFactory.getScreenShotPage().takeScreenShotFail(result);
    }

    @Test(priority = 1)
    public void clickOnOtherDropDown(){
        pageFactory.getJournalPage().onOther();
    }

    @Test(priority = 2)
    public void clickOnJournalPage(){
        pageFactory.getJournalPage().onJournal();
    }
//    @AfterTest
//    public void afterTest(){
//        StartDriver.close();
//    }
}
