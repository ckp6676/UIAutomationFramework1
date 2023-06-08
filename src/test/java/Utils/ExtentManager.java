package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./ScreenShot/extent-report"+CommonUtil.getCurrentTime()+".html");
        reporter.config().setReportName("TFSA Extent Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("RBC", "Chirag");
        extentReports.setSystemInfo("Author", "automation team");
        return extentReports;
    }
}
