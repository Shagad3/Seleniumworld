package day40Exceldatadriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\src\\testdata\\myfileDynamicData.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook();
	
	XSSFSheet sheet =  workbook.createSheet("Data");
	Scanner sc = new Scanner(System.in);
	System.out.println("How many rows ?");
	int row = sc.nextInt();
	System.out.println("How many cell ?");
	int cell = sc.nextInt();
	
	for(int i=0; i<row; i++) {
		XSSFRow rowcount = sheet.createRow(i);
		for(int r=0;r<cell;r++) {
			XSSFCell cells = rowcount.createCell(r);
			cells.setCellValue(sc.next());
		}}
			workbook.write(file);	
			workbook.close();
			file.close();
			System.out.println("printed");
		}
}
