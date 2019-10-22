package tesctcases;

import java.util.Date;
import java.util.HashMap;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import tesctcases.BaseSetup;

public class CheckoutPage extends BaseSetup {
	
	public int x=1;
	public WebElement nameLocator;
	public WebElement emailLocator;
	public WebElement telephoneLocator;
	public WebElement cardLocator;
	public WebElement expiryLocator;
	public WebElement cvvLocator;
	public WebElement checkoutButton;
	
	
	
	public void setPageParameterValues(HashMap<String,String> params, WebDriver driver ){
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		nameLocator = driver.findElement(By.cssSelector("[name='name']"));
		emailLocator = driver.findElement(By.cssSelector("[name='email']"));
		telephoneLocator = driver.findElement(By.cssSelector("[name='tel']"));
		cardLocator = driver.findElement(By.cssSelector("[name='card']"));
		expiryLocator = driver.findElement(By.cssSelector("[name='expiry']"));
		cvvLocator = driver.findElement(By.cssSelector("[name='cvv']"));
		checkoutButton = driver.findElement(By.cssSelector(".my--3 button.ltd-button"));
		
		nameLocator.sendKeys(params.get("name"));
		emailLocator.sendKeys(params.get("email"));
		telephoneLocator.sendKeys(params.get("telephone"));
		cardLocator.sendKeys(params.get("cardNumber"));
		cvvLocator.sendKeys(params.get("cvv"));
		expiryLocator.sendKeys(params.get("expiry"));
		checkoutButton.click();
		wait.until(ExpectedConditions.visibilityOf(cvvLocator));
		assertErrors();
		
	}
	public void assertErrors(){
		
		if(expiryLocator.getCssValue("border-color").equalsIgnoreCase("rgb(213, 0, 0)")&&
				cardLocator.getCssValue("border-color").equalsIgnoreCase("rgb(213, 0, 0)"))
		System.out.println("Test Passed");
		
	}
	
	
	

}
