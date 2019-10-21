package tesctcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Date;
import java.util.HashMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tesctcases.CheckoutPage;

public class BookTickets extends BaseSetup{

    private HashMap<String,String> params;
    private String baseUrl = null;
    CheckoutPage check ;

    @Before
	public void setUp() throws Exception {
    	
    	super.setUp();

    	params = new HashMap<String,String>();
        baseUrl = "https://www.londontheatredirect.com/musical/1017/mamma-mia-tickets.aspx";
        params.put("name","Saloni Shrivastava");
        params.put("email", "xyz@xyz.xom");
        params.put("telephone", "45735383538");
        params.put("cardNumber", "243738463839746");
        params.put("cvv", "567");
        params.put("expiry", "12/12");
        check = new CheckoutPage();
    
    }

    
 	@Test
	public void test() throws InterruptedException, AWTException {

		        driver.get(baseUrl);

		        if(isElementPresent(By.id("ctl00_MainContent_BookingBoxControl_BookButtonHL")))
		        	driver.findElement(By.id("ctl00_MainContent_BookingBoxControl_BookButtonHL")).click();
		 
		        driver.findElement(By.xpath("//span[contains(text(),'February')]//following-sibling::span[contains(text(),'2020')]")).click();
		        driver.findElement(By.xpath("//a[@data-performance='Saturday 01 February 2020 - 19:45']")).click();
		        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading-overlay__wrap")));
		        selectSeat("");
		        
		        driver.findElement(By.xpath("//span[contains(.,'Add to basket')]")).click();
		        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading-overlay__wrap")));
		        Actions action= new Actions(driver);
		        action.moveToElement(driver.findElement(By.cssSelector("[data-method='methodCard'] span.label"))).click().build().perform();
//		        CheckoutPage check = new CheckoutPage();
		        check.setPageParameterValues(params);
//		        driver.findElement(By.cssSelector("[name='name']")).sendKeys("Saloni");
//		        driver.findElement(By.cssSelector("[name='email']")).sendKeys("Saloni@saloni.j");
//		        driver.findElement(By.cssSelector("[name='tel']")).sendKeys("3441411341341");
//		        driver.findElement(By.cssSelector("[name='card']")).sendKeys("134343242342342323");
//		        driver.findElement(By.cssSelector("[name='expiry']")).sendKeys("12/12");
//		        driver.findElement(By.cssSelector("[name='cvv']")).sendKeys("234");
//		        driver.findElement(By.cssSelector(".my--3 button.ltd-button")).click();
//		        String color=driver.findElement(By.cssSelector("[name='cvv']")).getCssValue("border-color");
////		        returnColor(color);
//		        System.out.println(driver.findElement(By.cssSelector("[name='cvv']")).getCssValue("border-color"));
//		        if(driver.findElement(By.cssSelector("[name='cvv']")).getCssValue("border-color").equalsIgnoreCase("rgb(217, 217, 217)"))
//		        	System.out.println("hurrah");

		       
	}
 	
  	
   public void selectSeat(String color) throws InterruptedException, AWTException{
	   
	   
	   Robot robot = new Robot();
	   robot.mouseMove(800, 800);
	   robot.mouseMove(800, 800);
	   robot.mouseMove(800, 800);
	   robot.mouseMove(800, 800);
	   robot.mouseMove(800, 800);
	   robot.mouseMove(800, 800);
	   robot.delay(1500); 
	   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
       robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Add to basket')]")));
    	
//    	if(color.equalsIgnoreCase("Bluee")){
///   		act.moveToElement(driver.findElement(By.xpath("//div[@class='ltd-seatplan__container ltd-seatplan']"))).moveByOffset(690, 249).click().build().perform();
//    	}
    	
    }
   
   public boolean isElementPresent(By locatorKey) {
	    try {
	        driver.findElement(locatorKey);
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	    	System.out.println(locatorKey+ " Not found");
	        return false;
	    }
	}
   
   @After

	public void tearDown() throws Exception {
	   driver.close();
		
	}

}
