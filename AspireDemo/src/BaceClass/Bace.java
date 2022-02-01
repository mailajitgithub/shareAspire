package BaceClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.text.*;
import java.util.*;

public class Bace {
	
	public WebDriver driver;
	public String productName = "AJIT";
	public String loginUserName = "user@aspireapp.com";
	public String loginPassword = "@sp1r3app";
	public String loginEmailXpath = "//*[@id=\"login\"]";
	public String loginPasswordXpath = "//*[@id=\"password\"]";
	public String loginButtonXpath = "//*[@id=\"wrapwrap\"]/main/div/div/div/form/div[3]/button";
	public String inventoryXpath = "//*[@id=\"result_app_1\"]";
	public String productsMainTabXpath = "/html/body/header/nav/div[1]/div[2]/button";
	public String productSubTabXpath = "/html/body/header/nav/div[1]/div[2]/div/a[1]";
	public String createProductButtonXpath = "/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button";
	public String productNameXpath = "//*[@id=\"o_field_input_11\"]";
	public String updateQuantityLinkXpath = "/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div/button[2]/span";
	public String updateCreateXpath ="/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button[4]";
	public String inventoryQuantityInputXpath = "/html/body/div[1]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/input";
	public String saveProductButtonXpath = "/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button[1]";
	public String createUpdatedProductButtonXpath = "/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button[4]";
	
	public String giveQuantityXpath = "/html/body/div[1]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/input";
	public String createQuantityXpath = "/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button[1]";
	
	public String homeXpath = "//a[@title='Home menu']";
	public String manufactorIconXpath = "//a[@id='result_app_2']//div[@class='o_app_icon']";
	public String createManufactureOrder = "//button[normalize-space()='Create']";
	public String manufactorProductInputXpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/div[1]/div[1]/input[1]";
	
	public String firstOptionXpath = "/html[1]/body[1]/ul[1]/li[1]/a[1]";
	public String addlineXpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]";
	public String inputproductXpath = "//td[@name='product_id']//input[@type='text']";
	public String inputProductFirstOption = "/html[1]/body[1]/ul[9]/li[2]/a[1]";
	public String conformManufactureOrder = "//span[normalize-space()='Confirm']";
	public String quantityUnitInputXpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[9]/td[2]/div[1]/div[1]/input[1]";
	public String markDoneButtonXpath = "//button[@class='btn btn-primary']//span[contains(text(),'Mark as Done')]";
	public String createdProductXpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/a[1]/span[1]";
	
	public void initialiseBrowser() {
		String currentPath = System.getProperty("user.dir");
		currentPath = currentPath+"\\drivers\\geckodriver.exe";
		System.out.println(currentPath);
		System.out.println("Execution started-- Opening Firefox browser.");
		System.setProperty("webdriver.gecko.driver",currentPath);
		driver = new FirefoxDriver();
	}
	
	public void waitTillElementPresent(String elementXpath) {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
	}
	
	public void createProductName() {
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyyHH:mm:ss");
		Date date = new Date();
		productName += formatDate.format(date);
		System.out.println(productName);
	}
	
}
