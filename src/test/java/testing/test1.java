package testing;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.BaseClass;


public class test1 extends BaseClass
{

	@Test
	
	public void test1() throws InterruptedException
	{
		SoftAssert soft=new SoftAssert();
		home.clickmen();
		
		Thread.sleep(1000);
		men.ClickOncap();
	}
}
