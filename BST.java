package july27;

import java.util.LinkedList;
import java.util.Scanner;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	private int size;

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
		if (ab > node.data) {
			return find(node.right, ab);
		} else if (ab < node.data) {
			return find(node.left, ab);
		} else {
			return true;
		}
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node.right != null) {
			return max(node.right);
		} else {
			return node.data;
		}
	}

	public int min() {
		return min(root);
	}

	private int min(Node node) {
		if (node.left != null) {
			return min(node.left);
		} else {
			return node.data;
		}
	}

	public void add(int ab) {
		if (this.size == 0) {
			this.root = new Node();
			this.root.data = ab;
			this.size++;
		} else {
			this.add(root, ab);
		}
	}

	private void add(Node node, int data) {
		if (node == null) {
			return;
		}
		if (data > node.data) {
			if (node.right != null) {
				add(node.right, data);
			} else {
				node.right = new Node();
				node.right.data = data;
				this.size++;
			}
		} else if (data < node.data) {
			if (node.left != null) {
				add(node.left, data);
			} else {
				node.left = new Node();
				node.left.data = data;
				this.size++;
			}
		} else {
			// nothing to do here
		}
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

	// public BST(int[] post,int[] in)
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

	public BST(int[] pre, int[] in) {
		root = construct(pre, in, 0, pre.length - 1, 0, in.length - 1);
	}

	// ask
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

	public BST(int[] sa) {
		root = construct(sa, 0, sa.length - 1);
	}

	private Node construct(int[] sa, int lo, int hi) {
		if (lo > hi) {
			return null;
		}
		Node node = new Node();
		int mid = (lo + hi) / 2;
		node.data = sa[mid];
		this.size++;
		node.left = construct(sa, lo, mid - 1);
		node.right = construct(sa, mid + 1, hi);
		return node;
	}

	public void remove(int data) {
		remove(data, root, null, false);
	}

	private void remove(int data, Node node, Node parent, boolean ilc) {
		if (node == null) {
			return;
		}
		if (data > node.data) {
			remove(data, node.right, node, false);
			this.size--;
		} else if (data < node.data) {
			remove(data, node.left, node, true);
			this.size--;
		} else {
			if (node.left != null && node.right != null) {
				int lmax = max(node.left);
				node.data = lmax;
				remove(lmax, node.left, node, true);
			} else {
				if (ilc) {
					parent.left = (node.left != null ? node.left : node.right);
				} else {
					parent.right = (node.left != null ? node.left : node.right);
				}
				this.size--;
				// else
				// {
				// if(node.left==null&&node.right==null){
				// if(ilc)
				// {
				// parent.left=null;
				// this.size--;
				// }
				// else
				// {
				// parent.right=null;
				// this.size--;
				// }
				// }
				// else
				// if(node.left!=null&&node.right==null)
				// {
				// if(ilc)
				// {
				// parent.left=node.left;
				// }
				// else
				// {
				// parent.right=node.right;
				// }
				// }
				// else
				// if(node.left==null&&node.right!=null)
				// {
				// if(ilc)
				// {
				// parent.left=node.right;
				// }
				// else
				// {
				// parent.right=node.right;
				// }
				// }
				// }
			}
		}
	}

	public void replaceWithSumOfLargerNum() {
		HeapMover mover = new HeapMover();
		mover.sum = 0;
		replaceWithSumOfLargerNum(root, mover);
	}

	private void replaceWithSumOfLargerNum(Node node, HeapMover mover) {
		if (node == null) {
			return;
		}
		replaceWithSumOfLargerNum(node.right, mover);
		int temp = node.data;
		node.data = mover.sum;
		mover.sum += temp;
		System.out.print(node.data + "  ");
		replaceWithSumOfLargerNum(node.left, mover);
	}

	public void printInOrder(int lo, int hi) {
		printInOrder(root, lo, hi);
	}

	private void printInOrder(Node node, int lo, int hi) {
		if (node == null) {
			return;
		}
		if (node.data < lo) {
			printInOrder(node.right, lo, hi);
		} else if (node.data > hi) {
			printInOrder(node.left, lo, hi);
		} else {
			System.out.print(node.data + "  ");
			printInOrder(node.left, lo, hi);
			printInOrder(node.right, lo, hi);
		}
	}

	public boolean sumOfTwoNodes(int data) {
		boolean r = sumOfTwoNodes(root, data);
		return r;
	}

	public boolean find(int a, Node en) {
		return find(root, a, en);
	}

	private boolean find(Node node, int ab, Node en) {

		if (node == null) {
			return false;
		}
		if (ab > node.data) {

			return find(node.right, ab, en);
		} else if (ab < node.data) {
			return find(node.left, ab, en);
		} else {

			if (node != en) {
				return true;
			}

			else {
				return false;
			}
		}
	}

	private boolean sumOfTwoNodes(Node node, int data) {
		if (node == null) {
			return false;
		}
		boolean a = find(data - node.data, node);
		if (a) {
			return true;
		} else {
			boolean resl = sumOfTwoNodes(node.left, data);
			if (resl) {
				return true;
			}
			boolean resr = sumOfTwoNodes(node.right, data);
			if (resr) {
				return true;
			}
		}
		// if (ilc == true) {
		// if (((node.left.data + node.right.data) == data)
		// || ((node.left.data + node.data) == data)
		// || ((node.right.data + node.data) == data)) {
		// return true;
		// }
		// // boolean a=sumOfTwoNodes(node.left,node,true,data);
		// // return a;
		// // }
		// } else {
		// if (((node.left.data + node.right.data) == data)
		// || ((node.left.data + node.data) == data)
		// || ((node.right.data + node.data) == data)) {
		// return true;
		// }
		// // boolean b=sumOfTwoNodes(node.right,node,false,data);
		// // return b;
		// // }
		// }
		return false;
	}

	private class HeapMover {
		int sum;
	}

	private class traversalPair {
		Node node;
		boolean selfdone;
		boolean leftdone;
		boolean rightdone;
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
