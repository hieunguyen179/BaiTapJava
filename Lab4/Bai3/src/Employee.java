
public class Employee extends Person{
	private String employeeName;
	private String dateHired;
	public Employee(String name, int age, char gender, String employeeName, String dateHired) {
		super(name, age, gender);
		this.employeeName = employeeName;
		this.dateHired = dateHired;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	@Override
	public String toString() {
		return super.toString() + "Employee [employeeName=" + employeeName + ", dateHired=" + dateHired + "]";
	}
	
}
