package FlightBooking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sheet {

	static XSSFWorkbook wb;
	public static void settingExcel() throws Exception{
	File file=new File(config.getvaluefromconfig("excelpath"));
	FileInputStream fis=new FileInputStream(file);
	wb=new XSSFWorkbook(fis);
	}
public static  String sfrom() throws Exception{
	settingExcel();
	String var=wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
	return var;
}
public static  String sTo() throws Exception{
	settingExcel();
	String var=wb.getSheetAt(0).getRow(0).getCell(1).getStringCellValue();
	return var;
		
	
}



	
}
