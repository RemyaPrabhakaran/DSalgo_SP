//package utilities;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//public class ExcelReader {
//
//	public static int totalRow;
//
//	public List<Map<String, String>> getData(String excelFilePath, String sheetName) throws InvalidFormatException, IOException 
//	{
//
//		Workbook workbook = WorkbookFactory.create(new File(excelFilePath));
//		Sheet sheet = workbook.getSheet(sheetName);
//		workbook.close();
//		return readSheet(sheet);
//	}
//
//	private List<Map<String, String>> readSheet(Sheet sheet) 
//	{
//
//		Row row;
//		Cell cell;
//		//totalRow = 10; //sheet.getPhysicalNumberOfRows(); // sheet.getLastRowNum();
//totalRow=sheet.getLastRowNum();
//		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();
//
//		for (int currentRow = 1; currentRow <= totalRow; currentRow++) 
//		{
//			row = sheet.getRow(currentRow);
//			int totalColumn = row.getLastCellNum();
//			//System.out.println("total column count :" + totalColumn );
//			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();
//			for (int currentColumn = 0; currentColumn < 2; currentColumn++) 
//			{
//				cell = row.getCell(currentColumn);
//				//System.out.println("The cell value is :" + cell);
//				String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn).getStringCellValue();
//				columnMapdata.put(columnHeaderName, cell.getStringCellValue());
//			}
//			excelRows.add(columnMapdata);
//		}
//		return excelRows;
//	}
//	public int countRow() {
//		return totalRow;
//	}
//
//}


package utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public static int totalRow;

	public List<Map<String, String>> getData(String excelFilePath, String sheetName)
			throws InvalidFormatException, IOException {

		Workbook workbook = WorkbookFactory.create(new File(excelFilePath));
		Sheet sheet = workbook.getSheet(sheetName);
		workbook.close();
		return readSheet(sheet,sheetName);
	}

	private List<Map<String, String>> readSheet(Sheet sheet, String sheetName) {

		Row row;
		Cell cell;
		   int rowNo;
		if (sheetName.equals("sheet1"))
		{
			 totalRow =4;
			 rowNo=3;
			 System.out.println("sheet1");
		}
		else 
			{totalRow =10;
	         rowNo=2;
	         
	         System.out.println("sheetname is :"+sheetName);
			}
        
		//totalRow = sheet.getLastRowNum();
 
		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

		for (int currentRow = 1; currentRow <= totalRow; currentRow++) {
        
			row = sheet.getRow(currentRow);

			int totalColumn = row.getLastCellNum();
         
            
			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

			for (int currentColumn = 0; currentColumn <rowNo; currentColumn++) {

				cell = row.getCell(currentColumn);

				String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
						.getStringCellValue();

				columnMapdata.put(columnHeaderName, cell.getStringCellValue());
			}

			excelRows.add(columnMapdata);
		}

		return excelRows;
	}

	public int countRow() {

		return totalRow;
	}

}
