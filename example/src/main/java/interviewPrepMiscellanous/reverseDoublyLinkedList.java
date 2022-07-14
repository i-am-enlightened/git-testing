package interviewPrepMiscellanous;

class LinkedList {
	int data;
	LinkedList next;
	LinkedList prev;
	
	public LinkedList() {
		super();
	}
	
	public LinkedList(int data) {
		super();
		this.data = data;
	}

	public LinkedList(int data, LinkedList next, LinkedList prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public LinkedList(int data, LinkedList next) {
		super();
		this.data = data;
		this.next = next;
	}

}

public class reverseDoublyLinkedList {
	
	public static LinkedList reverseLinkedList(LinkedList ll) {
//		ll = ll.prev;

//			if(ll.next!=null) {
//				newL = new LinkedList(ll.data,ll.prev,null);
//			}
//			else if(ll.prev!=null) {
//				newL = new LinkedList(ll.data,null,ll.next);
//			}
//			else {
//				newL = new LinkedList(ll.data,ll.prev,ll.next);
//			}

		LinkedList newList = null;
		LinkedList newL = null;

		while(ll.next!=null) {
			ll = ll.next;
		}
		
		while(ll.prev!=null) {
//			newL = new LinkedList(ll.data, ll.prev, ll.next);
//			newList = new LinkedList(newL.data,newL.next,newL.prev);
//			newList.next = new LinkedList();
			
			newL = new LinkedList(ll.data);
			newL.prev = ll.next;
			newL.next = ll.prev;
			
			newL = newL.next;
			ll = ll.prev;
		}
		
		
		return newList;
	}
	
	public static void main(String[] args) {
		
//		LinkedList node4 = null;
//		LinkedList node3 = null;
//		LinkedList node2 = null;
//		LinkedList node1 = null;
//		
//		node4 = new LinkedList(40,null,node3);
//		node3 = new LinkedList(30,node4,node2);
//		node2 = new LinkedList(20,node3,node1);
//		node1 = new LinkedList(10,node2,null);
		
//		LinkedList oldL = node1;
//		while(oldL!=null) {
//			System.out.println(oldL.data);
//			oldL = oldL.next;
//		}
		
		LinkedList node1 = new LinkedList(10);
		LinkedList node2 = new LinkedList(20);
		LinkedList node3 = new LinkedList(30);
		LinkedList node4 = new LinkedList(40);
		LinkedList node5 = new LinkedList(50);
		
		node1.next = node2;
		node2.next = node3; node2.prev = node1;
		node3.next = node4; node3.prev = node2;
		node4.next = node5; node4.prev = node3;
		node5.prev = node4;
		
		LinkedList newList = reverseLinkedList(node1);
		while(newList!=null) {
			System.out.println(newList.data);
			newList = newList.next;
		}
	}

}
