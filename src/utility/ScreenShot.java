package utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void screenShot(WebDriver driver,String name) throws IOException {
		Browser.OpenBrowser("https://kite.zerodha.com");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\91966\\Desktop\\SelUtility\\Screenshot\\"+name+".jpg");
		FileHandler.copy(source, dest);
	}

}
