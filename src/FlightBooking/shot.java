package FlightBooking;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class shot{
public static void screenshot(WebDriver driver,String name) throws Exception{
TakesScreenshot pic=(TakesScreenshot)driver;
File src=pic.getScreenshotAs(OutputType.FILE);
File des=new File("C:\\Users\\charan\\eclipse-workspace\\Cleartrip\\ss1\\"+name+".png");
FileUtils.copyFile(src, des);
System.out.println("your Screen shot Has been saved");
}
}