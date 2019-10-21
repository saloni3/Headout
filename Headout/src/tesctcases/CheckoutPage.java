package tesctcases;

import java.util.Date;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tesctcases.BaseSetup;

public class CheckoutPage extends BaseSetup {
	
	public int x=1;
	public WebElement nameLocator = driver.findElement(By.cssSelector("[name='name']"));
	public WebElement emailLocator = driver.findElement(By.cssSelector("[name='email']"));
	public WebElement telephoneLocator = driver.findElement(By.cssSelector("[name='tel']"));
	public WebElement cardLocator = driver.findElement(By.cssSelector("[name='card']"));
	public WebElement expiryLocator = driver.findElement(By.cssSelector("[name='expiry']"));
	public WebElement cvvLocator = driver.findElement(By.cssSelector("[name='cvv']"));
	public WebElement checkoutButton = driver.findElement(By.cssSelector(".my--3 button.ltd-button"));
	
	
	public void setPageParameterValues(HashMap<String,String> params ){
		
		nameLocator.sendKeys(params.get("name"));
		emailLocator.sendKeys(params.get("email"));
		telephoneLocator.sendKeys(params.get("telephone"));
		cardLocator.sendKeys(params.get("cardNumber"));
		cvvLocator.sendKeys(params.get("cvv"));
		expiryLocator.sendKeys(params.get("expiry"));
		assertErrors();
		
	}
	public void assertErrors(){
		
		if(expiryLocator.getCssValue("border-color").equalsIgnoreCase("rgb(217, 217, 217)")&&
				cvvLocator.getCssValue("border-color").equalsIgnoreCase("rgb(217, 217, 217)")&&
				cardLocator.getCssValue("border-color").equalsIgnoreCase("rgb(217, 217, 217)"))
		System.out.println("Test Passed");
		
	}
	
	
	

}
