package important;
	
	  class TNQueue {
		private int size;
		private int[] queueArr;
		private int front = -1;
		private int rear = -1;
		private int totalItems;
		
		public TNQueue(int s) {
			size = s;
			queueArr = new int[s];
		}
		
		public void insert(int i) {
			rear++;
			System.out.println("Inserting "+i);
			queueArr[rear] = i;
			totalItems++;
		}
		
		public int remove() {
			front++;
			totalItems--;
			System.out.println("Removing "+queueArr[front]);
			return queueArr[front];
		}
		
		public boolean isFull() {
			return (totalItems == size);
		}
		
		public boolean isEmpty() {
			return (totalItems == 0);
		}
	}
	 
	public class QueueImpl {

		 
		public static void main(String[] args) {
			TNQueue tnq = new TNQueue(3);
			if(!tnq.isFull())
				tnq.insert(1);
			if(!tnq.isFull())
				tnq.insert(2);
			if(!tnq.isFull())
				tnq.insert(3);
			if(!tnq.isFull())
				tnq.insert(4);
			else 
				System.out.println("Queue is full, cannot insert element");
			
			if(!tnq.isEmpty())
				tnq.remove();
			if(!tnq.isEmpty())
				tnq.remove();
			if(!tnq.isEmpty())
				tnq.remove();
			if(!tnq.isEmpty())
				tnq.remove();
			else 
				System.out.println("Queue is empty, cannot remove element");	
		}
	}

