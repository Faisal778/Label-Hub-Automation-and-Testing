package labelhub;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class LogOutAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:\\selenium_webdriver\\Chrome_driver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

 driver.get("http://182.163.99.86/login");

 driver.findElement(By.id("username")).sendKeys("admin@gigatech.com");
 driver.findElement(By.id("password")).sendKeys("Abc@123");
 
 WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/form/button")); 
 signInButton.click();
 


 WebElement adminButton = driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[1]/nav/div/button"));
 adminButton.click();
 
 WebElement logOut = driver.findElement(By.xpath("/html/body/div[2]/div/div"));
 logOut.click();
	}
}
