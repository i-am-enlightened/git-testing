package interviewPrepMiscellanous;

class Node {
	int data;
	Node left,right;
	
	Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}


class createBSTPreorder {
	private static Node node;
	
	public static Node createNode(Node node, int data) {
		if(node==null) {
			node = new Node(data);
		}
		else if(node.data>data) {
			node.left = createNode(node.left,data);
		}
		else if(node.data<data) {
			node.right = createNode(node.right, data);
		}
		return node;
	}
	
	public static void create(int data) {
		node = createNode(node, data);
	}
	
	public static void inOrderRec(Node root) {
		if(root!=null) {
			inOrderRec(root.left);
			System.out.println(root.data);
			inOrderRec(root.right);
		}
	}
	
}

public class BSTImplementation {
	
	public static void main(String[] args) {
		int[] array = {10, 5, 1, 7, 40, 50};
		int i;
		
		
		for(i=0;i<array.length;i++) {
			createBSTPreorder.create(array[i]);
		}
//		createBSTPreorder.inOrderRec();
	}

}
