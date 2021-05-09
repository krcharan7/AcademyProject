package FlightBooking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writrExcel {



	static XSSFWorkbook wb;
	public static  void sendingExcel(String txt) throws Exception{
	File file=new File(config.getvaluefromconfig("excelpath"));
	FileInputStream fis=new FileInputStream(file);
	wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	sheet.getRow(2).createCell(0).setCellValue(txt);

	try {
		
		
		
		FileOutputStream fos =new FileOutputStream(file);
		wb.write(fos);
	}catch(Exception e) {
			e.printStackTrace();	
	}
	

}
	
}
