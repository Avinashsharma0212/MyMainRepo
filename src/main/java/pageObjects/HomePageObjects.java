package pageObjects;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Base;
import utils.utilFunctions;

public class HomePageObjects extends Base{
	
		
        WebDriver driver;
        public HomePageObjects(WebDriver driver)
        {
		    this.driver = driver;
		    
		}
        
	    By SearchFlightHeader=By.xpath("//h1");   //validating header
	    By ClickOneWayDropDown=By.xpath("//div[@class='p-relative']/button[1]");
	    By SelectOneWayDropDownOption=By.xpath("//span[contains(@class,'ml-5 dropdown-text fw-500 fs-4 lh-24')]");
	    By ClickWhereFrom=By.xpath("//input[@placeholder='Where from?']");
	    By SelectWhereFrom=By.xpath("//ul[@class='airportList']/li/div/div[2]/p[contains(text(),'BLR')]");
	    By ClickWhereTo=By.xpath("//input[@placeholder='Where to?']");
	    By SelectWhereTo=By.xpath("//ul[@class='airportList']/li/div/div[2]/p[contains(text(),'DEL')]");
	    //By SelectSingleJrnyDate=By.xpath("//div[@class='flex flex-middle p-relative homeCalender']/button[1]");
	    By ClickSearchFlightsBtn=By.xpath("//div[contains(@class,'home-search-btn')]");
	    By SlidetoLowestPrice=By.xpath("//div[@data-ct-handle='oneWayPriceFilter']//div[@role='slider']");
	    
        //WebElement Slider = driver.findElement(By.xpath("//div[@data-ct-handle='oneWayPriceFilter']//div[@role='slider']"));

	    
	     
	    public WebElement SearchFlightHeader()
	    {
	    	return driver.findElement(SearchFlightHeader);
	    	
	    }
     
        
        public  WebElement ClickOneWayDropDown() 
        {
    	    return driver.findElement(ClickOneWayDropDown);
    		
        }
        
        public  WebElement SelectOneWayDropDownOption() 
        {
    		return driver.findElement(SelectOneWayDropDownOption);
    		
        }
        
        public  WebElement ClickWhereFrom() 
        {
    		return driver.findElement(ClickWhereFrom);
    		
        }
        
        public  WebElement SelectWhereFrom() 
        {
    		return driver.findElement(SelectWhereFrom);
    		
        }
        
        public  WebElement ClickWhereTo() 
        {
    		return driver.findElement(ClickWhereTo);
    		
        }
        
        public  WebElement SelectWhereTo() 
        {
    		return driver.findElement(SelectWhereTo);
    		
        }
        
        public  WebElement ClickSearchFlightsBtn() 
        {
    		return driver.findElement(ClickSearchFlightsBtn);
    		
        }
        
        public  WebElement SlidetoLowestPrice() 
        {
        	
        	return driver.findElement(SlidetoLowestPrice);

        }
       
}
