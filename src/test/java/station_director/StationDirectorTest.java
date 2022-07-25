package station_director;

import objectPages.administrator.AdminPage;
import objectPages.station_director.StationDirectorPage;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import util.ScreenShotPage;

import java.io.IOException;

public class StationDirectorTest {

    StationDirectorPage stationDirectorPage = new StationDirectorPage();

    AdminPage adminPage = new AdminPage();
    ScreenShotPage screen = new ScreenShotPage();


    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
        screen.takeScreenShotFail(result);
    }

//    @BeforeTest
//    public void beforeTest(){
//        loginPage.typeUsername();
//        loginPage.typePassword();
//        loginPage.clickEnterButton();
//
//    }

    @Test(priority = 1)
    public void selectStationDirector(){
        stationDirectorPage.enterPage();
    }

    @Test(priority = 2)
    public void enterToJournal(){
        stationDirectorPage.journalButtonOn();
    }
}
