package resources;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	
	public static WebDriver driver;	

	
	public WebDriver driversetup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
}
	public void setExtentReport() {
		 
		  ExtentSparkReporter htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/extentReports/CleartripTestReport.html");
		  htmlReporter.config().setDocumentTitle("Cleartrip Automation Report"); 
		  htmlReporter.config().setReportName("Functional Testing"); 
		  htmlReporter.config().setTheme(Theme.DARK);
		  
		  ExtentReports extent = new ExtentReports();
		  extent.attachReporter(htmlReporter);
		  
		  extent.setSystemInfo("Host name", "localhost");
		  extent.setSystemInfo("Environemnt", "QA");
		  extent.setSystemInfo("user", "Avinash");
		 }
	

	
	
	
	
	
	}
