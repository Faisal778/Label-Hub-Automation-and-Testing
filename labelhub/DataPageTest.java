package labelhub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPageTest {
	private WebDriver driver;

    public DataPageTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium_webdriver\\Chrome_driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void logIn() {
    	 driver.get("http://182.163.99.86/login");

    	 driver.findElement(By.id("username")).sendKeys("admin@gigatech.com");
    	 driver.findElement(By.id("password")).sendKeys("Abc@123");
    	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
    	     	
    }
    public void openDashboard() {
        driver.get("http://182.163.99.86/dashboard");
    }
  
    public void openData() {
    	driver.get("http://182.163.99.86/data");
    	
    }
    public void goToSecondPage() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/section/ul/li[3]/a")).click();
    	Thread.sleep(2000);
    }
    
    public void exportData() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/section/div[2]/div/table/tbody/tr[4]/td[5]/div/button/img")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/section/div[3]/div/div/div/button")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();

    }
    
    public void view() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/section/div[2]/div/table/tbody/tr[5]/td[5]/div/a")).click();
    	Thread.sleep(2000);
    }
    public void logout() {
    	 WebElement adminButton = driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[1]/nav/div/button/svg"));
    	 adminButton.click();
    	 
    	 WebElement logOut = driver.findElement(By.xpath("/html/body/div[2]/div/div"));
    	 logOut.click();
    }
    
    public void closeBrowser() {
            driver.quit();
        
    }
    public static void main(String[] args) throws InterruptedException {
    	DataPageTest data = new DataPageTest();
        
        //valid everything
        data.logIn();
        Thread.sleep(2000);
        data.openData();
        data.goToSecondPage();
        data.view();
        data.openData();
        data.goToSecondPage();
        data.exportData();
        
        
    }
}
