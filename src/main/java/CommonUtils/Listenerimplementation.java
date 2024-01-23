package CommonUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listenerimplementation implements ITestListener {

	public ExtentReports rp;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//To get the method name
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+"Testscript execution is passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//To get reason 
		String msg = result.getThrowable().toString();
		//To get the method name
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+"Testscript execution is failed"+msg,true);	
		WebDriverUtil wutils = new WebDriverUtil();
		WebDriver dc = null;
		try {
			wutils.totakescreenshot(dc, "ajio1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//To get the method name
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+"Testscript execution is skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		//To configure extent reports---from avenstack
		ExtentSparkReporter reports = new ExtentSparkReporter("./Extentreport/report.html");
		reports.config().setDocumentTitle("SQL");
		reports.config().setReportName("java");
		reports.config().setTheme(Theme.DARK);
		
		//To add data to report
		 rp = new ExtentReports();
		
		 //To generate the report & attaching the congifuration
		 rp.attachReporter(reports);
		 //To add extra information to the report
		 rp.setSystemInfo("reportername", "Supriya");
		 rp.setSystemInfo("Browser", "Chrome");
		 rp.setSystemInfo("OS", "windows");
		 
		Reporter.log("Testscript execution is started",true);
	
		
	
	
	
	
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		rp.flush();
		Reporter.log("Testscript execution is fineshed",true);
	}

	
	
	
}
