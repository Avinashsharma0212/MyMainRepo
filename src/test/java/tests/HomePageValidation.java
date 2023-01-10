package tests;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import resources.Base;

public class HomePageValidation extends Base{ 
	
    HomePageObjects homepage;
	
		
	@BeforeTest
	@Parameters({"url","browser"})
	public void initialization(String url, String browser) {
	
		driversetup();
		driver.get(url);
		setExtentReport();
	}
	
	@Test(priority=1)
	public void lowcosttest() throws InterruptedException, IOException {
		
        Properties prop = new Properties();
        prop.load(HomePageValidation.class.getClassLoader().getResourceAsStream("MyProject.properties"));
        String UName = prop.getProperty("uname");
        String Pwd = prop.getProperty("pwd");
        System.out.println("usernameValue is ==> " +UName);
        System.out.println("passwordValue is ==> " +Pwd);
		homepage = new HomePageObjects(driver);
		homepage.SearchFlightHeader().isDisplayed();
		driver.navigate().refresh();
		homepage.ClickOneWayDropDown().click();
		homepage.SelectOneWayDropDownOption().click();
		homepage.ClickWhereFrom().sendKeys("BLR");
		homepage.SelectWhereFrom().click();
		homepage.ClickWhereTo().sendKeys("DEL");
		homepage.SelectWhereTo().click(); 		
		homepage.ClickSearchFlightsBtn().click();
		
		
		WebElement slider =homepage.SlidetoLowestPrice();		
		//homepage.SlidetoLowestPrice().click();
		WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(40));
		expWait.until(ExpectedConditions.elementToBeClickable(slider)); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true);",slider);
    	Actions actions = new Actions(driver);
    	actions.moveToElement(slider);
    	actions.clickAndHold(slider);
    	actions.moveByOffset(76, 500).release().build().perform();
	}

	@AfterTest(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}
	}

	
	
	