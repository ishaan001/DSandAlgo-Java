package tree;

import java.security.spec.DSAGenParameterSpec;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private int size;
	private Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		this.root = takeInput(sc, null, false);
	}

	private Node takeInput(Scanner sc, Node parent, boolean leftOrRight) {
		// TODO Auto-generated method stub
		if (parent == null) {
			System.out.println("enter data for the root node");
		} else {
			if (leftOrRight) {
				System.out.println("enter the data for the left child of the Node " + parent.data);
			} else {
				System.out.println("enter the data for the  right child of the Node " + parent.data);
			}
		}

		int nodeData = sc.nextInt();
		Node node = new Node(nodeData, null, null);
		System.out.println("does node " + node.data + " have left child");
		this.size++;
		boolean choice = false;
		choice = sc.nextBoolean();
		if (choice) {
			node.left = takeInput(sc, node, true);
		}

		System.out.println("does node " + node.data + " have right child");
		choice = sc.nextBoolean();
		if (choice) {
			node.right = takeInput(sc, node, false);
		}

		return node;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		String str = "";
		if (node.left != null) {
			str += node.left.data + "=> ";
		} else {
			str += "END =>";
		}

		str += node.data;

		if (node.right != null) {
			str += "<= " + node.right.data;
		} else {
			str += "<= END";
		}

		System.out.println(str);
		if (node.left != null)
			display(node.left);

		if (node.right != null)
			display(node.right);

	}
	
	public int height() {
		return height(this.root);
	}

	private int height(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return -1;
		}
		
		int leftHeight = height(node.left);
		int rightheight = height(node.right);
		
		int height = Math.max(leftHeight, rightheight) + 1;
		
		return height;
	}

}
