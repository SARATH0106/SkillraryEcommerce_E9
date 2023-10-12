package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
	//declaration
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-flat']")
	private WebElement addtocart;
	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusicon;
	
	//initialization
	public AddtoCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public void addtocartWebElement() {
		addtocart.click();
	}
	
	public WebElement getPlusIcon() {
		return plusicon;
	}
	
}
