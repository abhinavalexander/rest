package JunitDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeesTest {

	@Test
	public void simpleEqulastest() {
		String expectedName="Raj";
		assertEquals(expectedName,Employees.getEmpNameWithHighestSalary());
	}
	@Test
	public void ObjectEqulastest() {
		Employees expectedEmpObj=new Employees(1,"Raj",15000);
		assertEquals(expectedEmpObj,Employees.getHighestPaidEmployee());
	}
}
