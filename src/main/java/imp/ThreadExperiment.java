package imp;
//If implement the Runnable interface that time we should override the run() other wise we get compile time error like add unimplemented methods
public class ThreadExperiment implements Runnable{

	public static void main(String[] args) {
		
		ThreadExperiment tc=new ThreadExperiment(){
			public void run(){
				System.out.println("abc");
			}
		};
	//w.start();
		ThreadExperiment tc1=new ThreadExperiment();
		Thread t=new Thread(tc1);
		tc.run();// o/p is : abc
		t.run(); // o/p is : abc
		
		//tc.start();//compile time error
	
		
		
		        }

	@Override
	public void run() {

		System.out.println("original");
	}

}
