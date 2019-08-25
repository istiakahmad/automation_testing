package ahmad.testingProject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homepage.PageElement;

public class TestCase {

	WebDriver driver = new ChromeDriver();

	PageElement element = new PageElement(driver);

	@BeforeTest
	public void beforeTest() {
		driver.get("http://automationpractice.com");
	}

	@Test(priority = 1)
	public void registration() throws InterruptedException {
		element.registration();
		Thread.sleep(2000);
		assertEquals(element.accInfo(),
				"Welcome to your account. Here you can manage all of your personal information and orders.");
	}

	@Test(priority = 2)
	public void login() throws InterruptedException {
		element.login();
		Thread.sleep(2000);
		assertEquals(element.accInfo(),
				"Welcome to your account. Here you can manage all of your personal information and orders.");
	}

	@Test(priority = 3)
	public void newsLetterVerify() throws InterruptedException {
		element.newsLetterVerify();
		Thread.sleep(2000);
		assertEquals(element.newsLetterInfo(), "Newsletter : This email address is already registered.");
	}

	@Test(priority = 4)
	public void homePageElementCheck() throws InterruptedException {
		element.logOut();
		assertEquals(element.homePageElement(), "Our stores");
		assertEquals(element.homePageElement(), "Specials");
		assertEquals(element.homePageElement(), "Information");
		assertEquals(element.homePageElement(), "Contact US");
		assertEquals(element.homePageElement(), "Sign In");
		assertEquals(element.homePageElement(), "View Product");
		assertEquals(element.homePageElement(), "Catalog");
	}

	@Test(priority = 5)
	public void searchAndPurchase() throws InterruptedException {
		element.searchAndPurchase();
		Thread.sleep(2000);
		assertEquals(element.purchaseConfirm(), "Your order on My Store is complete.");
	}

	@Test(priority = 6)
	public void purchase2() throws InterruptedException {
		element.purchase2();
		Thread.sleep(2000);
		assertEquals(element.purchaseConfirm(), "Your order on My Store is complete.");
	}
}
