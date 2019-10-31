import java.util.*;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] pre={50, 25, 12,37, 75, 62,57}; 
		int[] post={12, 37, 25, 62, 57, 75, 50}; 
		int[] in={12, 25,37, 50, 62, 75,57}; 
		// TODO Auto-generated method stub
//		50 true 25 true 12 false false true 37 false false true 75 true 62 false false true 57 false false 
		BinaryTree bt=new BinaryTree(pre,in);
		bt.display();
//		System.out.println(bt.size2());
//		System.out.println(bt.find(62));
//		System.out.println(bt.max());
//		System.out.println(bt.height());
//        System.out.println(bt.diameter());
//        System.out.println(bt.diameter2());
//        System.out.println(bt.isBalanced());
//        System.out.println(bt.bst());
//        bt.preorder();
//        System.out.println();
//        bt.postorder();
//        System.out.println();
//        bt.inorder();
//        System.out.println();
//        bt.levelorder();
//        System.out.println();
//        bt.iterativePreOrder();
//        System.out.println();
//        bt.iterativePostOrder();
//        System.out.println();
//        bt.iterativeInOrder();
//		bt.printWithoutSibling();
//		bt.removeLeaves();
//		bt.display();
		bt.bstLarger();
	}
}
