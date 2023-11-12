package labelhub;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ValidatorSignUp {
    private WebDriver driver;

    public ValidatorSignUp() {
        // Set up Chrome WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\selenium_webdriver\\Chrome_driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void openSignUpPage() {
        driver.get("http://182.163.99.86/login");
    }

    public void clickSignUpLink() {
        WebElement signUpLink = driver.findElement(By.xpath("/html/body/div/div/div[2]/p/a"));
        signUpLink.click();
    }

    public void fillOutSignUpFormWithValidInfo() throws InterruptedException {
        WebElement fullName = driver.findElement(By.name("fullName"));
        WebElement role = driver.findElement(By.name("role"));
        WebElement validator = driver.findElement(By.xpath("/html/body/div/div/section[1]/div/div/div[2]/section[1]/div[2]/div/select/option[3]"));
        WebElement mobile = driver.findElement(By.name("mobile"));
        WebElement qualification = driver.findElement(By.name("qualification"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement email = driver.findElement(By.name("email"));
        WebElement gender = driver.findElement(By.xpath("/html/body/div/div/section[1]/div/div/div[2]/section[2]/div[2]/div/select/option[2]"));
        WebElement birthDay = driver.findElement(By.id("floating-label-input-:r7:"));
        WebElement institutionName = driver.findElement(By.name("institutionName"));
        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        WebElement signUp = driver.findElement(By.xpath("/html/body/div/div/section[1]/div/div/div[3]/button"));

        // Fill out the form
        fullName.sendKeys("testA");
        role.click();
        validator.click();
        mobile.sendKeys("01811111111");
        qualification.sendKeys("xyz");
        password.sendKeys("Pass@1234");
        email.sendKeys("testA@gmail.com");
        gender.click();

        // Replace the date using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);

        institutionName.sendKeys("testEdu");
        confirmPassword.sendKeys("Pass@1234");

        // Submit the form
        signUp.click();
        Thread.sleep(5000);
        openSignUpPage();

    }
    
    public void fillOutSignUpFormWithAllDuplicateValues() throws InterruptedException {
        WebElement fullName = driver.findElement(By.name("fullName"));
        WebElement role = driver.findElement(By.name("role"));
        WebElement validator = driver.findElement(By.xpath("/html/body/div/div/section[1]/div/div/div[2]/section[1]/div[2]/div/select/option[2]"));
        WebElement mobile = driver.findElement(By.name("mobile"));
        WebElement qualification = driver.findElement(By.name("qualification"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement email = driver.findElement(By.name("email"));
        WebElement gender = driver.findElement(By.xpath("/html/body/div/div/section[1]/div/div/div[2]/section[2]/div[2]/div/select/option[2]"));
        WebElement birthDay = driver.findElement(By.id("floating-label-input-:r7:"));
        WebElement institutionName = driver.findElement(By.name("institutionName"));
        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        WebElement signUp = driver.findElement(By.xpath("/html/body/div/div/section[1]/div/div/div[3]/button"));

        // Fill out the form
        fullName.sendKeys("testA");
        role.click();
        validator.click();
        mobile.sendKeys("01811111111");
        qualification.sendKeys("xyz");
        password.sendKeys("Pass@1234");
        email.sendKeys("testA@gmail.com");
        gender.click();

        // Replace the date using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);

        institutionName.sendKeys("testEdu");
        confirmPassword.sendKeys("Pass@1234");

        // Submit the form
        signUp.click();
        Thread.sleep(5000);
        openSignUpPage();

    }
    
    public void fillOutSignUpFormWithHugeStringInFullName() throws InterruptedException {
        WebElement fullName = driver.findElement(By.name("fullName"));
        WebElement role = driver.findElement(By.name("role"));
        WebElement validator = driver.findElement(By.xpath("/html/body/div/div/section[1]/div/div/div[2]/section[1]/div[2]/div/select/option[2]"));
        WebElement mobile = driver.findElement(By.name("mobile"));
        WebElement qualification = driver.findElement(By.name("qualification"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement email = driver.findElement(By.name("email"));
        WebElement gender = driver.findElement(By.xpath("/html/body/div/div/section[1]/div/div/div[2]/section[2]/div[2]/div/select/option[2]"));
        WebElement birthDay = driver.findElement(By.id("floating-label-input-:r7:"));
        WebElement institutionName = driver.findElement(By.name("institutionName"));
        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        WebElement signUp = driver.findElement(By.xpath("/html/body/div/div/section[1]/div/div/div[3]/button"));

        // Fill out the form
        fullName.sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ");
        role.click();
        validator.click();
        mobile.sendKeys("01811111111");
        qualification.sendKeys("xyz");
        password.sendKeys("Pass@1234");
        email.sendKeys("testA@gmail.com");
        gender.click();

        // Replace the date using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = '2002-03-18';", birthDay);

        institutionName.sendKeys("testEdu");
        confirmPassword.sendKeys("Pass@1234");

        // Submit the form
        signUp.click();
        Thread.sleep(2000);
        openSignUpPage();

    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ValidatorSignUp signUp = new ValidatorSignUp();
        
        //valid everything
        signUp.openSignUpPage();
        
        //TEST 1
        signUp.clickSignUpLink();
        signUp.fillOutSignUpFormWithValidInfo();
        ///Expectation -> User will be created successfully.
        
        //TEST 2
        signUp.clickSignUpLink();
        signUp.fillOutSignUpFormWithAllDuplicateValues();
        ///Expectation -> User Already exists.
        
 
        //TEST 3
        signUp.clickSignUpLink();
        signUp.fillOutSignUpFormWithHugeStringInFullName();
        //Expectation -> Ensure the name value is under 50 characters.
        
        //TEST 3
        
        
        
        signUp.closeBrowser();
        
        
    }
}
