package AMIT.Final_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Website {

	WebDriver driver ;
	
	@BeforeTest
	public void openURL() {
		driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
	}
	
	@Test
	public void booking() throws InterruptedException {

		Thread.sleep(8000);
		
		WebElement route = driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a"));
		route.click();
		
		WebElement date = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]/a"));
		date.click();
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button"));
		search.click();
		
		Thread.sleep(5000);
		
		WebElement seat = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[1]/div[1]/div[3]/div/input[4]"));
		seat.click();
		
		Thread.sleep(5000);
		
		WebElement seat_no = driver.findElement(By.xpath("//*[@id=\"Forward30\"]/span"));
		seat_no.click();
		
		WebElement boarding = driver.findElement(By.xpath("//*[@id=\"Forward-1467550949362\"]"));
		boarding.click();
		
		WebElement dropping = driver.findElement(By.xpath("//*[@id=\"Forward-1467467616730\"]"));
		dropping.click();
		
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"mobileNo\"]"));
		mobile.click();
		mobile.sendKeys("6789125987");
		
		WebElement name = driver.findElement(By.xpath("//*[@id=\"passengerNameForward0\"]"));
		name.click();
		name.sendKeys("Mohamed");
		
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"genderCodeIdForward0\"]"));
		Select choose = new Select(gender);
		choose.selectByValue("24");
		
		WebElement age = driver.findElement(By.xpath("//*[@id=\"passengerAgeForward0\"]"));
		age.click();
		age.sendKeys("24");
		
		WebElement concession = driver.findElement(By.xpath("//*[@id=\"concessionIdsForward0\"]"));
		Select choice = new Select(concession);
		choice.selectByValue("1466060086837");
		
		WebElement email = driver.findElement(By.id("email"));
		email.click();
		email.sendKeys("pmaxxx@mycartzpro.com");
		
		WebElement payment = driver.findElement(By.xpath("//*[@id=\"PgBtn\"]"));
		payment.click();
		
		Thread.sleep(8000);

	}
	
	@AfterTest
	public void finale() {
		driver.close();
	}
	
}
