package imp;

class Parent {
	int i = 0;

	void amethod() {
		System.out.println(" *** in Parent");
	}
}

class Child extends Parent {
	int i = 10;

	void amethod() {
		System.out.println("*** in Child");
	}
}

class Test {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.print("i=" + p.i + " ");
		p.amethod();
		System.out.print("i=" + c.i + " ");
		c.amethod();
	}
}
