package jenkin;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */


public class App 
{
	
    public static void main(String[] args) throws Exception
    {
        System.out.println( "Hello World!" );
        
        
        String s1="ganesh";
        String s2 ="ganesh";
        
        System.out.println(s1 == s2);
        
        
       // Webdriver driver = new Chromedriver();
        
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/"); 
        
        String fileWithPath="./test1.png";
        
      
        TakesScreenshot scrShot =((TakesScreenshot)driver);
       
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
       
        File DestFile=new File(fileWithPath);
      
        FileUtils.copyFile(SrcFile, DestFile);
        
        
    }
}
