package dataProviderExample;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name = "Data_pass")
	public Object[][] dataProvide(){
		
		return new Object[][] {{"Ajinkya"},{"Sayali"}};
	}

}
