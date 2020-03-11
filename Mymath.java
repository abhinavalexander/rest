package JunitDemo;
import static org.junit.Assert.*;

import org.junit.Test;

public class Mymath {
public class MymathTest{
	Mymath myMath=new Mymath();

	@Test
	public void sum_with3numbers(){
		System.out.println("Test1");
		assertEquals(6,Mymath.sum(new int[]{1,2,3}));
		
	}
	@Test
	public void sum_with1number(){
		System.out.println("Test2");
		assertEquals(3, Mymath.sum(new int[]{3}));
	}
}
}
