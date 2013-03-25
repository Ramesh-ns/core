package imp;



class Prot {
	protected int x = 10;
	int y = 12;
}

class Prot1 extends Prot {
	Prot1() {
		System.out.println(x + " " + y);
	}
}

public class ProtectedEx {

	public static void main(String[] args) {

		ProtectedEx w = new ProtectedEx();

		Prot1 p = new Prot1();
		p.x = 20;
		p.y = 28;
		System.out.println(p.x+" "+p.y);
	}

}
