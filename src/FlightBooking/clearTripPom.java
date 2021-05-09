package FlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clearTripPom {
	WebDriver dr;
	public clearTripPom (WebDriver driver) {
		this.dr=driver;
	}

	
	By RoundTrip=By.xpath("//input[@id='RoundTrip']");
	By from =By.xpath("//input[@id='FromTag']");
	By to =By.xpath("//input[@id='ToTag']");
	By startDate =By.xpath("//a[contains(text(),'28')]");
	By EndDate =By.xpath("//a[contains(text(),'30')]");
	By Adults =By.xpath("//select[@id='Adults']");
	By search =By.id("SearchBtn");
	By text=By.xpath("//label[contains(text(),'Children ')]");
	
	
	
	public void getRoundTrip() {
		WebDriverWait wait=new WebDriverWait(dr,45);
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(RoundTrip));
	dr.findElement(RoundTrip).click();
	
	}
	
	public void getfrom() throws Exception{
		WebDriverWait wait=new WebDriverWait(dr,45);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(from));
		dr.findElement(from).click();
		dr.findElement(from).clear();
		dr.findElement(from).sendKeys(sheet.sfrom());
		Thread.sleep(5000);
		dr.findElement(from).sendKeys(Keys.ENTER);
		
	}
	
	public void getTo() throws Exception{
		WebDriverWait wait=new WebDriverWait(dr,45);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(to));
		dr.findElement(to).click();
		dr.findElement(to).clear();
		dr.findElement(to).sendKeys(sheet.sTo());
		Thread.sleep(8000);
		dr.findElement(to).sendKeys(Keys.ENTER);
	
	}
	
	public void getStartdate() throws Exception {
		WebDriverWait wait=new WebDriverWait(dr,45);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(startDate));
		Actions action=new Actions(dr);
		action.moveToElement(dr.findElement(startDate)).perform();
		action.click().perform();
			}
	
	public void getEndDate() throws Exception{
		WebDriverWait wait=new WebDriverWait(dr,45);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(EndDate));
		//dr.findElement(EndDate).click();
		Actions act=new Actions(dr);
		act.moveToElement(dr.findElement(EndDate)).perform();
		act.click().perform();
	}
	
	public void getAdults() throws Exception{
		WebDriverWait wait=new WebDriverWait(dr,45);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Adults));
//		dr.findElement(Adults).click();
		Select AdultNo=new Select(dr.findElement(Adults));
		AdultNo.selectByIndex(2);
			}
	
	public void clickSearch() throws Exception{
		WebDriverWait wait=new WebDriverWait(dr,45);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(search));
		dr.findElement(search).click();	
	}
	public void GetText() throws Exception{
		WebDriverWait wait=new WebDriverWait(dr,45);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(search));
		//String txt=dr.findElement(text).getText();
		String txt="AGE";
		writrExcel.sendingExcel(txt);
		
	}
	
	
	
	

}
