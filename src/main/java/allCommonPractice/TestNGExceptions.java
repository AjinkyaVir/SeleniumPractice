package allCommonPractice;

import org.testng.annotations.Test;

public class TestNGExceptions {

	@Test(expectedExceptions= {ArithmeticException.class})
	public void testException() {
		
		int division = 10 / 0;
		System.out.println(division);
		
	}
	
}
