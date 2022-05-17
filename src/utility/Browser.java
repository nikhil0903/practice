package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver OpenBrowser(String url){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91966\\eclipse-workspace\\15Jan\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

}
