package july27;

import june21.finddata;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre={50, 25, 12, 37, 75, 62, 87}; 
		int[] post={12, 37, 25, 62, 87, 75, 50}; 
		int[] in={12, 25, 37, 50, 62, 75, 87}; 
		int[] sa={12,25,37,50,62,75,87};
		// TODO Auto-generated method stub
//		50 true 25 true 12 false false true 37 false false true 75 true 62 false false true 57 false false 
		BST bst=new BST(sa);
		bst.display();
//		System.out.println(bst.size2());
//		System.out.println(bst.find(62));
//		System.out.println(bst.max());
//		System.out.println(bst.height());
//		System.out.println(bst.min());
//		bst.add(60);
//		bst.display();
//        System.out.println(bst.diameter());
//        System.out.println(bst.diameter2());
//        System.out.println(bst.isBalanced());
//        bst.preorder();
//        System.out.println();
//        bst.postorder();
//        System.out.println();
//        bst.inorder();
//        System.out.println();
//        bst.levelorder();
//        System.out.println();
//        bst.iterativePreOrder();
//        System.out.println();
//        bst.iterativePostOrder();
//        System.out.println();
//        bst.iterativeInOrder();
//		bst.remove(75);
//		bst.display();
//		bst.replaceWithSumOfLargerNum();
//		bst.display();
//		bst.printInOrder(37, 62);
		System.out.println(bst.sumOfTwoNodes(50));
	}

	}


