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

	public class Test4 extends BaseTest{	
		@Test
		public void testtwitterHome() {
			try {
				driver.get("https://www.google.com/");
				GoogleHomePO googlePO=new GoogleHomePO(driver);
				googlePO.searchTxtBx().sendKeys("LinkedIn"+Keys.ENTER);
				GoogleSearchResultPO searchPO=new GoogleSearchResultPO(driver);				
				searchPO.LinkedInLink().click();
				String eTitle = "Sign Up | LinkedIn1";
				wait.until(ExpectedConditions.titleContains(eTitle));
				String aTitle =driver.getTitle();
				Reporter.log("Title displayed is"+aTitle, true);
				Assert.assertEquals(aTitle, eTitle);
			} catch (Exception e) {
				Assert.fail();
			}
		}

	}




