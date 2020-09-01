package factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
 
@RunWith(JUnitPlatform.class)
class FactTest {
	
	@Test
	public void FactorialPositiveTest() {
		Fact factObj = new Fact();
		assertEquals(479001600,factObj.calculateFactorial(12),"Factorial of 12 : 479001600");
	}
	@Test
	public void FactorialOfOneTest() {
		Fact factObj = new Fact();
		assertEquals(1,factObj.calculateFactorial(1));
	}
	@Test
	public void FactorialOf0Test() {
		Fact factObj = new Fact();
		assertEquals(1,factObj.calculateFactorial(0));
	}
	
	@Test
	public void FactorialOfNegativeNumberTest() {
		
		//IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->factObj.calculateFactorial(-3));
		Throwable ex = assertThrows(IllegalArgumentException.class,()->{Fact factObj = new Fact();
		factObj.calculateFactorial(-3);});
		assertEquals("n cannot be < 0 !",ex.getMessage());
	}
	@Test
	public void FactorialofEdgeCaseTest() {
		Fact factObj = new Fact();
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->factObj.calculateFactorial(13));
		assertEquals("n cannot be greater than 12",ex.getMessage());
	}

}
