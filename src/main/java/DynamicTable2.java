import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicTable2 {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Test
	public void dynamicTableTest() throws InterruptedException {
		//login credentials:
		driver.findElement(By.name("email")).sendKeys("riyazu.shaik@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(5000);
		
		//contacts link:
		driver.findElement(By.cssSelector("#main-nav>a:nth-of-type(3)")).click();
		/*List<WebElement>rows=driver.findElements(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr"));
		int rowcount=rows.size();
		System.out.println("total no. of rows:"+rowcount);*/
		//xpaths for contacts pattern:
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
		
		/*String beforexpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String afterxpath="]/td[2]";
		for(int i=1;i<=3;i++) {
			String actualxpath=beforexpath+i+afterxpath;
			String text=driver.findElement(By.xpath(actualxpath)).getText();
			System.out.println(text);
			if(text.contains("akram shaik")) {
				//checkboxes xpath:
				//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/div/label
				//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]/div/label
				
				//driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[1]/div/label")).click();
				
				
			}
			
			
		}*/
		//Method-2:
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'akram shaik')]/parent::tr//preceding-sibling::td//input[@name='id']")).click();
	}
	
}
