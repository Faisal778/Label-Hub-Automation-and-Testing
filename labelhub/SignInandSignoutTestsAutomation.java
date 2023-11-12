package labelhub;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class SignInandSignoutTestsAutomation {
	private WebDriver driver;

    public SignInandSignoutTestsAutomation() {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium_webdriver\\Chrome_driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void logIn() throws InterruptedException {
    	 driver.get("http://182.163.99.86/login");

    	 driver.findElement(By.id("username")).sendKeys("TestB@gmail.com");
    	 driver.findElement(By.id("password")).sendKeys("Pass@1234");
    	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
    	 
    	 driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[1]/nav/div/button")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/div")).click();
    	     	
    }
    
    public void logInWithoutemail() throws InterruptedException {
    	  Thread.sleep(2000);
    	driver.findElement(By.id("username")).clear();
    	driver.findElement(By.id("password")).clear();
    	 driver.findElement(By.id("username")).sendKeys("");
    	 driver.findElement(By.id("password")).sendKeys("Pass@1234");
    	  Thread.sleep(2000);
    	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
    	 
    	
    }
    
    public void logInWithoutDomaininEmail() throws InterruptedException {
    	  Thread.sleep(2000);
    	driver.findElement(By.id("username")).clear();
    	driver.findElement(By.id("password")).clear();
    	 driver.findElement(By.id("username")).sendKeys("demo@gmail");
    	 driver.findElement(By.id("password")).sendKeys("Pass@1234");
    	  Thread.sleep(2000);
    	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
    }
    
    public void logInWithoutAtsignInEmail() throws InterruptedException {
     Thread.sleep(2000);
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("password")).clear();
   	 driver.findElement(By.id("username")).sendKeys("demo.com");
   	 driver.findElement(By.id("password")).sendKeys("Pass@1234");
     Thread.sleep(2000);
   	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
   	 
   }
    
    public void logInWithEmailStartsWithAt() throws InterruptedException {
  	 Thread.sleep(2000);
  	 driver.findElement(By.id("username")).clear();
  	 driver.findElement(By.id("password")).clear();
 	 driver.findElement(By.id("username")).sendKeys("@demogmail.com");
 	 driver.findElement(By.id("password")).sendKeys("Pass@1234");
     Thread.sleep(2000);
 	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
	 
    }
    
    public void logInWithEmailwithSpace() throws InterruptedException {
     Thread.sleep(2000);
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("password")).clear();
   	 driver.findElement(By.id("username")).sendKeys("de mo@.gmailcom");
   	 driver.findElement(By.id("password")).sendKeys("Pass@1234");
     Thread.sleep(2000);
   	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
      }
    
    public void logInWithValidPassword() throws InterruptedException {
  	  Thread.sleep(2000);
  	driver.findElement(By.id("username")).clear();
  	driver.findElement(By.id("password")).clear();
 	 driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
 	 driver.findElement(By.id("password")).sendKeys("Pass@1234");
   Thread.sleep(1000);
 	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();

 	 
    }
    
    public void logInWithFiveLengthPassword() throws InterruptedException {
    Thread.sleep(2000);
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("password")).clear();
   	driver.findElement(By.id("username")).sendKeys("fivelengthpassword@gmail.com");
   	driver.findElement(By.id("password")).sendKeys("Pass@");
    Thread.sleep(1000);
   	driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
   
   }
    
    public void logInWithIncorrectSixLengthOnenumberOnespecialSignPassword() throws InterruptedException {
  	  Thread.sleep(2000);
  	driver.findElement(By.id("username")).clear();
  	driver.findElement(By.id("password")).clear();
 	 driver.findElement(By.id("username")).sendKeys("validpassword@gmail.com");
 	 driver.findElement(By.id("password")).sendKeys("Pass@1");
   Thread.sleep(1000);
 	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();

 	 
    }
    
    public void logInWithNonumberInPassword() throws InterruptedException {
    	  Thread.sleep(2000);
    	driver.findElement(By.id("username")).clear();
    	driver.findElement(By.id("password")).clear();
   	 driver.findElement(By.id("username")).sendKeys("nonumberinpassword@gmail.com");
   	 driver.findElement(By.id("password")).sendKeys("Pass@s");
     Thread.sleep(1000);
   	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();

   	 
      }
    
    public void logInWithNoUpperCaseInPassword() throws InterruptedException {
  	  Thread.sleep(2000);
  	driver.findElement(By.id("username")).clear();
  	driver.findElement(By.id("password")).clear();
 	 driver.findElement(By.id("username")).sendKeys("nouppercase@gmail.com");
 	 driver.findElement(By.id("password")).sendKeys("pass@s");
   Thread.sleep(1000);
 	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();

 	 
    }
    
    public void logInWithNoLowerCaseInPassword() throws InterruptedException {
    	  Thread.sleep(2000);
    	driver.findElement(By.id("username")).clear();
    	driver.findElement(By.id("password")).clear();
   	 driver.findElement(By.id("username")).sendKeys("nolowercase@gmail.com");
   	 driver.findElement(By.id("password")).sendKeys("PASS@1");
     Thread.sleep(1000);
   	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();

   	 
      }
    
    public void logInWithAllNumberPassword() throws InterruptedException {
  	  Thread.sleep(2000);
  	driver.findElement(By.id("username")).clear();
  	driver.findElement(By.id("password")).clear();
 	 driver.findElement(By.id("username")).sendKeys("allnumber@gmail.com");
 	 driver.findElement(By.id("password")).sendKeys("145268");
   Thread.sleep(1000);
 	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();

 	 
    }
    public void logInWithAllSpecialCharacterPassword() throws InterruptedException {
    	  Thread.sleep(2000);
    	driver.findElement(By.id("username")).clear();
    	driver.findElement(By.id("password")).clear();
   	 driver.findElement(By.id("username")).sendKeys("allspecialcharacterpassword@gmail.com");
   	 driver.findElement(By.id("password")).sendKeys("$%$#$%^&&");
     Thread.sleep(1000);
   	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();

   	 
      }
  
    public void logInWithProperEmailAndPassword() throws InterruptedException {
 	  Thread.sleep(2000);
  	driver.findElement(By.id("username")).clear();
  	driver.findElement(By.id("password")).clear();
 	 driver.findElement(By.id("username")).sendKeys("admin@gigatech.com");
	 driver.findElement(By.id("password")).sendKeys("Abc@123");
	 driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
	 
	 driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[1]/nav/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div[2]/div/div")).click();
 	 
    }
    
    
	public static void main(String[] args) throws InterruptedException {
		
		SignInandSignoutTestsAutomation test = new SignInandSignoutTestsAutomation();
		test.logIn();
		// for email
//		test.logInWithoutemail();
//		test.logInWithoutAtsignInEmail();
//		test.logInWithoutDomaininEmail();
//		test.logInWithEmailStartsWithAt();
//		test.logInWithEmailwithSpace();
		
		//for password password
		
//		test.logInWithValidPassword();
//		test.logInWithFiveLengthPassword();
		test.logInWithIncorrectSixLengthOnenumberOnespecialSignPassword();
//		test.logInWithNonumberInPassword();
//		test.logInWithNoUpperCaseInPassword();
//		test.logInWithNoLowerCaseInPassword();
//		test.logInWithAllNumberPassword();
//		test.logInWithAllSpecialCharacterPassword();
//		test.logInWithProperEmailAndPassword();
	}

}
