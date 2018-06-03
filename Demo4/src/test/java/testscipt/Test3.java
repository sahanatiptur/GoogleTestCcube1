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

	public class Test3 extends BaseTest{	
		@Test
		public void testtwitterHome() {
			try {
				driver.get("https://www.google.com/");
				GoogleHomePO googlePO=new GoogleHomePO(driver);
				googlePO.searchTxtBx().sendKeys("Twitter"+Keys.ENTER);
				GoogleSearchResultPO searchPO=new GoogleSearchResultPO(driver);
				searchPO.verifyElement(searchPO.TwitterLink());
				searchPO.TwitterLink().click();
				String eTitle = "Login on Twitter";
				wait.until(ExpectedConditions.titleContains(eTitle));
				String aTitle =driver.getTitle();
				Reporter.log("Title displayed is"+aTitle, true);
				Assert.assertEquals(aTitle, eTitle);
			} catch (Exception e) {
				Assert.fail();
			}
		}
	}


