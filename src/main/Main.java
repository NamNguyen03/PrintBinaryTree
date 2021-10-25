package main;

public class Main {

	//hàm tạo 1 cây bậc 2 đầy đủ
	private static  Node initNode(int i ) {
		Node node = new Node(100 + i);
		Node nodeLeft = new Node(204 + i);
		Node nodeRight = new Node(200 + i);
		
		
		
		nodeLeft.setNodeRight(new Node(210+ i));
		nodeLeft.setNodeLeft(new Node(454 + i));
		
		nodeRight.setNodeLeft(new Node(541 + i));
		nodeRight.setNodeRight(new Node(888 + i));
		
		node.setNodeLeft(nodeLeft);
		node.setNodeRight(nodeRight);
		return node;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = initNode(7);
		
		Node node1 = initNode(8);
		
		Node node2 = initNode(92);
		
		Node node3 = initNode(53);
		
		Node node4 = initNode(28);
		//gắn 4 cây bậc 2 vào bậc 2 để được cây bậc 4 đầy đủ
		node.getNodeLeft().setNodeLeft(node1);
		node.getNodeLeft().setNodeRight(node2);
		node.getNodeRight().setNodeRight(node3);
		node.getNodeRight().setNodeLeft(node4);
		System.out.println("");
		new PrintTree(node);
	}

}
