package RegisterDataField;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.elements.Register;

public class RegisterDataFormField {

	WebDriver driver;

	Register reg;

	@Test
	public void dataRegisterForm() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipseworkspace\\HandleElement\\driver\\32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		reg = new Register(driver);

		reg.enterFirstName("GudiaKumari");

		reg.enterLastName("Chowdhari");

		reg.enterAddressDetails("Barhi DB College Jainagar Madhubani Bihar");

		reg.enterEmailAddress("shdhna.cho@gmail.com");

		reg.dataMobileNumber("9876765434");

		reg.selectRadioButton();

		reg.tickOnCheckBox();

		reg.entertxtLanguage();

		reg.dropDownSelectionForSkills("Systems Administration");

		reg.dropDownSelectionForCountry("India");

		reg.searchAndEnterDropDownListselection("India");

		reg.selectYearFromDropDown("1991");

		reg.selectMonthFromDropDown("January");

		reg.selectDayFromDropDown("7");

		reg.txtboxforPassword("Shankar@123", "Shankar@123");

		reg.submitButton();

		reg.uploadFile();

	}

}
