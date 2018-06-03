package libraries;



	import java.sql.Driver;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class BaseTest implements Constants {
		public WebDriver driver;
		public WebDriverWait wait;
		
		
		@BeforeMethod
		public void launchBrowser() {
			System.setProperty(CHROME_KEY,CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			wait=new WebDriverWait(driver, 20);
		}
		
	
	
	@AfterMethod
		public void closeBrowser(ITestResult r) {
			//r.getstatus()==1(Test Pass))
			//(r.getStatus()==2(Test Fail)
		if(r.getStatus()==2)
		{
				Photo.getScreenShot(driver,IMG_PATH);
			}
			driver.quit();
		}  
	}



	


