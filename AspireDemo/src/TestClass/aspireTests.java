package TestClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import BaceClass.Bace;

public class aspireTests extends Bace {
	
	@Test()
	public void applicationLoginTest() {
		System.out.println("Application Login Starts");
		try {
			initialiseBrowser();
			driver.get("https://aspireapp.odoo.com");
			driver.findElement(By.xpath(loginEmailXpath)).sendKeys(loginUserName);
			driver.findElement(By.xpath(loginPasswordXpath)).sendKeys(loginPassword);
			driver.findElement(By.xpath(loginButtonXpath)).click();
		}  catch (Exception e) { 
			throw(e);
		}
		
		System.out.println("Application Logs Successfully");
	}
	
	@Test()
	public void createNewProductAndUpdateQuantity() {
		System.out.println("Starts with creation of new product");
		try {
			createProductName();
			waitTillElementPresent(inventoryXpath);
			driver.findElement(By.xpath(inventoryXpath)).click();
			waitTillElementPresent(productsMainTabXpath);
			driver.findElement(By.xpath(productsMainTabXpath)).click();
			driver.findElement(By.xpath(productSubTabXpath)).click();
			waitTillElementPresent(createProductButtonXpath);
			driver.findElement(By.xpath(createProductButtonXpath)).click();
			waitTillElementPresent(productNameXpath);
			driver.findElement(By.xpath(productNameXpath)).sendKeys(productName);
			driver.findElement(By.xpath(updateQuantityLinkXpath)).click();
			waitTillElementPresent(updateCreateXpath);
			driver.findElement(By.xpath(updateCreateXpath)).click();
			waitTillElementPresent(giveQuantityXpath);
			driver.findElement(By.xpath(giveQuantityXpath)).clear();
			driver.findElement(By.xpath(giveQuantityXpath)).sendKeys("12");
			waitTillElementPresent(createQuantityXpath);
			driver.findElement(By.xpath(createQuantityXpath)).click();
			driver.findElement(By.xpath(homeXpath)).click();
		}  catch (Exception e) { 
			throw(e);
		}
		
		System.out.println("New Product has been created successfully and Quantity Updated successfully ");
		
	}
	
	@Test()
	public void creationOfNewManufactureOrderforProduct() {
		
		System.out.println("Manufacture order creation Starts");
		try {
			waitTillElementPresent(manufactorIconXpath);
			driver.findElement(By.xpath(manufactorIconXpath)).click();
			waitTillElementPresent(createManufactureOrder);
			driver.findElement(By.xpath(createManufactureOrder)).click();
			waitTillElementPresent(manufactorProductInputXpath);
			driver.findElement(By.xpath(manufactorProductInputXpath)).sendKeys(productName);
			waitTillElementPresent(firstOptionXpath);
			driver.findElement(By.xpath(firstOptionXpath)).click();
			driver.findElement(By.xpath(addlineXpath)).click();
			waitTillElementPresent(inputproductXpath);
			driver.findElement(By.xpath(inputproductXpath)).sendKeys(productName);
			waitTillElementPresent(inputProductFirstOption);
			//driver.findElement(By.xpath(inputProductFirstOption)).click();
			driver.findElement(By.linkText(productName)).click();
			driver.findElement(By.xpath(conformManufactureOrder)).click();
			waitTillElementPresent(quantityUnitInputXpath);
			driver.findElement(By.xpath(quantityUnitInputXpath)).clear();
			driver.findElement(By.xpath(quantityUnitInputXpath)).sendKeys("12");
			driver.findElement(By.xpath(markDoneButtonXpath)).click();
		
		}  catch (Exception e) { 
			throw(e);
		}
		
		System.out.println("Manufacture order for product created successfully");
	
	}
	
	@Test()
	public void verificationOfManufactureOrder() {
		try {
			System.out.println("Verification of Manufacturing order starts");
			String ActualProduct = driver.findElement(By.xpath(createdProductXpath)).getText();
			System.out.println(ActualProduct);
			Assert.assertEquals(productName, ActualProduct);
			System.out.println("Verification of Manufacturing order Ends Successfully");
			driver.quit();
		}  catch (Exception e) { 
			throw(e);
		}
	}

}
