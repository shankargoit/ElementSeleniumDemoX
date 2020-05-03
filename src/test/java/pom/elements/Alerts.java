package pom.elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Alerts {
	
	WebDriver driver;

	public Alerts(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement buttonsimpleAlert;
	
	@FindBy(xpath = "//a[contains(text(),'Alert with OK &')]")
	private WebElement lnkforAlert;
	
	@FindBy(xpath = "//button[contains(text(),'confirm box')]")
	private WebElement buttononfirmationAlert;
	
	@FindBy(xpath = "//a[contains(text(),'Alert with Textbox')]")
	private WebElement lnkforAlertText;
	
	@FindBy(xpath = "//button[contains(text(),'demonstrate')]")
	private WebElement btnforAlertTextelement;
	
	@FindBy(xpath = "//p[@id='demo1']")
	private WebElement paragraphVerifyForAlertText;
	
	public void clickOnSimpleAlert(String expectedAlertMsg)

	{
		buttonsimpleAlert.click();
		Alert alert=driver.switchTo().alert();
		String actualAlertMsg=alert.getText();
		System.out.println("Alert message actual :"+actualAlertMsg);
		System.out.println("Alert msg expected:"+expectedAlertMsg);
		Assert.assertEquals(actualAlertMsg, expectedAlertMsg);
		alert.accept();
	}
	
	public void handleConfirmationAlertForAccept(String expectedAlertMsg)
	{
		lnkforAlert.click();
		buttononfirmationAlert.click();
		Alert alert=driver.switchTo().alert();
		String actualAlertMsg=alert.getText();
		System.out.println("Alert message actual :"+actualAlertMsg);
		System.out.println("Alert msg expected:"+expectedAlertMsg);
		Assert.assertEquals(actualAlertMsg, expectedAlertMsg);
		alert.accept();
	}
	
	public void handleConfirmationAlertForDismiss()
	{
		lnkforAlert.click();
		buttononfirmationAlert.click();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void handleAlertforTextAccept(String enteralertText)
	{
		lnkforAlertText.click();
		btnforAlertTextelement.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(enteralertText);
		alert.accept();
		
		String ExpectedafteralertText="Hello "+enteralertText+" How are you today";
		
		String actualparagraphDataValidation=paragraphVerifyForAlertText.getText();
		
		System.out.println("Data from expected :"+ExpectedafteralertText);
		
		System.out.println("data from paragraph :"+actualparagraphDataValidation);
		
		Assert.assertEquals(actualparagraphDataValidation, ExpectedafteralertText);
		
	}
	
	public void handleAlertforTextdismiss()
	{
		lnkforAlertText.click();
		btnforAlertTextelement.click();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
}
