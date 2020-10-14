package tree;

import java.util.*;

public class GenericTree {
	private class Node {
		int data;
		ArrayList<Node> children;

		Node(int data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	private Node root;
	private int size;

	public GenericTree() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		this.root = takeInput(sc, null, 0);
	}

	private Node takeInput(Scanner sc, Node parent, int ithChild) {
		// TODO Auto-generated method stub
		if (parent == null) {
			System.out.println("enter the value of the root node");
		} else {
			System.out.println("enter the value of the"+ithChild+"of child of"+parent.data);
		}

		int data = sc.nextInt();
		Node node = new Node(data);
		System.out.println("number of childern for the " + node.data);

		int children = sc.nextInt();
		for (int i = 0; i < children; i++) {
			Node child = takeInput(sc, node, i);
			node.children.add(child);
		}

		return node;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		String str = node.data + "=>";

		for (int i = 0; i < node.children.size(); i++) {
			str = str + node.children.get(i).data;
		}

		System.out.println(str + "END");

		for (int i = 0; i < node.children.size(); i++) {
			display(node.children.get(i));
		}

	}

}
