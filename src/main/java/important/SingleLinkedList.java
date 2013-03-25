package important;

class Node{
	Node next;
	Node pre;
	int val;
	
	Node(int val){
		this.val=val;
		next=null;
		pre=null;
	}
}
public class SingleLinkedList {

	public static void main(String[] args) {

		Node node1=new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		node1.next=node2;
		node2.next=node3;
	}

}
