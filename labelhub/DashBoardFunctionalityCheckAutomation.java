package labelhub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DashBoardFunctionalityCheckAutomation {
	 private WebDriver driver;

	    public DashBoardFunctionalityCheckAutomation() {

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
	    public void openProjects() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div/div[1]/div[1]/div/button")).click();
	    	Thread.sleep(2000);
	    	openDashboard();
	    	Thread.sleep(2000);
	    }
	    public void openAnnotator() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div/div[1]/div[3]/div/button")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[3]/div[2]/div/table/tbody/tr[16]/td[8]/div/span[2]/a/img")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div/div[1]/div/div[2]/a")).click();
	    	Thread.sleep(2000);
	    	openDashboard();
	    	Thread.sleep(2000);
	    }
	    
	    public void openGuest() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div/div[1]/div[4]/div/button")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[3]/div[2]/div/table/tbody/tr[3]/td[8]/div/span[2]/a/img")).click();
	    	Thread.sleep(2000);
	    	openDashboard();
	    	Thread.sleep(2000);
	    }
	    public void openManager() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div/div[1]/div[5]/div/button")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[3]/div[2]/div/table/tbody/tr[2]/td[8]/div/span[2]/a/img")).click();
	    	Thread.sleep(2000);
	    	openDashboard();
	    	Thread.sleep(2000);
	    }
	    public void openValidator() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div/div[1]/div[6]/div/button")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[3]/div[2]/div/table/tbody/tr[3]/td[8]/div/span[2]/a/img")).click();
	    	Thread.sleep(2000);
	    	openDashboard();
	    	Thread.sleep(2000);
	    }
	    
	    public void closeBrowser() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    public static void main(String[] args) throws InterruptedException {
	    	DashBoardFunctionalityCheckAutomation dashboard = new DashBoardFunctionalityCheckAutomation();
	        
	        //valid everything
	        dashboard.logIn();
	        Thread.sleep(2000);
	        dashboard.openProjects();
	        dashboard.openAnnotator();
	        dashboard.openGuest();
	        dashboard.openManager();
	        dashboard.openValidator();
	        dashboard.closeBrowser();
	        
	        
	    }
	    
}
