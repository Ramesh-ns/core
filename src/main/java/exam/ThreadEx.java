package exam;

public class ThreadEx extends Thread {

	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(i);
			try {
				Thread t=null;
				t.sleep(1000);
				//Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
/* -->if we extends Thread class then we can use both start() and run methods. if we use
 *    directly run() method then run() will execute but if we use start() then if any sysout() will
 *    be under start it'll execute after that run method'll execute and we can call both run() and
 *    start() methods but programs will gives the two times o/p.
 *  --> But don't use the start() method when we implements the Runnable interface because Runnable 
 *  interface has only one method calls run() so we can directly call run() method.*/
		ThreadEx t=new  ThreadEx();
		t.run();
		t.start();
		
		t.run();
		
		
		//Thread.sleep(1000);
		System.out.println("after start");
		
	}

}
