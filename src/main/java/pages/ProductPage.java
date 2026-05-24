package pages;

import utilities.DriverFactory;
import utilities.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductPage {
	 WebDriver driver = DriverFactory.getDriver();
	 By searchBox = By.id("search_product");
	 By searchButton = By.id("submit_search");
	 By searchedProducts = By.xpath("//h2[contains(text(),'Searched Products')]");
	 By firstViewProduct = By.xpath("(//a[contains(text(),'View Product')])[1]");
	 By productName = By.xpath("//div[@class='product-information']/h2");
	// By firstAddToCart = By.xpath("(//a[contains(@class,'add-to-cart')])[1]");
	// By viewCartModal = By.xpath("//u[contains(text(),'View Cart')]");
	 By womenCategory = By.xpath("//a[@href='#Women']");
	 By dressCategory = By.xpath("//a[contains(@href,'category_products/1')]");
	 By categoryTitle = By.xpath("//h2[contains(text(),'Women')]");
	 
	 public void searchProduct(String keyword) 
	{ WaitUtils.visible(searchBox).sendKeys(keyword); 
	WaitUtils.clickable(searchButton).click(); }
	 
	 public void verifySearchResults() 
	{ 
		 Assert.assertTrue(WaitUtils.visible(searchedProducts).isDisplayed()); }
	 
	 /*public void openFirstProductDetails() 
	{ WaitUtils.clickable(firstViewProduct).click(); }*/
	 
	 public void verifyProductDetails() 
	{ 
		 Assert.assertTrue(WaitUtils.visible(productName).isDisplayed()); }
	 
	 public void openFirstProductDetails() 
	{ ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", WaitUtils.visible(firstViewProduct));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", WaitUtils.visible(firstViewProduct)); }
	 
	/*public void clickViewCartFromModal() 
	{ WaitUtils.clickable(viewCartModal).click(); }*/
	
	 public void selectWomenDressCategory() 
	{((JavascriptExecutor)driver).executeScript("arguments[0].click();", WaitUtils.visible(womenCategory));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", WaitUtils.visible(dressCategory));
	 }
	 
	 public void verifyCategoryFiltered() 
	{ 
		 Assert.assertTrue( WaitUtils.visible(categoryTitle).isDisplayed()); }
	}