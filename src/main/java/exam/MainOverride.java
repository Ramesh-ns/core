package exam;

class MainBase extends MainOverride{
	public static void main(String[] args){
		System.out.println("main class");
	}
	/*public int main(int i){
		return 1;
	}*/
	public static void main(int x){
		System.out.println(x);
	}
}
public class MainOverride {
	

	public static void main(String[] args) {

		System.out.println("MainOverride class");
		MainBase mb=new MainBase();
		mb.main(args);
		//mb.main(i);
		mb.main(3);
	}

}
