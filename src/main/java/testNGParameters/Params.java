package testNGParameters;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Params {

	
		
		@Test
	    @Parameters ({"val1", "val2"})
	    public void Sum(int v1, int v2) {
	    	int finalsum = v1 + v2;
	        System.out.println("The final sum of the given values is " + finalsum);
	    }

	

}
