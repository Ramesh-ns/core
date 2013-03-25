package imp;

class ThreadA extends InterThreadCommunication{
	int total=0;
	public void run(){
		synchronized (this) {
			System.out.println("Child thread starts notification");
			for(int i=0;i<=10;i++){
				total=total+i;
			}
			
			System.out.println("Child thread is trying to give notification");
			 this.notify();
		}
	}
	
}
public class InterThreadCommunication extends Thread{

	public static void main(String[] args) throws InterruptedException {

		ThreadA t=new ThreadA();
		t.start();
		synchronized (t) {
			System.out.println("main thread trying to call wait()");
			t.wait();
			System.out.println("main thread got notification");
			System.out.println(t.total);
		}
	}

}
