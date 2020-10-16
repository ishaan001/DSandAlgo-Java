package tree;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false 
		BinaryTree br = new BinaryTree();
		br.display();
		System.out.println(br.height());
		System.out.println("=========Pre Order Traversal============");
		br.preOrderTraversal();
		System.out.println("\n=========Post Order Traversal============");
		br.postOrderTraversal();
		System.out.println("\n=========In Order Traversal============");
		br.inOrderTraversal();
		System.out.println("\n=========Level Order Traversal============");
		br.levelOrderTraversal();
		System.out.println("\n=========In Order Traversal loop============");
		br.inOrderTraversalItreatively();

	}

}
