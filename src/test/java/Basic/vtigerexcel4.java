package Basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class vtigerexcel4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		
//		Step1:To Read data from External File
		FileInputStream fis = new FileInputStream("‪C:\\Users\\91909\\Desktop\\dataexcel1.xlsx");
											//path-Location\\filename.extention
	//Step2:To read data from Excel
		Workbook wb = WorkbookFactory.create(fis);	
		
		//Step3:To get control of Sheet
		Sheet sh = wb.createSheet("Deccan");	//CreateSheet(String Sheetname)
		
		//Step4:To create a row
		Row rw = sh.createRow(4);		//CreateRow(int rownum)
		
		//Step5:To Create a Cell
		Cell cl = rw.createCell(4);		//CreateCell(int column)
		
		//Step6:Enter the data
		cl.setCellValue("Selenium");      //SetCellvalue(String value)
		
		//Step7:To write data to External File
		FileOutputStream fos = new FileOutputStream("‪C:\\Users\\91909\\Desktop\\dataexcel1.xlsx");
		
		//Step8:To write data to Excel
		wb.write(fos);
		
	}

}
