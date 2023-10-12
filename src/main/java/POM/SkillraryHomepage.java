package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomepage {
	//Declaration
	//address of gears webelement
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn ;
	//address of skillrary demo app
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	//address of search text field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTf;
	//Address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchicon ;
	//Address of cookies
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement cookies ;
	
	//initialization
	public SkillraryHomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void gearsButton() {
		gearbtn.click();
	}
	
	public void skillrarydemoappWebElement() {
		skillrarydemoapp.click();
	}
	
	public void searchtextfield(String data) {
		searchTf.sendKeys(data);
	}
	
	 public void searchiconWebElement() {
		 searchicon.click();
	 }
	 
	 public void cookiesicon() {
		 cookies.click();
	 }
	
}
