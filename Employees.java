package JunitDemo;

public class Employees {
	private int empId;
	private String name;
	private int salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employees(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Employees emp = (Employees) obj;
		boolean status = false;
		if (this.name.equalsIgnoreCase(emp.name) && this.empId == emp.empId
				&& this.salary == emp.salary) {
			status = true;
		}
		return status;
	}

	public static String getEmpNameWithHighestSalary() {
		return "Raj";
	}

	public static Employees getHighestPaidEmployee() {
		return new Employees(1, "raj", 15000);
	}

}
