package labelhub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnnotatorTestsAutomation {
	 private WebDriver driver;

	    public AnnotatorTestsAutomation() {

	        System.setProperty("webdriver.chrome.driver", "C:\\selenium_webdriver\\Chrome_driver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    }
	    public void logIn() {
	    	 driver.get("http://182.163.99.86/login");

	    	 driver.findElement(By.id("username")).sendKeys("Testa@gmail.com");
	    	 driver.findElement(By.id("password")).sendKeys("Pass@1234");
	    	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
	    	     	
	    }
	    public void project() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[2]/a/div")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div/div[2]/div/table/tbody/tr/td[9]/div/a")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/section[4]/div/div/div[2]/div/table/tbody/tr[1]/td[9]/div/a")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[2]/a[2]/span")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[2]/a[2]/a[2]")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[2]/a[2]/a[3]")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[1]/a/div/span[2]")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[1]/nav/div/button")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div")).click();
	    	
	    }
	    
	  
	   
	    public static void main(String[] args) throws InterruptedException {
	    	AnnotatorTestsAutomation data = new AnnotatorTestsAutomation();
	        
	        //valid everything
	        data.logIn();
	        Thread.sleep(2000);
	        data.project();      
	        
	    }
}
