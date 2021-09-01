package com.abstractions;

import java.io.Serializable;

public interface ParentInterface {

	void fees();
}

interface ChildInterface extends ParentInterface {

	void tax();
}

class School implements ChildInterface {

	@Override
	public void fees() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tax() {
		// TODO Auto-generated method stub

	}

}

class student extends School implements Serializable {

	@Override
	public void fees() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tax() {
		// TODO Auto-generated method stub

	}

}
