import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class TestDrivenDevExample {
	
	
	public  static int addNumbers (int a, int b) {
		int result = a + b;
		return  result;
	}
	
	//JUnit basic Test Example
	//write a basic unit test
		@SuppressWarnings("deprecation")
		@Test
		public void additionTest() {
			//first create a Class, Object for the Class & addNumber Method
			Assert.assertEquals(4,  TestDrivenDevExample.addNumbers(2, 2));		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
