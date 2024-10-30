package day40Exceldatadriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\src\\testdata\\myfile.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook();
	
	XSSFSheet sheet =  workbook.createSheet("Data");
	XSSFRow row1 = sheet.createRow(0);
	row1.createCell(0).setCellValue("Selenium");
	row1.createCell(1).setCellValue("1234");
	row1.createCell(2).setCellValue(133);
	row1.createCell(3).setCellValue("sam");
	XSSFRow row2 = sheet.createRow(1);
	row2.createCell(0).setCellValue("java");
	row2.createCell(1).setCellValue("79832");
	row2.createCell(2).setCellValue(1233);
	row2.createCell(3).setCellValue("fight");
	XSSFRow row3 = sheet.createRow(2);
	row3.createCell(0).setCellValue("pendrive");
	row3.createCell(1).setCellValue("2882");
	row3.createCell(2).setCellValue(3552);
	row3.createCell(3).setCellValue("tight");
	
	workbook.write(file);	
	workbook.close();
	file.close();
	System.out.println("printed");
	

	
	}

}
