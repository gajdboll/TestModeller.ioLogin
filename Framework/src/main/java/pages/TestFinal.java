package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;

import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://herokuapp.cloud.testinsights.io/app/#!/module-collection/guid/c9c9e114-043a-4b97-b2c7-01abf16957dd
@TestModellerModule(guid = "c9c9e114-043a-4b97-b2c7-01abf16957dd")
public class TestFinal extends BasePage
{
	public TestFinal (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//label[normalize-space()= 'Username']/../input");

	private By PasswordElem = By.xpath("//label[normalize-space()= 'Password']/../input");

	private By _LoginElem = By.xpath("//BUTTON[@class='radius']");

	private By _Secure_AreaElem = By.xpath("//H2[contains(text(),'Secure Area')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://the-internet.herokuapp.com/login");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://the-internet.herokuapp.com/login");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://the-internet.herokuapp.com/login");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://the-internet.herokuapp.com/login";

        if (!currentUrl.equals("http://the-internet.herokuapp.com/login")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Username
     * @name Enter Username
     */
 	public void Enter_Username(String Username)
 	{
 	    
 		WebElement elem = getWebElement(UsernameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

 			Assert.fail("Unable to locate object: " + UsernameElem.toString());
         }

 		elem.sendKeys(Username);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Username " + Username);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Username " + Username);
 	}
      
	/**
 	 * Enter Password
     * @name Enter Password
     */
 	public void Enter_Password(String Password)
 	{
 	    
 		WebElement elem = getWebElement(PasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

 			Assert.fail("Unable to locate object: " + PasswordElem.toString());
         }

 		elem.sendKeys(Password);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Password " + Password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Password " + Password);
 	}
     
	/**
 	 * Click  Login
     * @name Click  Login
     */
	public void Click__Login()
	{
        
		WebElement elem = getWebElement(_LoginElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Login", "Click__Login failed. Unable to locate object: " + _LoginElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Login", "Click__Login failed. Unable to locate object: " + _LoginElem.toString());

			Assert.fail("Unable to locate object: " + _LoginElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click__Login");

		TestModellerLogger.PassStep(m_Driver, "Click__Login");
	}
     
	/**
 	 * Click  Secure Area
     * @name Click  Secure Area
     */
	public void Click__Secure_Area()
	{
        
		WebElement elem = getWebElement(_Secure_AreaElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Secure_Area", "Click__Secure_Area failed. Unable to locate object: " + _Secure_AreaElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Secure_Area", "Click__Secure_Area failed. Unable to locate object: " + _Secure_AreaElem.toString());

			Assert.fail("Unable to locate object: " + _Secure_AreaElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click__Secure_Area");

		TestModellerLogger.PassStep(m_Driver, "Click__Secure_Area");
	}}