package FlightBooking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Upset {
	WebDriver dr;
	@BeforeTest 
	public void start() throws Exception, IOException {
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("browser select \n1.chrome\n2.firefox");
		int switchBrowser=Integer.parseInt(br.readLine());
		switch(switchBrowser) {
		case 1:
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver",config.getvaluefromconfig("chromepath"));
			dr=new ChromeDriver(opt);
			break;
		case 2:
			System.setProperty("webdriver.gecko.driver",config.getvaluefromconfig("Firefoxpath"));
			dr=new FirefoxDriver();
			break;
		default :
				ChromeOptions opt1=new ChromeOptions();
				opt1.addArguments("--disable-notifications");
				System.setProperty("webdriver.chrome.driver",config.getvaluefromconfig("chromepath"));
				dr=new ChromeDriver(opt1);
				break;
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		dr.get(config.getvaluefromconfig("url"));
	}
		@AfterTest
		
		public void closeBrowser() {
			//dr.close();		
			
		}	
		
		}
		
		
		
		
		
		
		
	
	
	
	
	

