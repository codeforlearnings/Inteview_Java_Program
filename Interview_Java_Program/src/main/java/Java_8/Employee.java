package Java_8;
public class Employee {
	private String firstname;
	private Integer salary;
	public Employee(String firstname, Integer salary) {
		super();
		this.firstname = firstname;
		this.salary = salary;
	}
	public String getFirstname() {
		return firstname;
	}

	public Integer getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", salary=" + salary + "]";
	}
}
