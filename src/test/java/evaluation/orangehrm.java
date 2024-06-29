package evaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrm {
	WebDriver driver;
	
	@BeforeTest
	public void visit () throws InterruptedException {
		WebDriverManager.chromedriver().setup();// setup our chrome driver
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //visit OrangeHRM website
		
		driver.manage().window().maximize();//maximize our browser
		Thread.sleep(4000);//hold execution for 4 seconds 
		
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");//passing username
		driver.findElement(By.name("password")).sendKeys("admin123");//passing password
		driver.findElement(By.xpath("//button[@type='submit']")).click();// click on login button
		Thread.sleep(4000);//hold execution for 4 seconds
	}
	@Test(dependsOnMethods = "login")
	public void adminpage() throws InterruptedException {
		
		driver.findElement(By.linkText("Admin")).click();//Navigate to Admin page
		Thread.sleep(4000);//hold execution for 4 seconds
		driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[1]")).click();//Click on User management dropdown
		driver.findElement(By.xpath("//a[text()='Users']")).click();//Select Users from the drop down
		Thread.sleep(2000);//hold execution for 2 seconds
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("r"); // passing 'r' in to employee name input
		Thread.sleep(2000);//hold execution for 2 seconds
		
		driver.findElement(By.xpath("(//span[text()='Ranga  Akunuri'])")).click();//select 'Ranga  Akunuri' from drop down
		
		String status = driver.findElement(By.xpath("(//div[@class='oxd-table-cell oxd-padding-cell'])[5]/div")).getText();//Get the text of status of the employee
		System.out.println(status);//print the status
		Assert.assertEquals(status, "Enabled");//check the the status is enable or not
		
		
	}
	
	@Test(dependsOnMethods = "adminpage")
	public void logout() {
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon'])")).click();//Click on the Profile menu
		
		driver.findElement(By.linkText("Logout")).click();//Click on the Logout button
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
	
	

}
