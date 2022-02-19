package acttitime.testScript;

import org.testng.annotations.Test;

import acttitime.genericLibrary.BaseClass;

public class FetchTitleTest  extends BaseClass {
	@Test
	public void getTitle()
	{
	System.out.println(driver.getTitle());
	}

}
