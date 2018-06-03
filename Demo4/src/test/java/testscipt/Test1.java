package testscipt;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import libraries.BaseTest;
import libraries.BasePage;
import pom.GoogleHomePO;
import pom.GoogleSearchResultPO;

public class Test1 extends BaseTest{	
	@Test
	public void testFacebookHome() {
		try {
			driver.get("https://www.google.com/");
			GoogleHomePO googlePO=new GoogleHomePO(driver);
			googlePO.searchTxtBx().sendKeys("facebook"+Keys.ENTER);
			GoogleSearchResultPO searchPO=new GoogleSearchResultPO(driver);
			searchPO.verifyElement(searchPO.facebooklink());
			searchPO.facebooklink().click();
			String eTitle = "Facebook – log in or sign up";
			wait.until(ExpectedConditions.titleContains(eTitle));
			String aTitle =driver.getTitle();
			Reporter.log("Title displayed is"+aTitle, true);
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {
			Assert.fail();
		}
	}

}
