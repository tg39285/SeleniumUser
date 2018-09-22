package Testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  Integer totalCount=9;
  Integer passCount=0;

  @BeforeTest
  public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:/Users/govindkx/eclipse-workspace/SeleniumWebDriverLC/src/Driverfiles/geckodriver.exe");
	  	driver = new FirefoxDriver();
	    baseUrl = "http://apps.qa2qe.cognizant.e-box.co.in/Policy/";
	    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

  }

  @Test
  public void testWeb() throws Exception {
	
     try{
	  driver.get(baseUrl + "/index.html");
    try {
      Assert.assertEquals("Policy Details", driver.findElement(By.cssSelector("h2")).getText());
      passCount++;
    } catch (Error e) {
      verificationErrors.append("Text 'Policy Details' with tag h2 not found\n");
    }catch (Exception e) {
        verificationErrors.append("Text 'Policy Details' with tag h2 not found\n");
      }
    
    try {
      Assert.assertTrue(isElementPresent(By.id("claimNumber")));
      passCount++;
    } catch (Error e) {
      verificationErrors.append("Element with id 'claimNumber' not found\n");
    }catch (Exception e) {
        verificationErrors.append("Element with id 'claimNumber' not found\n");
     }
    
    try {
      Assert.assertTrue(isElementPresent(By.id("add")));
      passCount++;
    }  catch (Error e) {
        verificationErrors.append("Element with id 'add' not found\n");
      }catch (Exception e) {
          verificationErrors.append("Element with id 'add' not found\n");
       }
    
    try {
      Assert.assertTrue(isElementPresent(By.id("display")));
      passCount++;
    } catch (Error e) {
        verificationErrors.append("Element with id 'display' not found\n");
      }catch (Exception e) {
          verificationErrors.append("Element with id 'display' not found\n");
      }
    try {
        Assert.assertTrue(isElementPresent(By.id("result")));
        passCount++;
      } catch (Error e) {
        verificationErrors.append("Element with id 'result' not found\n");
      }catch (Exception e) {
          verificationErrors.append("Element with id 'result' not found\n");
       }
    
    try{
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("5432198765");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("9876543210");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("8976098754");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("9876789436");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("7654321890");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("display")).click();
    passCount++;
    }catch (Error e) {
	  	verificationErrors.append("Cannot provide input please stick into UI constraints..\n");
	  }catch (Exception e) {
	  	verificationErrors.append("Cannot provide input please stick into UI constraints..\n");
	  }

    try {
      Assert.assertEquals("The Policy numbers are 5432,9876,8976,9876,7654", driver.findElement(By.id("result")).getText());
      passCount++;
      System.out.println("2");
    } catch (Error e) {
      verificationErrors.append("Unable to get the policy numbers from the div id 'result'\n");
    }catch (Exception e) {
        verificationErrors.append("Unable to get the policy numbers from the div id 'result'\n");
      }
    
    
    try{
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("9442469193");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("9952316998");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("8870857830");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("9976306519");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("9976306561");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("9500755117");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("8870025885");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("8675144786");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("9366101170");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("9442110573");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("claimNumber")).clear();
    driver.findElement(By.id("claimNumber")).sendKeys("965919876");
    driver.findElement(By.id("add")).click();
    driver.findElement(By.id("display")).click();
    passCount++;
    }catch (Error e) {
	  	verificationErrors.append("Cannot provide input please stick into UI constraints..\n");
	  }catch (Exception e) {
	  	verificationErrors.append("Cannot provide input please stick into UI constraints..\n");
	  }
    System.out.println(driver.findElement(By.id("result")).getText()+"\n");
    System.out.println("The Policy numbers are 9442,9952,8870,9976,9976,9500,8870,8675,9366,9442,9659");
    try {
      Assert.assertEquals("The Policy numbers are 9442,9952,8870,9976,9976,9500,8870,8675,9366,9442,9659", driver.findElement(By.id("result")).getText());
      passCount++;
     
      
    } catch (Error e) {
        verificationErrors.append("Unable to get the policy numbers from the div id 'result'\n");
     }catch (Exception e) {
          verificationErrors.append("Unable to get the policy numbers from the div id 'result'\n");
      }
    
     }catch (IllegalStateException e) {
	      verificationErrors.append("Testcase Failed - Flow interrupted - (Result Page May not be available or not html page) \n");
	  } catch (Exception e) {
	      verificationErrors.append("Testcase Failed \n"+e.getMessage());
	  }

  }

  @AfterTest
  public void tearDown() throws Exception {
	  System.out.println("#"+Math.round((passCount/(float)totalCount)*100));
	  driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      Assert.fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  @SuppressWarnings("unused")
private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  @SuppressWarnings("unused")
private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

