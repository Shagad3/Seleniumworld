package day40Exceldatadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDatadrivenWritingInfo {

	public static void main(String[] args) throws IOException {
		//Excel File>> workbook >> sheets>>Rows>>cells
		
		
		FileInputStream file = new FileInputStream("C:\\Workspace\\seleniumworld\\src\\testdata\\data.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet =workbook.getSheet("Sheet1");
	int  totalrow = sheet.getLastRowNum();
	int totalcell =sheet.getRow(1).getLastCellNum();
	
	System.out.println("Number of row "+totalrow+" Number of cells " +totalcell);
	
	
	for(int i=0;i<=totalrow;i++) {
		XSSFRow currentrow = sheet.getRow(i);//getting all the row from sheet
		for(int y=0;y<totalcell;y++) {
			XSSFCell Currentcell = currentrow.getCell(y); //getting  all the cell from the sheets
		System.out.print(Currentcell.toString()+"\t");
		
		}
		System.out.println();
		workbook.close();
		file.close();
	}
	
	}

}
