package TestAssignment;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteInternetPlans {
	
{
		 
		 public static void main (String [] args) throws IOException
		 
		 {
		 // object of Workbook and pass the FileInputStream object into it to create a pipeline between the sheet and eclipse.
		 
			 FileInputStream fis = new FileInputStream("C:\Users\train\Desktop\ATTplans\InternetPlans.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 
		 XSSFSheet sheet = workbook.getSheet("InternetPlans");
		 
		                //The createCell() method is present inside Row class.
		                Row row = sheet.createRow(1);
		 Cell cell = row.createCell(1);
		 //Now we need to find out the type of the value we want to enter. 
		                //If it is a string, we need to set the cell type as string 
		                //if it is numeric, we need to set the cell type as number
		 cell.setCellType(cell.CELL_TYPE_STRING);
		 cell.setCellValue("SoftwareTestingMaterial.com");
		 FileOutputStream fos = new FileOutputStream("C:\Users\train\Desktop\ATTplans\InternetPlans.xlsx");
		 workbook.write(fos);
		 fos.close();
		 
}	
}


