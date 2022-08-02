package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	// 1 ELE

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;

	@FindBy(tagName = "img")
	private List<WebElement> items;
	// List <WebElement> items = driver.findElements(by.tag(img)

	// 2 ELE

	@FindBy(xpath = "(//button[@type='button'])[15]")
	private WebElement addHpLp3065;

	@FindBy(id = "input-quantity")
	private WebElement quantityInput;

	@FindBy(id = "button-cart")
	private WebElement addToCartButton;

	@FindBy(xpath = "(//a[text()='HP LP3065'])[3]")
	private WebElement HPLPSuccessMessage;

	// 3 ELE

	@FindBy(xpath = "(//button[@type='button'])[12]")
	private WebElement addCanonEOS5DCamera;

	@FindBy(xpath = "//select[@id='input-option226']/option[@value='15']")
	private WebElement selectColor;

	@FindBy(id = "input-quantity")
	private WebElement quantityInput3;

	@FindBy(id = "button-cart")
	private WebElement addToCartButton3;

	@FindBy(xpath = "(//a[text()='Canon EOS 5D Camera'])[3]")
	private WebElement canonSuccessMessage;

	// 4 ELE

	@FindBy(xpath = "//img[@title='Canon EOS 5D Camera']")
	private WebElement CanonEOS5DCamera;

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeAReviewLink;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement yourNameField;

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement yourReviewField;

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> rating;

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewSuccessMessage;

// 1 

	public void clickOnDesktopTab() {
		Actions action = new Actions(driver);
		action.moveToElement(desktopTab).build().perform();
	}

	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}

	public List<WebElement> elements() {
		List<WebElement> DesktopsItems = items;
		return DesktopsItems;
	}

	// 2

	public void clickOnAddHPLP3065Item() {
		addHpLp3065.click();
	}

	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
	}

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	public String successMessage() {
		String actualResult = "Success: You have added " + HPLPSuccessMessage.getText() + " to your shopping cart!";
		return actualResult;
	}

	public boolean isSuccessMessagePresent() {
		if (HPLPSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}

	// 3

	public void clickOnAddCanonEOS5dCameraItem() {
		addCanonEOS5DCamera.click();
	}

	public void selectColor() {
		selectColor.click();
	}

	public String successMessageCanon() {
		String actualResult = "Success: You have added " + canonSuccessMessage.getText() + " to your shopping cart!";
		return actualResult;
	}

	public boolean isSuccessMessagePresentCanon() {
		if (canonSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}

	// 4
	public void clickOnCanonEOS5dCameraItem() {
		addCanonEOS5DCamera.click();
	}

	public void clickWriteAReviewLink() {
		writeAReviewLink.click();
	}

	public void enterYourName(String nameValue) {
		yourNameField.sendKeys(nameValue);
	}

	public void writeAReview(String reviewValue) {
		yourReviewField.sendKeys(reviewValue);
	}

	public List<WebElement> selectRating(String ratingValue) {
		List<WebElement> ratingElements = rating;
		for (WebElement element : ratingElements) {
			if (element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
		}
		return ratingElements;
	}

	public void clickAContinueButton() {
		continueButton.click();
	}

	public String reviewSuccessMessage() {
		String actualResult = reviewSuccessMessage.getText();
		return actualResult;
	}

	public boolean isSuccessMessagePresentReview() {
		if (reviewSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}

}