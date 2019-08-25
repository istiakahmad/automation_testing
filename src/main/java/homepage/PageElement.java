package homepage;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class PageElement {

	WebDriver driver;

	Random random = new Random();

	RandomString randomString = new RandomString(8);

	int intVal;
	String strVal;
	String email;
	String pass = "Ahmad";

	@FindBy(xpath = "//A[@class='login']")
	WebElement signInButton;

	@FindBy(xpath = "//INPUT[@id='email_create']")
	WebElement emailField;

	@FindBy(xpath = "(//SPAN)[29]")
	WebElement createButton;

	@FindBy(xpath = "//INPUT[@id='id_gender1']")
	WebElement genderRadio;

	@FindBy(xpath = "//INPUT[@id='customer_firstname']")
	WebElement fnameField;

	@FindBy(xpath = "//INPUT[@id='customer_lastname']")
	WebElement lnameField;

	@FindBy(xpath = "//INPUT[@id='passwd']")
	WebElement passField;

	@FindBy(xpath = "//SELECT[@id='days']")
	WebElement daySelect;

	@FindBy(xpath = "//SELECT[@id='months']")
	WebElement monthSelect;

	@FindBy(xpath = "//SELECT[@id='years']")
	WebElement yearSelect;

	@FindBy(xpath = "//INPUT[@id='newsletter']")
	WebElement newsSelect;

	@FindBy(xpath = "//INPUT[@id='address1']")
	WebElement address;

	@FindBy(xpath = "//INPUT[@id='city']")
	WebElement city;

	@FindBy(xpath = "//SELECT[@id='id_state']")
	WebElement state;

	@FindBy(xpath = "//INPUT[@id='postcode']")
	WebElement postCode;

	@FindBy(xpath = "//SELECT[@id='id_country']")
	WebElement country;

	@FindBy(xpath = "//INPUT[@id='phone_mobile']")
	WebElement mobile;

	@FindBy(xpath = "//INPUT[@id='alias']")
	WebElement aliasAddress;

	@FindBy(xpath = "(//SPAN)[42]")
	WebElement regButton;

	@FindBy(xpath = "//P[@class='info-account']")
	WebElement accountInfoTextBox;

	@FindBy(xpath = "//A[@class='logout']")
	WebElement logOutButton;

	@FindBy(xpath = "//INPUT[@id='email']")
	WebElement logInEmailField;

	@FindBy(xpath = "//INPUT[@id='passwd']")
	WebElement logInPassField;

	@FindBy(xpath = "(//SPAN)[31]")
	WebElement logInButton;

	@FindBy(xpath = "//INPUT[@id='newsletter-input']")
	WebElement newsLetterInput;

	@FindBy(xpath = "(//BUTTON[@type='submit'])[2]")
	WebElement newsLetterSubmit;

	@FindBy(xpath = "//P[@class='alert alert-danger']")
	WebElement newsLetterConfirm;

	@FindBy(xpath = "//INPUT[@id='search_query_top']")
	WebElement searchBox;

	@FindBy(xpath = "(//BUTTON[@type='submit'])[1]")
	WebElement searchButton;

	@FindBy(xpath = "//A[@id='color_2']")
	WebElement tShirtColor;

	@FindBy(xpath = "(//SPAN[text()='Add to cart'])[1]")
	WebElement addToCart;

	@FindBy(xpath = "(//SPAN)[31]")
	WebElement processCheckout;

	@FindBy(xpath = "(//SPAN)[61]")
	WebElement processCheckout2;

	@FindBy(xpath = "(//SPAN)[44]")
	WebElement processCheckout3;

	@FindBy(xpath = "//INPUT[@id='cgv']")
	WebElement agrement;

	@FindBy(xpath = "(//SPAN)[38]")
	WebElement processCheckout4;

	@FindBy(xpath = "//A[@class='cheque']")
	WebElement payMathod;

	@FindBy(xpath = "(//SPAN)[36]")
	WebElement payFinal;

	@FindBy(xpath = "//P[@class='alert alert-success']")
	WebElement paymentConf;

	@FindBy(xpath = "//IMG[@class='logo img-responsive']")
	WebElement homeBack;

	@FindBy(xpath = "(//SPAN[text()='Add to cart'])[3]")
	WebElement addToCart2;

	@FindBy(id = "index")
	WebElement homePage;

	public PageElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void registration() throws InterruptedException {
		signInButton.click();
		Thread.sleep(2000);
		email = emailGenerate();
		emailField.sendKeys(email);
		createButton.click();
		Thread.sleep(2000);
		genderRadio.click();
		fnameField.sendKeys("Istiak");
		lnameField.sendKeys("Ahmad");
		passField.sendKeys(pass);

		Select selectDate = new Select(daySelect);
		selectDate.selectByValue("13");

		Select selectMonth = new Select(monthSelect);
		selectMonth.selectByIndex(4);

		Select selectYear = new Select(yearSelect);
		selectYear.selectByValue("1992");

		newsSelect.click();
		address.sendKeys(strGenerate());
		city.sendKeys("New York");

		Select selectState = new Select(state);
		selectState.selectByIndex(10);

		postCode.sendKeys("12170");

		mobile.sendKeys("0187656464");
		aliasAddress.sendKeys("dhaka");
		regButton.click();

	}

	public void login() throws InterruptedException {
		logOut();
		Thread.sleep(2000);
		logInEmailField.sendKeys(email);
		logInPassField.sendKeys(pass);
		logInButton.click();
	}

	public void newsLetterVerify() throws InterruptedException {
		newsLetterInput.sendKeys(email);
		Thread.sleep(2000);
		newsLetterSubmit.click();
	}

	public void searchAndPurchase() throws InterruptedException {
		signInButton.click();
		Thread.sleep(2000);
		logInEmailField.sendKeys(email);
		logInPassField.sendKeys(pass);
		logInButton.click();
		Thread.sleep(2000);
		searchBox.sendKeys("T shirt");
		searchButton.click();
		Thread.sleep(2000);
		tShirtColor.click();
		Thread.sleep(2000);
		addToCart.click();
		Thread.sleep(2000);
		processCheckout.click();
		Thread.sleep(2000);
		processCheckout2.click();
		Thread.sleep(2000);
		processCheckout3.click();
		Thread.sleep(2000);
		agrement.click();
		processCheckout4.click();
		Thread.sleep(2000);
		payMathod.click();
		Thread.sleep(2000);
		payFinal.click();

	}

	public void purchase2() throws InterruptedException {
		homeBack.click();
		Thread.sleep(2000);
		addToCart2.click();
		Thread.sleep(2000);
		processCheckout.click();
		Thread.sleep(2000);
		processCheckout2.click();
		Thread.sleep(2000);
		processCheckout3.click();
		Thread.sleep(2000);
		agrement.click();
		processCheckout4.click();
		Thread.sleep(2000);
		payMathod.click();
		Thread.sleep(2000);
		payFinal.click();

	}

	public String accInfo() {
		String result = accountInfoTextBox.getText();
		System.out.println("Reg Confirmation Text: " + result);
		return result;
	}

	public String newsLetterInfo() {
		String result = newsLetterConfirm.getText();
		System.out.println("NewsLetter Confirmation Text: " + result);
		return result;
	}

	public String purchaseConfirm() {
		String result = paymentConf.getText();
		System.out.println("Payment Confirmation Text: " + result);
		return result;
	}

	public void logOut() {
		logOutButton.click();
	}

	public String homePageElement() {
		return homePage.getText();
	}

	public String emailGenerate() {

		intVal = random.nextInt(9999);
		strVal = randomString.nextString();
		String email = strVal + intVal + "@gmail.com";

		System.out.println("Generated Email: " + email);

		return email;
	}

	public String strGenerate() {
		String str = randomString.nextString();
		System.out.println("Generated String : " + str);
		return str;
	}

}
