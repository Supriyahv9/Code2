package Basic;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigerexcel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
	/*	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		
		
//		Step1:To Read data from External File
		FileInputStream fis = new FileInputStream("src\\test\\resources\\dataexcel1.xlsx");
	
	//Step2:To read data from Excel
		Workbook wb = WorkbookFactory.create(fis);
		
	//Step3:To get control of Sheet
		Sheet sh = wb.getSheet("Sheet1");   //getSheet(String name)
		
	//Step4:To get control of row
		Row rw = sh.getRow(3);				//getRow(int rownum)
	
	//Step5:To get control of cell
		Cell cl = rw.getCell(0);			//getCell(int column)
		
	//Step6:To get data present in cell
		String data = cl.getStringCellValue();
		System.out.println(data);
	
	
	
	
	
	
	
	
	
	}

}
