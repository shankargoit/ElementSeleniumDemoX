package switchToComand;

import org.testng.annotations.Test;

public class HandleAlert {
	
	@Test(enabled=true)
	public void CCfileDownloadsupport()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipseworkspace\\HandleElement\\driver\\32\\chromedriver.exe");
		
		System.out.println("test git pull");
	}

}
