package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.BasePage;

public class GoogleSearchResultPO extends BasePage{
	
		public GoogleSearchResultPO(WebDriver driver) {
			super(driver);
		}	
		
		@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
		private WebElement facebookLink;
		
		public WebElement facebooklink() {
			return facebookLink;
		}
		
		@FindBy(xpath="//a[text()='Instagram']")
		private WebElement instagramLink;
		
		public WebElement instagramLink() {
			return instagramLink;
		}
		
		@FindBy(xpath="//a[text()='Login on Twitter']")
		private WebElement TwitterLink;
		
		public WebElement TwitterLink() {
			return TwitterLink;
		}
		
		@FindBy(xpath="//a[text()='Sign Up | LinkedIn']")
		private WebElement LinkedInLink;
		
		public WebElement LinkedInLink() {
			return LinkedInLink;
		}
	}



