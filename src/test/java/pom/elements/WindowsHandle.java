package pom.elements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowsHandle {
	
	WebDriver driver;

	public WindowsHandle(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")
	private WebElement lnkForNewWindow;
	
	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']//a[@class='active'][contains(text(),'Download')]")
	private WebElement lnkClickOnDownload;
	
	
	public void windowNavigationforNewTab()
	{
		String childWinitr="";
		
		
		String parentwin = driver.getWindowHandle();
		
		String parentWinTitle=driver.getTitle();
		
		System.out.println(parentWinTitle);
		
		lnkForNewWindow.click();
		
		Set<String> listwin = driver.getWindowHandles();
		
		Iterator<String> itr = listwin.iterator();
		
		while(itr.hasNext())
		{
			 childWinitr=itr.next();
		}
		
		driver.switchTo().window(childWinitr);
		
		String getChildTitle=driver.getTitle();
		
		lnkClickOnDownload.click();
		
		System.out.println(getChildTitle);
		
		driver.switchTo().window(parentwin);
		
		String newParentWinTitle=driver.getTitle();
		
		if(newParentWinTitle.equals(parentWinTitle))
		{
			System.out.println("Navaigation from Parent to Child To Parent worked properly-------------");
		}
	}

}
