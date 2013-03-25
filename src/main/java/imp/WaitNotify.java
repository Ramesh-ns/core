package imp;


class Thread1 extends Thread{
	int total;
	
	public void run(){
		synchronized (this) {
			for(int x=0;x<=5;x++){
				System.out.println(x);
				total=total+x;
				notify();
				/*try {
					Thread.sleep(1000);// We can call sleep() on Thread but we can't call wait() on Thread it can call on an object
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
			
		}
		
	}
}
	public class WaitNotify {
	public static void main(String[] args) throws InterruptedException {

		Thread1 t=new Thread1();
		t.start();
		synchronized (t) {
			System.out.println("waiting for t to complete...");
			t.wait(200000);
		}
		
		System.out.println("total is :"+t.total);
	}

}
