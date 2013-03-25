package exam;

public class Increment {
	 //static final int i=9;//if we use final keyword then we've to declare its value
	int i=10;
	void ex(int i){
		i++;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
	}

	public static void main(String[] args) {

		Increment i=new Increment();
		i.ex(5);
	}

}
