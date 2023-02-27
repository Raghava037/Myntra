package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Men 
{
	@FindBy(xpath = "//a[@data-reactid=\"16\"]")
	private WebElement homapagelogo;
	@FindBy(xpath = "//*[@id=\"mountRoot\"]/div/main/div/div[3]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/a/div/picture/img")
	private WebElement cap;
	
	//initilization
	public Men (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement homepage()
	{
		return homapagelogo;
	}
	public void ClickOncap()
	{
		cap.click();
	}
}
