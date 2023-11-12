package labelhub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProjectTests {
	 private WebDriver driver;

	    public CreateProjectTests() {

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
	    }
	    
	    public void createPojectWithProperNameAndTag() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[1]/button")).click();;
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("name")).sendKeys("NER SSS");
	    	driver.findElement(By.name("description")).sendKeys("Annotation type:NER Tag:SSS");
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[1]/div/div[1]/div/button")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[1]/button/div")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	    	Thread.sleep(2000);
	    }	   
	    public void createPojectWithNoName() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[1]/button")).click();;
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("name")).sendKeys(" ");
	    	driver.findElement(By.name("description")).sendKeys("Annotation type:NER Tag:SSS");
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[1]/div/div[1]/div/button")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[1]/button/div")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	   
	    }	
	    public void createPojectWithOnecharacterNameAndOneTag() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[1]/button")).click();;
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("name")).sendKeys("a");
	    	driver.findElement(By.name("description")).sendKeys("Annotation type:NER Tag:SSS");
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[1]/div/div[1]/div/button")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[1]/button/div")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	   
	    }
	    public void createPojectWithTwocharacterNameAndOneTag() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[1]/button")).click();;
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("name")).sendKeys("ab");
	    	driver.findElement(By.name("description")).sendKeys("Annotation type:NER Tag:SSS");
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[1]/div/div[1]/div/button")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[1]/button/div")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	    	Thread.sleep(2000);
	   
	    }
	    public void createPojectWithThreecharacterNameAndEightTag() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[1]/button")).click();;
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("name")).sendKeys("abc");
	    	driver.findElement(By.name("description")).sendKeys("Annotation type:NER Tag:SSS");
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[1]/div/div[1]/div/button")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[12]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[13]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[14]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[15]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[16]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[17]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[18]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[1]/button/div")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	    	Thread.sleep(2000);
	   
	    }
	    
	    public void createPojectWithThirtyNinecharacterNameAndTwoTags() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[1]/button")).click();;
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("name")).sendKeys("abcdefghijABCDEFGHIJklmnopqrstuvwxyz");
	    	driver.findElement(By.name("description")).sendKeys("Annotation type:NER Tag:SSS");
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[1]/div/div[1]/div/button")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[31]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[1]/button/div")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	    	Thread.sleep(2000);
	   
	    }
	    public void createPojectWithFortycharacterNameAndThreeTags() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[1]/button")).click();;
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("name")).sendKeys("abcdefghijABCDEFGHIJklmnopqrstuvwxyza");
	    	driver.findElement(By.name("description")).sendKeys("Annotation type:NER Tag:SSS");
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[1]/div/div[1]/div/button")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[2]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[37]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[1]/button/div")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	    	Thread.sleep(2000);
	   
	    }
	    public void createPojectWithFortyOnecharacterNameAndOneTag() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[1]/button")).click();;
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("name")).sendKeys("abcdefghijABCDEFGHIJklmnopqrstuvwxyzab");
	    	driver.findElement(By.name("description")).sendKeys("Annotation type:NER Tag:SSS");
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[1]/div/div[1]/div/button")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[1]/button/div")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/img")).click();
	    	
	   
	    }
	    public void createProjectWithValidNameAndNoTag() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[1]/button")).click();;
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("name")).sendKeys("valid name");
	    	driver.findElement(By.name("description")).sendKeys("no tag");
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	    	Thread.sleep(2000);
	    	
	    }
	    public void creatProjcetWithValidNameAllTag() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[1]/button")).click();;
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("name")).sendKeys("All tags");
	    	driver.findElement(By.name("description")).sendKeys("valid name with all the tags");
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[1]/div/div[1]/div/button")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[1]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[2]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[3]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[4]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[5]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[6]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[7]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[8]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[9]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[10]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[11]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[12]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[13]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[14]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[15]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[16]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[17]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[18]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[19]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[20]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[21]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[22]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[23]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[24]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[25]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[26]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[27]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[28]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[29]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[30]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[31]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[32]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[33]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[34]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[35]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[36]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[37]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[38]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[39]/button/div")).click();

	    	
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	    	Thread.sleep(2000);
	    }
	    
	    public void creatProjcetWithValidNameThirtyEithtTag() throws InterruptedException {
	    	driver.findElement(By.xpath("/html/body/div/section/main/div[2]/div[2]/section/div[1]/button")).click();;
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("name")).sendKeys("All tags");
	    	driver.findElement(By.name("description")).sendKeys("valid name with all the tags");
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[1]/div/div[1]/div/button")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[1]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[2]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[3]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[4]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[5]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[6]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[7]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[8]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[9]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[10]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[11]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[12]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[13]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[14]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[15]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[16]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[17]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[18]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[19]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[20]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[21]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[22]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[23]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[24]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[25]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[26]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[27]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[28]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[29]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[30]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[31]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[32]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[33]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[34]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[35]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[36]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[37]/button/div")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section[1]/div[2]/div/div/div/div[38]/button/div")).click();
	    

	    	
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	    	Thread.sleep(2000);
	    }
	    
	    public void closeBrowser() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    public static void main(String[] args) throws InterruptedException {
	    	CreateProjectTests project = new CreateProjectTests();
	        
	        //valid everything
	        project.logIn();
	        Thread.sleep(2000);
	        project.openProjects();
	        project.createPojectWithProperNameAndTag();
	        project.createPojectWithNoName();
	        project.createPojectWithOnecharacterNameAndOneTag();
	        project.createPojectWithTwocharacterNameAndOneTag();
	        project.createPojectWithThreecharacterNameAndEightTag();
	        project.createPojectWithThirtyNinecharacterNameAndTwoTags();
	        project.createPojectWithFortycharacterNameAndThreeTags();
	        project.createPojectWithFortyOnecharacterNameAndOneTag();
	        project.createProjectWithValidNameAndNoTag();
	        project.creatProjcetWithValidNameAllTag();
	        project.creatProjcetWithValidNameThirtyEithtTag();
	        
	        project.closeBrowser();
	        
	    }
	    
	    
}
