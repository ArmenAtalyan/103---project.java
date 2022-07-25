package util;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ScreenShotPage {

    public void takeScreenShotFail(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            File file = ((TakesScreenshot) StartDriver.getInstance().getDriver()).getScreenshotAs(OutputType.FILE);
            System.out.println(result.getName());
            FileUtils.copyFile(file, new File("D:\\Armen\\automation\\test-103\\screenShots", result.getName() + ".png"));
        }
    }
}
