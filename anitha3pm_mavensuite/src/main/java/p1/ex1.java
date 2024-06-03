package p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ex1 {

	public static void main(String[] args) throws IOException {
		
	
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet s = x.getSheetAt(0);
		
		int r = s.getLastRowNum();
		System.out.println("Total number of rows "+ r);
		
		// number of columns: specific about the row index
		//first row: row0
		
		int col=s.getRow(0).getLastCellNum();
		System.out.println("Number of columns in first row is "+ col);
		
		//read  : 5,0
		XSSFCell data = s.getRow(5).getCell(0);
		System.out.println(data);
		
		//42,4
		s.getRow(42).createCell(4).setCellValue("hello");
		FileOutputStream fos=new FileOutputStream(f);
		x.write(fos);
	}
}
