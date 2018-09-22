package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;


public TestBase() {
		try{

		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/config.properties");
		
		prop.load(ip);

		}
		catch(FileNotFoundException e){
		e.printStackTrace();
		}
		catch(IOException e){
		e.printStackTrace();
		}
}



public static void initialiation(){
	 String browsername = prop.getProperty("browser");
	if(browsername.equals("chrome")){
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"src/Driverfiles/chromedriver.exe");
	driver= new ChromeDriver();

	}
	else if(browsername.equals("FF")){
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"src/Driverfiles/geckodriver.exe");
	driver= new FirefoxDriver();
	}

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	driver.get(prop.getProperty("url"));



}
	}