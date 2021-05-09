/**
 * 
 */
/**
 * @author charan
 *
 */
package FlightBooking;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class config {
	
static File file =new File("C:\\Users\\charan\\eclipse-workspace\\Cleartrip\\src\\FlightBooking\\conf.properties");
static Properties prop=new Properties();
public static void setproperty() throws Exception{
	FileInputStream fis=new FileInputStream(file);
	prop.load(fis);
}
public static String getvaluefromconfig(String key) throws Exception{
	setproperty();
	String value=prop.getProperty(key);
	return value;
	
}
}
	