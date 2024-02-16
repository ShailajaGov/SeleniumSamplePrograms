package seleniumtrainingpackage;

import java.io.File;  
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
  
import org.apache.poi.ss.usermodel.Row;

public class ReadDataFromExcel {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
				
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\Shailaja\\TestingFiles\\TestData.xlsx"));
			
			//creating workbook instance that refers to .xls file  
			
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			
			//creating object of excelsheet
			XSSFSheet sheet = wb.getSheetAt(0);
			System.out.println("No errors");
			//Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {

			  Row row = rowIterator.next();

			  //For each row, iterate through all the columns
			  Iterator<Cell> cellIterator = row.cellIterator();
			   
			  while (cellIterator.hasNext()) {

			    Cell cell = cellIterator.next();

			    //Check the cell type and format accordingly
			    switch (cell.getCellType()) {
			      case Cell.CELL_TYPE_NUMERIC:
			        System.out.print((int) cell.getNumericCellValue() + "\t");
			        break;
			      case Cell.CELL_TYPE_STRING:
			        System.out.print(cell.getStringCellValue() + "\t");
			        break;
			    }
			  }
			  System.out.println("");
			}
			fis.close();
			
			//System.out.println("No errors");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
