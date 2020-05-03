package RegisterDataField;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeProfilePref4Download {
	
	@Test(enabled=true)
	public void CCfileDownloadsupport()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipseworkspace\\HandleElement\\driver\\32\\chromedriver.exe");
		
		String downloadFilepath = "D:\\\\data";
		
		HashMap<String,Object> hmap=new HashMap<String,Object>();
		hmap.put("profile.default_content_settings.popups", 0);
		hmap.put("download.default_directory", downloadFilepath);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", hmap);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://www.seleniumhq.org/download/");
        driver.findElement(By.linkText("32 bit Windows IE")).click();
		
	}

}
