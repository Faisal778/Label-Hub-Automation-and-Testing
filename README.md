# Label-Hub-Automation-and-Testing
Automated testing of Label hub (under development application of Giga Tech Limited) functionality using **Selenium** in **Java** environment. 
Tests contain,
1. Login Log out tests
2. User creation tests with different roles
3. Project creation tests
4. Log in as Annotator tests and tests for annotator functionality
5. Log in as validator tests and test for validator functionality
6. Dashboard functionality tests
7. Data page functionality test

To set up **selenium** and run these tests, follow the steps given below.

**Setup Steps:**

1. Download and Install Eclipse from https://www.eclipse.org/downloads/
   
2. To install Selenium, 
  a. Go to the website of selenium from: https://www.selenium.dev/downloads/
  b. Scroll down and look for previous releases 
  c. Select version **3.141.59**
  d. Download Selenium-java-3.141.59.zip and extract it.

3. To install the Chrome driver, first check the current Chrome browser version from 
	Chrome settings > About Chrome

4. After that, go to https://chromedriver.chromium.org/downloads website and download the driver 
   version that matches the chrome browser version.

5. After these steps, open Eclipse and create a Java project. 
6. Click Right click on the project file and select the properties
7. Now, select the libraries tab. On the right side of the tab, there is an option to Add     
   External JARs
8. Select External JARs and import all the jar files that previously got extracted in step (2.d)
9. Select Appy and close. Now, selenium will run in eclipse.

If the JAR files are included yet showing errors, 

10. Right-click on the project and Select Properties 
11. Go to Java Compiler. Under JDK compliance, select compiler
    compliance level **‘Java SE-1.8’**
12. Select Apply and Close. This should fix the previous error.
