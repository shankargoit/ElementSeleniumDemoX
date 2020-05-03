package RegisterDataField;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class FirefoxProfilePrefer4Download {
	
	@Test(enabled = true)
	public void FFdownLoadHandleForManualIntervationforCancelOrSave() throws AWTException, InterruptedException
	{
		
		FirefoxOptions options=new FirefoxOptions();
		
		options.setAcceptInsecureCerts(true);
		
		options.addPreference("browser.download.folderList", 2);
		
		options.addPreference("browser.helperApps.alwaysAsk.force", false);
		
		options.addPreference("browser.download.dir", "D:\\data");
		
		//options.addPreference("profile.default_content_setings.popups", 0);
		
		options.addPreference("browser.download.defaultFolder","D:\\\\data");
		
		options.addPreference("browser.download.manager.showWhenStarting", false);
		
		options.addPreference("browser.helperApps.neverAsk.saveToDisk", "multipart/x-zip,application/zip,application/x-zip-compressed,application/x-compressed,application/msword,application/csv,text/csv,image/png ,image/jpeg, application/pdf, text/html,text/plain,  application/excel, application/vnd.ms-excel, application/x-excel, application/x-msexcel, application/octet-stream");
		
		options.addPreference("pdfjs.disabled", true); 
		
		options.addPreference("browser.download.panel.shown", false);
		
		System.setProperty("webdriver.gecko.driver",
				"D:\\eclipseworkspace\\HandleElement\\driver\\64\\geckodriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.MARIONETTE, options);
		capabilities.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, 1);
		
		WebDriver driver=new FirefoxDriver(capabilities);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.seleniumhq.org/download/");
		
		driver.findElement(By.xpath("//p[contains(text(),'Latest stable version')]//a[contains(text(),'3.141.59')]")).click();;
		
	}
	
	@Test(enabled = false)
	public void FFdownLoadFileHandleForAutoDownloadLink()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\\\eclipseworkspace\\\\HandleElement\\\\driver\\\\64\\\\geckodriver.exe");
		String downloadFilepath = "D:\\\\data";
		
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		
		options.addPreference("browser.download.folderList", 2);
		options.addPreference("browser.helperApps.alwaysAsk.force", false);
		options.addPreference("browser.download.dir", downloadFilepath); 
		options.addPreference("browser.download.defaultFolder",downloadFilepath); 
		options.addPreference("browser.download.manager.showWhenStarting", false);
		options.addPreference("browser.helperApps.neverAsk.saveToDisk","multipart/x-zip,application/zip,application/x-zip-compressed,application/x-compressed,application/msword,application/csv,text/csv,image/png ,image/jpeg, application/pdf, text/html,text/plain,  application/excel, application/vnd.ms-excel, application/x-excel, application/x-msexcel, application/octet-stream");
		
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("http://www.seleniumhq.org/download/");
        driver.findElement(By.linkText("32 bit Windows IE")).click(); 
	}

	


}
