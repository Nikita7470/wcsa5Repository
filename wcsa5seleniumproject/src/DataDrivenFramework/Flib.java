package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	
		// to store generic reusable methods
		//all the methods are non static
		//it is use to read the data from excel sheet
		public String readExcelData(String excelpath,String sheetName,int rowCount,int cellcount) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream(excelpath);//provide the path of file
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet(sheetName);//get into the sheet
	Row row=sheet.getRow(rowCount);//get into desired row
Cell cell=row.getCell(cellcount);//get into the desired cell/column
String data=cell.getStringCellValue();//read the value from cell
 return data;
 

		}
		
		//it is use to get last count of row where we store data
		
		public int getLastRowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream(excelpath);//provide the path of file
			Workbook wb=WorkbookFactory.create(fis);//make the file for ready to read
		Sheet sheet=wb.getSheet(sheetName);//get into sheet
		int rc=sheet.getLastRowNum();
		return rc;
		}
		
		//it is use to write the data into excel sheet
		public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
     FileInputStream fis=new FileInputStream(excelPath);//provide the path of file
			Workbook wb=WorkbookFactory.create(fis);//make the file for ready to read
		Sheet sheet=wb.getSheet(sheetName);//get into sheet
		 Row row=sheet.getRow(rowCount);//pass the row count
		   
		Cell cell=row.createCell(cellCount);//pass the cell count
		cell.setCellValue(data);//pass the string arguments as data
		
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
		
				
			
		
		
	}

}
