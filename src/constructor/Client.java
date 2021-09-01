package constructor;

class Parent {

	int rs;

	public Parent() {

		this.rs = rs;
	}

	public Parent(int rs) {

		this.rs = rs + rs;

	}
}

class Child extends Parent {

	int x;

	public Child() {

		super(150);
		x = 500;

	}

	public Child(int x, int y) {

		super(x + y);

	}

	void display() {

		System.out.println("rs = " + rs);
	}
}

public class Client {

	public static void main(String[] args) {

		Child c = new Child();
		c.display();

	}
}
