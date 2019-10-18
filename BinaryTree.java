package july26;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	private int size;

	public BinaryTree() {
		Scanner scn = new Scanner(System.in);
		root = takeInput(null, false, scn);
	}

	public Node takeInput(Node parent, boolean ilc, Scanner scn) {
		// prompt
		if (parent == null) {
			System.out.println("Enter the root ");
		} else {
			if (ilc == true) {
				System.out.println("Enter the left child for " + parent.data);
			} else {
				System.out.println("Enter the right child for " + parent.data);
			}
		}

		// collect data
		int data = scn.nextInt();

		// create node,assign data and increase child
		Node node = new Node();
		node.data = data;
		this.size++;

		// work for left child of node
		System.out.println("Do you have left child for " + node.data);
		boolean hlc = scn.nextBoolean();
		if (hlc == true) {
			node.left = takeInput(node, true, scn);
		}

		// work for left child of node
		System.out.println("Do you have right child for " + node.data);
		boolean hrc = scn.nextBoolean();
		if (hrc == true) {
			node.right = takeInput(node, false, scn);
		}

		// return
		return node;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int size2() {
		return size2(root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}
		int lsize = size2(node.left);
		int rsize = size2(node.right);
		int size = lsize + rsize + 1;
		return size;
	}

	public boolean find(int a) {
		return find(root, a);
	}

	private boolean find(Node node, int ab) {
		if (node == null) {
			return false;
		}
		if (node.data == ab) {
			return true;
		}
		boolean filc = find(node.left, ab);
		if (filc == true) {
			return true;
		}
		boolean firc = find(node.right, ab);
		if (firc == true) {
			return true;
		}
		return false;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int lmax = max(node.left);
		int rmax = max(node.right);
		return Math.max(Math.max(lmax, rmax), node.data);
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lheight = height(node.left);
		int rheight = height(node.right);
		return Math.max(lheight, rheight) + 1;
	}

	public int diameter() {
		return diameter(root);
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}
		int ld = diameter(node.left);
		int rd = diameter(node.right);
		int lh = height(node.left);
		int rh = height(node.right);
		int f1 = lh + rh + 2; // the distance between deepest of left and
								// deepest of right
		int f2 = ld; // the max between any two nodes of left family alone
		int f3 = rd; // the max between any two nodes of right family alone
		return Math.max(f1, Math.max(f2, f3));
	}

	public int diameter2() // to manage duplicacy
	{
		return diameter2(root).dia;
	}

	private DiaPair diameter2(Node node) {
		if (node == null) {
			DiaPair bp = new DiaPair();
			bp.height = -1;
			bp.dia = 0;
			return bp;
		}
		DiaPair lp = diameter2(node.left);
		DiaPair rp = diameter2(node.right);
		int f1 = lp.height + rp.height + 2;
		int f2 = lp.dia;
		int f3 = rp.dia;
		DiaPair mp = new DiaPair();
		mp.height = Math.max(lp.height, rp.height) + 1;
		mp.dia = Math.max(f1, Math.max(f2, f3));
		return mp;
	}

	public boolean isBalanced() {
		return isBalanced(root).isBalanced;
	}

	private BalancedPair isBalanced(Node node) {
		if (node == null) {
			BalancedPair bp = new BalancedPair();
			bp.isBalanced = true;
			bp.height = -1;
			return bp;
		}
		BalancedPair lb = isBalanced(node.left);
		BalancedPair rb = isBalanced(node.right);
		int gap = Math.abs(lb.height - rb.height);
		BalancedPair mp = new BalancedPair();
		if (lb.isBalanced && rb.isBalanced && gap <= 1) {
			mp.isBalanced = true;
		} else {
			mp.isBalanced = false;
		}

		mp.height = Math.max(lb.height, rb.height) + 1;

		return mp;
	}

	public boolean bst() {
		return bst(root).check;
	}

	private bstPair bst(Node node) {
		if (node == null) {
			bstPair bp = new bstPair();
			bp.max = Integer.MIN_VALUE;
			bp.min = Integer.MAX_VALUE;
			bp.check = true;
			return bp;
		}
		bstPair lbst = bst(node.left);
		bstPair rbst = bst(node.right);
		bstPair mp = new bstPair();
		mp.max = Math.max(node.data, Math.max(lbst.max, rbst.max));
		mp.min = Math.min(node.data, Math.min(lbst.min, rbst.min));
		if (lbst.check && rbst.check && lbst.max < node.data
				&& rbst.min > node.data) {
			mp.check = true;
		} else {
			mp.check = false;
		}
		return mp;
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + ", ");
		preorder(node.left);
		preorder(node.right);
	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(Node node) {
		if (node == null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + ", ");
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(Node node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data + ", ");
		inorder(node.right);
	}

	public void levelorder() {
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.addLast(root);
		while (!queue.isEmpty()) {
			Node rem = queue.removeFirst();
			System.out.print(rem.data + ", ");
			if (rem.left != null) {
				queue.addLast(rem.left);
			}
			if (rem.right != null) {
				queue.addLast(rem.right);
			}
		}
	}

	// ask
	public void iterativePreOrder() {
		LinkedList<traversalPair> stack = new LinkedList<traversalPair>();
		traversalPair rootPair = new traversalPair();
		rootPair.node = root;
		stack.addFirst(rootPair);
		while (stack.size() != 0) {
			traversalPair topPair = stack.getFirst();
			if (topPair.selfdone == false) {
				System.out.print(topPair.node.data + ", ");
				topPair.selfdone = true;
			} else if (topPair.leftdone == false) {
				if (topPair.node.left != null) {
					traversalPair lp = new traversalPair();
					lp.node = topPair.node.left;
					stack.addFirst(lp);
				}
				topPair.leftdone = true;
			} else if (topPair.rightdone == false) {
				if (topPair.node.right != null) {
					traversalPair rp = new traversalPair();
					rp.node = topPair.node.right;
					stack.addFirst(rp);
				}
				topPair.rightdone = true;
			} else {
				stack.removeFirst();
			}
		}
	}

	public void iterativePostOrder() {
		LinkedList<traversalPair> stack = new LinkedList<traversalPair>();
		traversalPair rootPair = new traversalPair();
		rootPair.node = root;
		stack.addFirst(rootPair);
		while (stack.size() != 0) {
			traversalPair topPair = stack.getFirst();
			if (topPair.leftdone == false) {
				if (topPair.node.left != null) {
					traversalPair lp = new traversalPair();
					lp.node = topPair.node.left;
					stack.addFirst(lp);
				}
				topPair.leftdone = true;
			} else if (topPair.rightdone == false) {
				if (topPair.node.right != null) {
					traversalPair rp = new traversalPair();
					rp.node = topPair.node.right;
					stack.addFirst(rp);
				}
				topPair.rightdone = true;
			} else if (topPair.selfdone == false) {
				System.out.print(topPair.node.data + ", ");
				topPair.selfdone = true;
			}

			else {
				stack.removeFirst();
			}
		}
	}

	public void iterativeInOrder() {
		LinkedList<traversalPair> stack = new LinkedList<traversalPair>();
		traversalPair rootPair = new traversalPair();
		rootPair.node = root;
		stack.addFirst(rootPair);
		while (stack.size() != 0) {
			traversalPair topPair = stack.getFirst();
			if (topPair.leftdone == false) {
				if (topPair.node.left != null) {
					traversalPair lp = new traversalPair();
					lp.node = topPair.node.left;
					stack.addFirst(lp);
				}
				topPair.leftdone = true;
			} else if (topPair.selfdone == false) {
				System.out.print(topPair.node.data + ", ");
				topPair.selfdone = true;
			}

			else if (topPair.rightdone == false) {
				if (topPair.node.right != null) {
					traversalPair rp = new traversalPair();
					rp.node = topPair.node.right;
					stack.addFirst(rp);
				}
				topPair.rightdone = true;
			} else {
				stack.removeFirst();
			}
		}
	}

	// public BinaryTree(int[] post,int[] in)
	// {
	// root=construct(post,in,0,post.length-1,0,in.length-1);
	// }

	// private Node construct(int[] post,int[] in,int posi,int poei,int isi,int
	// iei)
	// {
	// if(posi>poei||isi>iei)
	// {
	// return null;
	// }
	// Node node=new Node();
	// this.size++;
	// node.data=post[poei];
	// int idx=-1;
	// for(int i=isi;i<=iei;i++)
	// {
	// if(in[i]==node.data)
	// {
	// idx=i;
	// break;
	// }
	// }
	// int nelonis=idx-isi;
	// node.left=construct(post,in,posi,posi+nelonis-1,isi,idx-1);
	// node.right=construct(post,in,posi+nelonis,poei-1,idx+1,iei);
	// return node;
	// }

	public BinaryTree(int[] pre, int[] in) {
		root = construct(pre, in, 0, pre.length - 1, 0, in.length - 1);
	}

	private Node construct(int[] pre, int[] in, int psi, int pei, int isi,
			int iei) {
		if (psi > pei || isi > iei) {
			return null;
		}
		Node node = new Node();
		this.size++;
		node.data = pre[psi];
		int idx = -1;
		for (int i = isi; i <= iei; i++) {
			if (in[i] == node.data) {
				idx = i;
				break;
			}
		}
		int nelonis = idx - isi;
		node.left = construct(pre, in, psi + 1, psi + nelonis, isi, idx - 1);
		node.right = construct(pre, in, psi + nelonis + 1, pei, idx + 1, iei);
		return node;
	}

	public void printWithoutSibling() {
		printWithoutSibling(root, null);
	}

	private void printWithoutSibling(Node node, Node parent) {
		if (node == null) {
			return;
		}

		if (node.left != null && node.right == null) {
			System.out.print(node.left.data + "  ");
		} else if (node.right != null && node.left == null) {
			System.out.print(node.right.data + "  ");
		}
		printWithoutSibling(node.left, node);
		printWithoutSibling(node.right, node);
	}

	public void removeLeaves() {
		removeLeaves(root, null, false);
	}

	private void removeLeaves(Node node, Node parent, boolean ilc) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			if (ilc) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		}
		removeLeaves(node.left, node, true);
		removeLeaves(node.right, node, false);
	}

	public void bstLarger() {
		//return bst(root).lbstsize;
		System.out.println(bstLarger(root).lbstsize);
		System.out.println(bstLarger(root).lbstroot.data);
	}

	private bstPair bstLarger(Node node) {
		if (node == null) {
			bstPair bp = new bstPair();
			bp.max = Integer.MIN_VALUE;
			bp.min = Integer.MAX_VALUE;
			bp.check = true;
			bp.lbstsize = 0;
			bp.lbstroot = null;
			return bp;
		}
		bstPair lbst = bstLarger(node.left);
		bstPair rbst = bstLarger(node.right);
		bstPair mp = new bstPair();
		mp.max = Math.max(node.data, Math.max(lbst.max, rbst.max));
		mp.min = Math.min(node.data, Math.min(lbst.min, rbst.min));
		 mp.lbstsize++;
		if (lbst.check && rbst.check && lbst.max < node.data
				&& rbst.min > node.data) {
			mp.check=true;
			mp.lbstsize = lbst.lbstsize + rbst.lbstsize + 1;
			mp.lbstroot=node;
		} else {
			if (lbst.lbstsize > rbst.lbstsize) {
				mp.check = true;
				mp.lbstsize = lbst.lbstsize;
				mp.lbstroot = lbst.lbstroot;
			} else {
				mp.check = false;
				mp.lbstsize = rbst.lbstsize;
				mp.lbstroot = rbst.lbstroot;
			}
		}
		return mp;
	}

	private class traversalPair {
		Node node;
		boolean selfdone;
		boolean leftdone;
		boolean rightdone;
	}

	private class bstPair {
		int min;
		int max;
		boolean check;
		Node lbstroot;
		int lbstsize;
	}

	private class DiaPair {
		int height;
		int dia;
	}

	private class BalancedPair {
		int height;
		boolean isBalanced;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}
		str += " <= ";
		str += node.data;
		str += " => ";
		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
}
