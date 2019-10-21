package tesctcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class sample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SaloniShrivastava\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);

		

		eventDriver.get("https://www.londontheatredirect.com/booking2/mamma-mia-tickets-at-the-novello-theatre-on-saturday-1-february-2020?performanceId=524911");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		
		WebElement element = eventDriver.findElement(By.xpath("//canvas[@class='ltd-seatplan__canvas']"));
		
		int x= element.getLocation().getX();
		int y=element.getLocation().getY();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		Actions act = new Actions(driver);
		Robot robot = new Robot();
		act.moveToElement(element).click().build().perform();
		robot.mouseMove(800, 800);
		robot.mouseMove(800, 800);
		robot.mouseMove(800, 800);
		robot.mouseMove(800, 800);
		robot.mouseMove(800, 800);
		robot.mouseMove(800, 800);
		robot.delay(1500); 
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	    
//	    act.moveToElement(driver.findElement(By.xpath("//*[@id='mainForm']/div[4]/div[2]/div/div/div/div[1]/a/span/img"))).click().build().perform();
	    
	   // act.moveToElement(driver.findElement(By.xpath("//*[@id='mainForm']/div[4]/div[2]/div/div/div/div[1]/a/span/img"))).moveByOffset(1, 1).click().build().perform();
	    
/*		// Handling Multiple Actions
		Actions act = new Actions(driver);
		// WebElement elem =
		// driver.findElement(By.xpath("//div[@class='ltd-seatplan__container ltd-seatplan']"));
		/*
		 * elemLeft = elem.offsetLeft, elemTop = elem.offsetTop, context =
		 * elem.getContext('2d'), elements = [];
		 */

		// Add event listener for `click` events.
		/*
		 * elem.addEventListener("click", function(event) { var x = event.pageX
		 * - elemLeft, y = event.pageY - elemTop;
		 * 
		 * // Collision detection between clicked offset and element.
		 * elements.forEach(function(element) { if (y > element.top && y <
		 * element.top + element.height && x > element.left && x < element.left
		 * + element.width) { alert('clicked an element'); } });
		 * 
		 * }, false);
		act.moveToElement(
				driver.findElement(By
						.id("ctl00_MainContent_BookingBoxControl_BookButtonHL")))
				.click().build().perform();*/
		Thread.sleep(10000);

		// Closing current driver window
		driver.close();

	}
}
