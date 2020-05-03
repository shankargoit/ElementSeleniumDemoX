package pom.elements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register {

	WebDriver driver;

	public Register(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement txtFirstName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement txtLastName;

	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	private WebElement txtAddress;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement txtEmail;

	@FindBy(xpath = "//input[@type='tel']")
	private WebElement txtMobNumber;

	@FindBy(xpath = "//input[@type='radio'][@value='FeMale']")
	private WebElement rdbtnFemale;

	@FindBy(xpath = "//div[@id='msdd']")
	private WebElement txtLanguage;
	
	@FindBy(xpath = "//a[contains(text(),'Bulgarian')]")
	private WebElement lanSelectionFromMulti;
	
	@FindBy(xpath = "//select[@id='Skills']")
	private WebElement selectSkills;
	
	@FindBy(xpath = "//select[@id='countries']")
	private WebElement selectCountry;

	@FindBy(xpath = "//span[@role='combobox']")
	private WebElement searchandEnterDropDown;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement txtfieldForSearchElement;
	
	@FindBy(xpath = "//select[@id='yearbox']")
	private WebElement selectYearfromTheCalander;
	
	@FindBy(xpath = "//select[@placeholder='Month']")
	private WebElement selectMonthfromTheCalander;
	
	@FindBy(xpath = "//select[@id='daybox']")
	private WebElement selectDayfromTheCalander;
	
	@FindBy(xpath = "//input[@id='firstpassword']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='secondpassword']")
	private WebElement txtSecondpass;
	
	@FindBy(xpath = "//button[@id='submitbtn']")
	private WebElement btnSubmit;


	public void enterFirstName(String FirstName) {
		txtFirstName.sendKeys(FirstName);

	}

	public void enterLastName(String LastName) {
		txtLastName.sendKeys(LastName);
	}

	public void enterAddressDetails(String address) {
		txtAddress.sendKeys(address);
	}

	public void enterEmailAddress(String emailID) {
		txtEmail.sendKeys(emailID);
	}

	public void dataMobileNumber(String number) {
		txtMobNumber.sendKeys(number);
	}

	public void selectRadioButton() {
		rdbtnFemale.click();
	}
	
	public void tickOnCheckBox()
	{
		 List<WebElement> checkboxlist =
		 driver.findElements(By.xpath("//input[@type='checkbox']"));
				  
		 for(int i=1;i<=checkboxlist.size();i++) 
		 {
	     driver.findElement(By.xpath("//input[@id='checkbox"+i+"']")).click(); 
	     }
	}

	public void entertxtLanguage() {
	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", txtLanguage);
		txtLanguage.click();
		lanSelectionFromMulti.click();
	}
	
	public void dropDownSelectionForSkills(String skills)
	{
		
		Select select=new Select(selectSkills);
		
		List<WebElement> dropDownList = select.getOptions();
		
		for(WebElement items:dropDownList)
		{
			System.out.println("Element from dropDown:"+items.getText());
			
			
			
		}
		
		select.selectByVisibleText(skills);
	}
	
	public void dropDownSelectionForCountry(String country)
	{
		
		Select select=new Select(selectCountry);
		
		List<WebElement> dropDownList = select.getOptions();
		
		for(WebElement items:dropDownList)
		{
			System.out.println("Element from dropDown:"+items.getText());
			
			
			
		}
		
		select.selectByVisibleText(country);
	}
	
	public void searchAndEnterDropDownListselection(String comboSearchData) throws InterruptedException, AWTException
	{
		searchandEnterDropDown.click();
		
		//searchandEnterDropDown.sendKeys(comboSearchData);

		txtfieldForSearchElement.sendKeys(comboSearchData);
		
		Robot rt=new Robot();
		
		rt.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	
	public void selectYearFromDropDown(String year)
	{
		Select sel=new Select(selectYearfromTheCalander);
		
		sel.selectByVisibleText(year);
	}
	
	public void selectMonthFromDropDown(String month)
	{
		Select sel=new Select(selectMonthfromTheCalander);
		
		sel.selectByVisibleText(month);
	}
	
	public void selectDayFromDropDown(String day)
	{
		
		Select sel=new Select(selectDayfromTheCalander);
		
		sel.selectByVisibleText(day);
	}
	
	public void txtboxforPassword(String password,String secondpassword)
	{
		txtPassword.sendKeys(password);
		txtSecondpass.sendKeys(secondpassword);
		
	}
	
	public void uploadFile() throws InterruptedException
	{
	 WebElement uploadfile = driver.findElement(By.xpath("//input[@id='imagesrc']"));
	 
	 Thread.sleep(4000);
	 
	 uploadfile.sendKeys("C:\\Users\\vimal\\Desktop\\data\\hello.html");
	}
	
	public void submitButton()
	{
		btnSubmit.click();
	}
}

