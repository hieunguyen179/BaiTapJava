
public class Test {
	public static void main(String[] args) {
		PartTimeEmployee obj = new PartTimeEmployee("john",18,'m', "sweep","12-4", 14);
		System.out.println(obj.toString());
		obj.setAge(20);
		obj.setHoursPerWeek(20);
		System.out.println(obj.toString());
	}
	
}
