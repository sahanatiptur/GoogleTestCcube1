package libraries;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Reporter;

	public class BasePage {
		public WebDriverWait wait;
		public WebDriver driver;
		public BasePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			wait=new WebDriverWait(driver, 10);
		}
		
		public void verifyTitle(String title) {
			try {
				wait.until(ExpectedConditions.titleContains(title));
				String aTitle = driver.getTitle();
				Reporter.log("Title is matching", true);
				Reporter.log("The title displayed is "+aTitle , true);
			} catch (TimeoutException e) {
				Reporter.log("Title not dispalyed", true);
				String aTitle = driver.getTitle();
				Reporter.log("The title displayed is "+aTitle , true);
			}		
		}
		public void verifyElement(WebElement element) {
			try {
				wait.until(ExpectedConditions.visibilityOf(element));
				Reporter.log("Element is present", true);
			} catch (TimeoutException e) {
				Reporter.log("Element is not present", true);			
			}
			
			}

	}


