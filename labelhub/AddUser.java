package labelhub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddUser {
	 private WebDriver driver;

	    public AddUser() {

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
	    
	    
	    public void createUser() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("No Name");
		    gender.click();
		    institution.sendKeys("xyz");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("random@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abc");
	        mobile.sendKeys("01700000000");
	        add.click();

	        Thread.sleep(2000);
	        openDashboard();
	          
	    }
	    
	    public void createUserWithAllCredentials() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("No Name");
		    gender.click();
		    institution.sendKeys("xyz");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("random@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abc");
	        mobile.sendKeys("01700000000");
	        add.click();

	        Thread.sleep(2000);
	        openDashboard();
	    }

	    public void createUserWithHundredCharFullName() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
		    gender.click();
		    institution.sendKeys("xyz");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("random@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abc");
	        mobile.sendKeys("01700000000");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	          
	    }
	    public void createUserWithOneCharFullName() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("a");
		    gender.click();
		    institution.sendKeys("xyz");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("random01@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abc");
	        mobile.sendKeys("01700000000");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithSpecialCharFullName() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("a@bcde#g");
		    gender.click();
		    institution.sendKeys("xyz");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("random01@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abc");
	        mobile.sendKeys("01700000000");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithThirtyCharFullName() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Faisal Mahmud");
		    gender.click();
		    institution.sendKeys("NSU");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("faisalmahmud778@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithSpaceInFullName() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Demo Person");
		    gender.click();
		    institution.sendKeys("NSU");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("demo00145@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithMaleGender () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Demo Person05");
		    gender.click();
		    institution.sendKeys("NSU");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("demo001454@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    
	    public void createUserWithFremaleGender  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[3]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Mary M. Metzger");
		    gender.click();
		    institution.sendKeys("NSU");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("metzger@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    
	    public void createUserWithOtherGender() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[4]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Other Gender");
		    gender.click();
		    institution.sendKeys("NSU");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("othergender@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    public void createUserWithExistingFullName() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[3]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Mary M. Metzger");
		    gender.click();
		    institution.sendKeys("NSU");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("metzgerm@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithValidInstitutionName  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Bobby A Hayden");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("bobby@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    
	    public void createUserWithEmptyInstitutionName  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Kirk J Patterson");
		    gender.click();
		   // institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Kirk@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithValidPassword  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Jack M Garcia");
		    gender.click();
		   // institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Jack@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithFiveCharPassword  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Daniel J Bolding");
		    gender.click();
		   // institution.sendKeys("North South University");
		    password.sendKeys("Passw1");
		    manager.click();
		    email.sendKeys("Daniel@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	      
	          
	    }
	    public void createUserWithFiveCharOneNumPassword  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Daniel J Bolding");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Passw1");
		    manager.click();
		    email.sendKeys("Daniel@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithSixCharOneNumPassword  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Daniel J Bolding");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("passwo1");
		    manager.click();
		    email.sendKeys("Daniel@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	          
	    }
	    
	    public void createUserWithSixCharOneNumOneUpperCasePassword  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Daniel J Bolding");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Passwo1");
		    manager.click();
		    email.sendKeys("Daniel@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithSixLowerCaseCharOneNumOneUpperCaseOneSpecialCharPassword  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Daniel J Bolding");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("passwo1@");
		    manager.click();
		    email.sendKeys("Daniel@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithSixUpperCaseCharOneNumOneUpperCaseOneSpecialCharPassword  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Daniel J Bolding");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("PASSWO1@");
		    manager.click();
		    email.sendKeys("Daniel@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	      
	          
	    }
	    public void createUserWithOneUpperCaseFiveLowerCharOneNumOneUpperCaseOneSpecialCharPassword  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Daniel J Bolding");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Passwo1@");
		    manager.click();
		    email.sendKeys("Daniel@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithOneUpperCasefiftyLowerCharOneNumOneUpperCaseOneSpecialCharPassword  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Mildred R Reyes");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Pabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab1@");
		    manager.click();
		    email.sendKeys("Mildred@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithTwelveCharOnenumOneSpecialCasePassword  () throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Mildred R Reyes");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    manager.click();
		    email.sendKeys("Mildred@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserwithManagerRole() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Paul C Hoehn");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    manager.click();
		    email.sendKeys("Paul@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserwithAnnotatorRole() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement annotator = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[3]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Kyle E Trudeau");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    annotator.click();
		    email.sendKeys("Kyle@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserwithValidatorRole() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement validator = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[4]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Andre K Honda");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    validator.click();
		    email.sendKeys("Andre@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserwithGuestRole() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("James L Coniglio");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("JamesL@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserwithvalidEmail() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Thomas G Hatfield");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("Thomas@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserwithDotInEmail() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Richard J Heroux");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("Richard.j@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserwithHyphenInEmail() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Thomas B Harrison");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("Thomas-BHarrision.j@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserwithPlusSignInEmail() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Thomas Lion");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("Thomas+lion@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserwithUnderscoreInEmail() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Charles A Fell");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("Charles_fell@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserwithCombinationOfValidCharInEmail() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("David H Wagoner");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("David_H+W.agoner@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(2000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserwithEmptyEmail() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("David H Wagoner");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("  ");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserwithoutAtEmail() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Thomas R Johnson");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("ThomasRJohnson");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	          
	    }
	    
	    public void createUserEmailStartWithAt() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Thomas R Johnson");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	          
	      
	          
	    }
	    
	    public void createUserEmailContainsSpace() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Thomas R Johnson");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("Thomas R Johnson@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	          
	      
	          
	    }
	    
	    public void createUserEmailWithoutAT() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Thomas R Johnson");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("ThomasRJohnsongmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	          
	          
	    }
	    
	    public void createUserEmailWithMinimunLength() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("abc");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("a@b.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(7000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserEmailWithFiftyCharLength() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement guest = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[5]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("abc");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Abcdefghijkl1@");
		    guest.click();
		    email.sendKeys("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();
	        
	        Thread.sleep(7000);
	        openDashboard();
	      
	          
	    }
	    
	    public void createUserWithBirthDateOutsizeLowerRange() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("George R Lenz");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("George@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '1845-01-01';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();

	        Thread.sleep(2000);
	        openDashboard();
	    }
	    
	    public void createUserWithBirthDateInsideRange() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Jesus J Hopson");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Jesus@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();

	        Thread.sleep(2000);
	        openDashboard();
	    }
	    
	    
	    public void createUserWithBirthDateOutsideHigherRange() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Jesus J Hopson");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Jesus@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2055-01-01';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();

	        Thread.sleep(2000);
	        openDashboard();
	    }
	    
	    public void createUserWithValidQualification() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("James E Johnson");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Johnson@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("BSc");
	        mobile.sendKeys("01849909358");
	        add.click();

	        Thread.sleep(2000);
	        openDashboard();
	    }
	    public void createUserWithEmptyQualification() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("James E Johnson");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Johnsone@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("");
	        mobile.sendKeys("01849909358");
	        add.click();

	        Thread.sleep(2000);
	        openDashboard();
	    }
	    public void createUserWithLargeStringyQualification() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("James A Rivera");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Rivera@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab");
	        mobile.sendKeys("01849909358");
	        add.click();

	        Thread.sleep(2000);
	        openDashboard();
	    }
	    
	    public void createUserWithValidPhoneNumber() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Andrew B Zook");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Andrewb@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab");
	        mobile.sendKeys("01849909358");
	        add.click();

	        Thread.sleep(2000);
	        openDashboard();
	    }
	    public void createUserWithAllzeroPhoneNumber() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Andrew B Zook");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Andrew@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab");
	        mobile.sendKeys("00000000000");
	        

	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();

	        openDashboard();
	          
	    }

	    public void createUserWithMaximumLengthPhoneNumber() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Harold T Hamlin");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Harold@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab");
	        mobile.sendKeys("01999999999");
	        add.click();

	

	        Thread.sleep(2000);
	        openDashboard();
	          
	    }

	    public void createUserWithOutZeroOnePhoneNumber() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Jason M Dennis");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Jason@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab");
	        mobile.sendKeys("99999999999");
	       
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        //add.click();
	        
	        
	        openDashboard();
	          
	    }

	    public void createUserWithMinimumLengthPhoneNumber() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Jason M Dennis");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Jason@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab");
	        mobile.sendKeys("01111111111");
	        add.click();

	        Thread.sleep(2000);
	        openDashboard();
	          
	    }
	    
	    public void createUserWithSpaceInPhoneNumber() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Dennis P Hudson");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Dennis@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab");
	        mobile.sendKeys("01 111111111");
	        
	        
	       // driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        add.click();
	        Thread.sleep(2000);
	        
	        
	        openDashboard();
	          
	    }
	    
	    public void createUserWithStringInPhoneNumber() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/aside/div/div/div/div[3]/a/div")).click();
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[2]/button")).click();
	    	
	    	WebElement fullName = driver.findElement(By.name("full_name"));
	    	WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[2]"));
	    	WebElement institution = driver.findElement(By.name("institution_name"));
	    	WebElement password = driver.findElement(By.name("password"));
	    	WebElement manager = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[5]/select/option[2]"));
	    	WebElement email = driver.findElement(By.name("email"));
	    	
	    	 WebElement birthDay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/input"));
	    	 WebElement qualification = driver.findElement(By.name("qualification"));
	    	 WebElement mobile = driver.findElement(By.name("mobile"));
	    	 WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
	    	 
	    	
		    fullName.sendKeys("Dennis P Hudson");
		    gender.click();
		    institution.sendKeys("North South University");
		    password.sendKeys("Password@123");
		    manager.click();
		    email.sendKeys("Dennis@gmail.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);
	        
	        qualification.sendKeys("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab");
	        mobile.sendKeys("01111111asd");
	        
	        
	       // driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	        add.click();
	        Thread.sleep(2000);
	        
	        
	        openDashboard();
	          
	        
	    }
	    
	    public void closeBrowser() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    public static void main(String[] args) throws InterruptedException {
	    	AddUser users = new AddUser();
	        
	   //valid everything
	    	users.logIn();
	    	users.createUser();
	        users.createUserWithAllCredentials();
	    	
//	    //Full Name
	        users.createUserWithOneCharFullName();
	        users.createUserWithHundredCharFullName();
	        users.createUserWithSpecialCharFullName();
	        users.createUserWithThirtyCharFullName();
	        users.createUserWithSpaceInFullName();
	    	users.createUserWithExistingFullName();
	    	
//	    ///Gender
	        users.createUserWithMaleGender();
	        users.createUserWithFremaleGender();
	        users.createUserWithOtherGender();
	    	
	    	
//	      /// Institution Name 
	    	users.createUserWithValidInstitutionName();
	    	users.createUserWithEmptyInstitutionName();
	    	
//	    	//Password
//	    	
	    	users.createUserWithValidPassword();
	    	users.createUserWithFiveCharPassword();
	    	users.createUserWithFiveCharOneNumPassword();
	    	users.createUserWithSixCharOneNumPassword();
	    	users.createUserWithSixCharOneNumOneUpperCasePassword();
	    	users.createUserWithSixLowerCaseCharOneNumOneUpperCaseOneSpecialCharPassword();
	    	users.createUserWithSixUpperCaseCharOneNumOneUpperCaseOneSpecialCharPassword();
	    	users.createUserWithOneUpperCaseFiveLowerCharOneNumOneUpperCaseOneSpecialCharPassword();
	    	users.createUserWithOneUpperCasefiftyLowerCharOneNumOneUpperCaseOneSpecialCharPassword();
	    	users.createUserWithTwelveCharOnenumOneSpecialCasePassword();        
	    	
////	    	//Role
	    	users.createUserwithManagerRole();
	    	users.createUserwithAnnotatorRole();
	    	users.createUserwithValidatorRole();
	    	users.createUserwithGuestRole();
	    	
//	    	//Email
	    	users.createUserwithvalidEmail();
	    	users.createUserwithDotInEmail();
	    	users.createUserwithPlusSignInEmail();
	    	users.createUserwithUnderscoreInEmail();
	    	users.createUserwithHyphenInEmail();
	    	users.createUserwithCombinationOfValidCharInEmail();
	    	
//	    	//invalid email
//	    	
	    	users.createUserwithEmptyEmail();
	    	users.createUserwithoutAtEmail();
	    	users.createUserEmailStartWithAt();
	    	users.createUserEmailContainsSpace();
	    	users.createUserEmailWithoutAT();
	    	
//	    	
//	    	//boundary value email
	    	users.createUserEmailWithMinimunLength();
	    	users.createUserEmailWithFiftyCharLength();
	    	
//	    	
//	    	//BirthDay test
	    	users.createUserWithBirthDateOutsizeLowerRange();
	    	users.createUserWithBirthDateInsideRange();
	    	users.createUserWithBirthDateOutsideHigherRange();
	    	
//	    	//Qualification 
	    	users.createUserWithValidQualification();
	    	users.createUserWithEmptyQualification();
	    	users.createUserWithLargeStringyQualification();
	    	
//	    	
//	    	//phone Number test
	    	users.createUserWithValidPhoneNumber();
	    	users.createUserWithAllzeroPhoneNumber();
	    	users.createUserWithMaximumLengthPhoneNumber();
	    	users.createUserWithOutZeroOnePhoneNumber();
	    	users.createUserWithMinimumLengthPhoneNumber();
	    	users.createUserWithSpaceInPhoneNumber();
	    	users.createUserWithStringInPhoneNumber();
	    	
	    	users.closeBrowser();
	                
	    }
}
