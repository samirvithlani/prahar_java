package constructor;

public class Bank {

	
	int a; // instance variable...
	
	public Bank() {
	
		a = 1500;
		System.out.println("default/zero param constructor called..");
	}
	public Bank(int amount)
	{
		a = 2500;
		System.out.println("param const"+amount);
	}
	
	void disp()
	{
		
		System.out.println("disp"+a);
	}
	
	public static void main(String[] args) {
		
		//instance   =  new keyword  Bank(); 
		Bank b1 = new Bank(15); //param...
		Bank b2 = new Bank();
		
		
		b1.disp();
		b2.disp();
		
		
		//b.disp();
	}
	
}
