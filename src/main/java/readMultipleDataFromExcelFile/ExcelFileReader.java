package readMultipleDataFromExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelFileReader {
	
	@DataProvider(name = "getData")
	public String[][] getData() throws IOException{
		
		File file = new File("./dataFile/registrationData.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfCells = sheet.getLastRowNum();
		
		String[][] data = new String[noOfRows - 1][noOfCells];
		
		for(int i=0 ; i<noOfRows - 1; i++) {
			for(int j=0; j<noOfCells ; j++) {
				
				DataFormatter df = new DataFormatter();
				
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
			System.out.println();
		}
		
		wb.close();
		fis.close();
		return data;
		
		
		
		
	}
	

}
