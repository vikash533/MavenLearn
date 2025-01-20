package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckJenkins {
	
	WebDriver driver;
	@BeforeClass
	public void openBroweser() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
		driver.quit();
		}
	}
	@Test
	public void testScript1() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Test
	public void testScript2() {
		driver.findElement(By.xpath("//button[@type='button']//i[@class='oxd-icon bi-stopwatch']")).click();
	
	}

}
