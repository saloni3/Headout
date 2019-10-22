package tesctcases;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSetup {

	 	public WebDriver driver;
	    public static WebDriverWait wait;
		
    	
    	@Before
    	public void setUp() throws Exception {
    		
    		System.setProperty("webdriver.chrome.driver","C:\\Users\\SaloniShrivastava\\Downloads\\chromedriver_win32\\chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.manage().window().maximize() ;
    		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        	wait = new WebDriverWait(driver,20000);
    	
    	}
}

