package RegisterDataField;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DownloadingFilesUsingWget 
{

	@Test(enabled = false)
	public void handleDownloadFile()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipseworkspace\\HandleElement\\driver\\32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/yahoo.html");

		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.id("messenger-download"));
		
		String sourceLocation = ele.getAttribute("href");
		
		System.out.println(sourceLocation);
        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;
        
        try {
            Process exec = Runtime.getRuntime().exec(wget_command);
            int exitVal = exec.waitFor();
            System.out.println("Exit value: " + exitVal);
            } catch (Exception ex) {
            System.out.println(ex.toString());
            }
            driver.close();
        }
	
	@Test(enabled = false)
	public void filedowlod2()
	{
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipseworkspace\\HandleElement\\driver\\32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.videolan.org/vlc/download-windows.html");

		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//span[@class='downloadText']"));
		
		String beforeclick=driver.getTitle();
		
		System.out.println(beforeclick);
		
		ele.click();
		
		String afterclick=driver.getTitle();
		
		System.out.println(afterclick);
		
		  String wget_command =
		  "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " ;
		  
		  try { Process exec = Runtime.getRuntime().exec(wget_command); int exitVal =
		  exec.waitFor(); System.out.println("Exit value: " + exitVal); } catch
		  (Exception ex) { System.out.println(ex.toString()); } driver.close();
		 
	}
	
	@Test
	public void downloadFile()
	{
		String downloadFilepath = "G:\\Installations\\downloads";
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		
		chromePrefs.put("profile.default_content_settings.popups", 0);
		
		chromePrefs.put("download.default_directory", downloadFilepath);
		
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("prefs", chromePrefs);
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipseworkspace\\HandleElement\\driver\\32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
	}
	}

