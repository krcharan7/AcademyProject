package FlightBooking;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class MainCleartrip extends Upset {
	
	@Test
	public void Testtorun()  throws Exception{
		clearTripPom trip=new clearTripPom(dr) ;
		trip.getRoundTrip();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		trip.getfrom();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		trip.getTo();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		trip.getStartdate();
		Thread.sleep(3000);
//		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		trip.getEndDate();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		trip.getAdults();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		trip.GetText();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		trip.clickSearch();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		shot.screenshot(dr,"number");
		}
	
}
