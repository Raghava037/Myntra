package Generic;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Pompages.Homepages;
import Pompages.Men;

public class BaseClass {
	protected PropertiesFileUtility property;
	protected ExcelUtility excel;
	protected WebdriverUlities web;
	protected WebDriver driver;
	protected Homepages home;
	protected Men men;
	protected long time;

	@BeforeClass
	public void ClassConfiguration() {
		property = new PropertiesFileUtility();
		excel = new ExcelUtility();
		web = new WebdriverUlities();

		property.propertiesFileInitialization(IconstantPath.PROPERTIES_FILE_PATH);
		excel.excelInitialization(IconstantPath.EXCEL_FILE_PATH);
	}

	@BeforeMethod
	public void methodConfiguration() {
		time = Long.parseLong(property.featchproperties("timeouts"));
		driver = web.opeanApplication(property.featchproperties("browser"), time, property.featchproperties("url"));

		home=new Homepages(driver);

		Assert.assertTrue(home.getlogo().isDisplayed());

		men =new Men(driver);

	}

	@AfterMethod
	public void methodTearDown() {
		web.quitBrowser();
	}

	@AfterClass
	public void classTearDown() {
		excel.closeExcel();
	}

}
