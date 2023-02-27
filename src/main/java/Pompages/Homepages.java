package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepages {

	//declaration
	@FindBy (xpath = "//a[@data-reactid=\"16\"]")
	private WebElement homepagelogo;
	@FindBy(xpath = "(//a[@data-index=\"0\"])[1]")
	private WebElement Men;
	@FindBy(xpath = "//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a")
	private WebElement Women;
	
	//initialization
	public Homepages(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utlization
	public WebElement getlogo()
	{
		return homepagelogo;
	}
	public void clickmen()
	{
		Men.click();
	}
	public void clickWomen()
	{
		Women.click();
	}
	
}
