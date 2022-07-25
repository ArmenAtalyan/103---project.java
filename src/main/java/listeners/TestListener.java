package listeners;

import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {

    private static Logger LOGGER = Logger.getLogger(ITestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        LOGGER.info(result.getMethod().getMethodName() + " started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        LOGGER.info(result.getMethod().getMethodName() + " passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        LOGGER.info("Failed because of - "+ result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LOGGER.info("Skipped because of - "+ result.getThrowable());
    }
}
