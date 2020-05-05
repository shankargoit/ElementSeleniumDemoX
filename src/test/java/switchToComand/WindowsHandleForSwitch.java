package switchToComand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.elements.WindowsHandle;

public class WindowsHandleForSwitch {
	
	WebDriver driver;
	
	WindowsHandle handle;
	
	String url="http://demo.automationtesting.in/Windows.html";
	
	@BeforeTest
	public void beforeTestForWindowsHandle()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipseworkspace\\HandleElement\\driver\\32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void openNewTabWindow()
	{
		handle=new WindowsHandle(driver);
		handle.windowNavigationforNewTab();
		
		
	}
	
	@Test
	public void openNewTabWindow1()
	{
		handle=new WindowsHandle(driver);
		handle.windowNavigationforNewTab();
		
		
	}
	
	@Test
	public void openNewTabWindow2()
	{
		handle=new WindowsHandle(driver);
		handle.windowNavigationforNewTab();
		
		
	}

}
