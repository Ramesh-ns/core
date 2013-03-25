package important;




//If we call two times start() on reference then we get IllegalThreadStateException but if call two times on object like new ThreadEx().start() then it gives the two times result
public class ThreadEx extends Thread {

	public void run(){
			System.out.println("run");
		}
	public static void main(String[] args) {
		ThreadEx a=new ThreadEx();
	/*a.start();
	a.start();*///throws IllegalThreadStateException
		new ThreadEx().start();
		new ThreadEx().start();//gives two times result
		
	}

}
