package switchToComand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.elements.Alerts;

public class AlertHandle {
	
	static WebDriver driver;
	
	Alerts alert;
	public static String url="http://demo.automationtesting.in/Alerts.html";

	@BeforeMethod
	public void alertDemo()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipseworkspace\\HandleElement\\driver\\32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test(enabled = true)
	public void asimpleAlert() {
		
		alert=new Alerts(driver);
		alert.clickOnSimpleAlert("I am an alert box!");
		driver.close();
		}
	
	@Test(enabled = true)
	public void confirmationAlertForAccept() {
		
		alert=new Alerts(driver);
		alert.handleConfirmationAlertForAccept("Press a Button !");
		driver.close();
		}
	
	@Test(enabled = true)
	public void confirmationAlertFordismiss() {
		
		alert=new Alerts(driver);
		alert.handleConfirmationAlertForDismiss();
		driver.close();
		}
	
	@Test(enabled = true)
	public void sendTextMsgforAlertboxAccept() {
		
		alert=new Alerts(driver);
		alert.handleAlertforTextAccept("Hi Automation Engineer");
		driver.close();
		}
	
	@Test(enabled = true)
	public void sendTextMsgforAlertboxDismiss() {
		
		alert=new Alerts(driver);
		alert.handleAlertforTextdismiss();
		driver.close();
		}

}
