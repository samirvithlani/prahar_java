package com.abstractionbackup;

interface Oth{

	void login();
	
}


//it will not throw error of overrding
abstract class Reg implements Oth{
	
	abstract void newLogin();
	
	public void login() {
		
		
	}
	
}

class Series extends Reg{

	@Override
	void newLogin() {
		// TODO Auto-generated method stub
		
	}
	
	
}


public class SeriesTest {

	
}
