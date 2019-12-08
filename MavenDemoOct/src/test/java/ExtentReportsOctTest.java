import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsOctTest {
	
	static ExtentReports reports;
	static ExtentTest logger;
	@Test
public void testApp() {
   String fileName=new SimpleDateFormat(" 'SampleDemo_'yyyyMMddHHmm'.html' ").format(new Date());
   String path = "C:\\Users\\15186\\Desktop\\ExtentReports\\"+fileName;
   reports = new ExtentReports(path);
   logger = reports.startTest("Login into Gmail");
   logger.log(LogStatus.INFO, "We have entered valid Email ID");
   logger.log(LogStatus.PASS, "Enter Email ID");
   logger.log(LogStatus.INFO, "We have entered valid password");
   logger.log(LogStatus.PASS, "Enter password");
   logger.log(LogStatus.PASS, "Click on Login");
   
   logger = reports.startTest("Remember Me");
   logger.log(LogStatus.INFO, "We have entered valid Email ID");
   logger.log(LogStatus.FAIL, "Enter Email ID");
   logger.log(LogStatus.INFO, "We have entered valid password");
   logger.log(LogStatus.PASS, "Enter password");
   logger.log(LogStatus.FAIL, "Click on Remember Me");
   logger.log(LogStatus.FAIL, "Click on Login");
   
   
   reports.endTest(logger);
   reports.flush();
}

}
