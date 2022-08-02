package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	// 1 OBJ

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyTab;

	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euro;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement shoppingCart;

	// 2 OBJ
	@FindBy(xpath = "//p[@class='text-center']")
	private WebElement infoAboutShoppingCart;

	// 1
	public void clickOnCurrency() {
		currencyTab.click();
	}

	public void clickOnEuro() {
		euro.click();
	}

	public String cartTotalCurrency() {
		String actualResult = shoppingCart.getText();
		return actualResult;
	}

	public boolean iscartTotalCurrencyCorrect() {
		if (shoppingCart.isDisplayed())
			return true;
		else
			return false;
	}

	// 2
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}

	public String shoppingCartText() {
		String actualResult = infoAboutShoppingCart.getText();
		return actualResult;
	}

	public boolean isInfoAboutShoppingCartCorrect() {
		if (infoAboutShoppingCart.isDisplayed())
			return true;
		else
			return false;
	}

}