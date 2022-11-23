package dataProviderExample;

import org.testng.annotations.Test;

public class UseDataProvider {

	@Test(dataProvider = "Data_pass", dataProviderClass = DataProviderClass.class)
	public void getValues(String values) {
		
		System.out.println("Values from dataProvider : " + values);
		
	}
	
}
