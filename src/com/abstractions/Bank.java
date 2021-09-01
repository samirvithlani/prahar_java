package com.abstractions;
abstract class Gov1{
	
	public abstract void tax();
}

abstract class RBI {

	//0 - 100
	public abstract void Withdraw();

	public void policy() {

	}

	public abstract void deposit();

}

class ICICI extends RBI {

	public void Withdraw() {

		System.out.println("icici with called...");
	}

	public void deposit() {

	}
}

class SBI extends RBI {

	public void deposit() {

	}

	public void Withdraw() {

		System.out.println("sbi with called...");
	}
}

///A  -->ICICI AC  ---> withdraw 1000 rs  --> SBI bank atm machine--> yes --> sbi machine  --> SBIWITHDRAW();-->ICICI withdraw();

public class Bank {

}
