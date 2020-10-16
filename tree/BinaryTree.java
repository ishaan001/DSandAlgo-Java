package tree;

import java.lang.reflect.Array;
import java.security.spec.DSAGenParameterSpec;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

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
		if (node == null) {
			return -1;
		}

		int leftHeight = height(node.left);
		int rightheight = height(node.right);

		int height = Math.max(leftHeight, rightheight) + 1;

		return height;
	}

	public void preOrderTraversal() {
		preOrderTraversal(this.root);
	}

	private void preOrderTraversal(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);

	}

	public void postOrderTraversal() {
		postOrderTraversal(this.root);
	}

	private void postOrderTraversal(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.data + " ");

	}

	public void inOrderTraversal() {
		inOrderTraversal(this.root);
	}

	private void inOrderTraversal(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		inOrderTraversal(node.left);
		System.out.print(node.data + " ");
		inOrderTraversal(node.right);

	}

	public void inOrderTraversalItreatively() {
		ArrayList<Integer> ll = inOrderTraversalItreatively(this.root);
		System.out.println(ll);
	}

	private ArrayList<Integer> inOrderTraversalItreatively(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			ArrayList<Integer> ll = new ArrayList();
			return ll;
		}
		Stack<Node> s = new Stack<>();
		ArrayList<Integer> ll = new ArrayList();
		while (true) {
			if (node != null) {
				s.push(node);
				node = node.left;
			} else {
				if (s.isEmpty()) {
					break;
				} else {
					node = s.pop();
					ll.add(node.data);
					node = node.right;
				}
			}
		}
		
		return ll;

	}

	public void levelOrderTraversal() {
		levelOrderTraversal(this.root);
	}

	private void levelOrderTraversal(Node node) {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<BinaryTree.Node>();
		q.add(node);
		while (!q.isEmpty()) {
			Node remove = q.remove();
			System.out.print(remove.data + " ");

			if (remove.left != null)
				q.add(remove.left);

			if (remove.right != null)
				q.add(remove.right);
		}

	}
}
