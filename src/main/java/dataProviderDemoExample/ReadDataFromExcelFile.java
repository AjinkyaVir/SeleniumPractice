package dataProviderDemoExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadDataFromExcelFile {

	String excelFile = "./dataFile/loginData.xlsx";
	
	String[][] readDataFromExcelFile(String excelFile, String sheetName) throws IOException{
		
		File file = new File(excelFile);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);
		
		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[row-1][col];
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<col;j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
			System.out.println();
		}
		wb.close();
		fis.close();
		return data;
	}
	
	@DataProvider(name = "loginData")
	public Object[][] readLoginData() throws IOException{
		
		Object[][] loginData = readDataFromExcelFile(excelFile,"sheet1");
		System.out.println("Login data function executed!");
		return loginData;
		
	}
	
	
}
