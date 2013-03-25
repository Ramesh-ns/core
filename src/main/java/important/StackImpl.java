package important;
	
	  class TNStack {
		private int size;
		private int[] inpArr;
		private int top = -1;
		
		public TNStack(int size) {
			inpArr = new int[size];
		}
		
		/**
		 * increment the ctr and push element into stack 
		 * @param i element to be pushed
		 */
		public void push(int i) {
			inpArr[++top] = i;
		}
		
		/**
		 * pop the element from stack and decrement the ctr 
		 * @return the popped element
		 */
		public int pop() {
			return inpArr[top--];
		}
		
		public int peek() {
			return inpArr[top];
		}
		
		public boolean isFull() {
			return (top == size);
		}
		
		public boolean isEmpty() {
			return (top == -1);
		}
	}

	/**
	 * @author ntallapa
	 *
	 */
	public class StackImpl {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			TNStack tns = new TNStack(10);
			// push some elements
			tns.push(4);
			tns.push(5);
			tns.push(3);
			tns.push(6);

			// pop some elements
			System.out.println(tns.pop());
			System.out.println(tns.pop());

			// peek couple of times; result should be same
			System.out.println(tns.peek());
			System.out.println(tns.peek());
		}
	}

