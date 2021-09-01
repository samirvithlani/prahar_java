package constructor;

class User{
	
	
	int amount =100;
	
	public User(int x) {
		System.out.println("default const of user class");
	}
	
	void disp(int amount) {
		
		System.out.println("amoun = "+this.amount);
	}
}
class Employee extends User{
	
	
	public Employee() {
	
		super(1500);
		System.out.println("employee  default const called....");
	}
	public Employee(int p) {
		
		super(2500);
		System.out.println("employee  default const called....");
	}
}



public class TestCont {

	
	public static void main(String[] args) {
		
		//default of employee..
		Employee employee = new Employee(12);
		employee.disp(8500);
	}
}
