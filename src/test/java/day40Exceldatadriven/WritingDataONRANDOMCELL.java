package day40Exceldatadriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataONRANDOMCELL {



		public static void main(String[] args) throws IOException {
		
			FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\src\\testdata\\myfileRandom.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet =  workbook.createSheet("Data");

		XSSFRow row = sheet.createRow(4);
		XSSFCell cel=row.createCell(5);
		cel.setCellValue("bollo");
				
				
		workbook.write(file);	
		workbook.close();
		file.close();
		System.out.println("printed");
		

		
		}

	}


