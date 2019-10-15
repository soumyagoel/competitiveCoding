
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class GenericTree {

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<Node>();
	}

	private Node root;
	int size;

	public GenericTree() {
		Scanner scn = new Scanner(System.in);
		this.root = takeInput(null, -1, scn);
	}

	private Node takeInput(Node parent, int childidx, Scanner scn) {

		// prompt the user
		if (parent == null) {
			System.out.println("Enter the root");
		} else {
			System.out.println("Enter the " + childidx + "th child of "
					+ parent.data);
		}

		// get data
		int data = scn.nextInt();

		// create node && increase size
		Node child = new Node();
		this.size++;

		// set node's data
		child.data = data;

		// prompt for no. children for this node
		System.out.println("Enter the number of children for " + child.data);
		int grndchno = scn.nextInt();

		// solve the same problem for children
		for (int i = 0; i < grndchno; i++) {
			Node children = takeInput(child, i, scn);
			child.children.add(children);
		}
		return child;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int size2() {
		int a = size2(root);
		return a;
	}

	private int size2(Node node) {
		int s = 0;
		for (Node child : node.children) {
			int cs = size2(child);
			s += cs;
		}
		s += 1;
		// for the node itself
		return s;
	}

	public int max() {
		int a = max(root);
		return a;
	}

	private int max(Node node) {
		int m1 = node.data;
		for (Node child : node.children) {
			int m2 = max(child);
			if (m2 > m1) {
				m1 = m2;
			}
		}
		return m1;
	}

	public boolean find() {
		Scanner scn1 = new Scanner(System.in);
		int c = scn1.nextInt();
		boolean a = find(root, c);
		return a;
	}

	private boolean find(Node node, int ab) {
		if (node.data == ab) {
			return true;
		}
		for (Node child : node.children) {
			boolean b = find(child, ab);
			if (b == true) {
				return true;
			}
		}
		return false;
	}

	public int height() {
		int a = height(root);
		return a;
	}

	private int height(Node node) {
		int h = -1;
		for (Node child : node.children) {
			int ch = height(child);
			if (ch > h) {
				h = ch;
			}
		}
		return h + 1; // for the distance between node and child
	}

	public void mirror() {
		mirror(root);
	}

	private void mirror(Node node) {

		for (Node child : node.children) {
			mirror(child);
		}
		int l = 0;
		int r = node.children.size() - 1;
		while (l < r) {
			Node temp = node.children.get(l);
			Node temp1 = node.children.get(r);
			node.children.set(l, temp1);
			node.children.set(r, temp);
			l++;
			r--;
		}
	}

	public void printAtLevel() {
		Scanner scn2 = new Scanner(System.in);
		int depth = scn2.nextInt();
		printAtLevel(root, depth, 0);
	}

	//
	private void printAtLevel(Node node, int a, int currlevel) {
		for (Node child : node.children) {

			printAtLevel(child, a, currlevel + 1);
		}
		if (currlevel == a) {
			System.out.print(node.data + "  ");
		}
	}

	public void preOrder() {
		preOrder(root);
		System.out.println(" . ");
	}

	private void preOrder(Node node) {
		System.out.print(node.data + " ");
		for (Node child : node.children) {
			preOrder(child);
		}
	}

	public void postOrder() {
		postOrder(root);
		System.out.println(".");
	}

	private void postOrder(Node node) {
		for (Node child : node.children) {
			postOrder(child);
		}
		System.out.print(node.data + " ");
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.addLast(root);
		while (queue.size() != 0) {
			Node rem = queue.removeFirst();
			System.out.print(rem.data + " ");
			for (Node child : rem.children) {
				queue.addLast(child);
			}
		}
		System.out.println();
	}

	public void levelOrderWithLevel() {
		LinkedList<Node> queue = new LinkedList<Node>();
		LinkedList<Node> nlqueue = new LinkedList<Node>();
		queue.addLast(root);
		int level = 1;
		System.out.print(level + ". ");
		while (queue.size() != 0) {
			Node rem = queue.removeFirst();
			System.out.print(rem.data + " ");
			for (Node child : rem.children) {
				nlqueue.addLast(child);
			}
			System.out.print(" . ");
			if (queue.size() == 0) {
				queue = nlqueue;
				nlqueue = new LinkedList<Node>();
				System.out.println();
				level++;
				System.out.print(level + ". ");
			}
		}
		System.out.println();
	}

	public void MultiSolver(int data) {
		HeapMover bucket = new HeapMover();
		MultiSolver(root, bucket, data, 0);
		System.out.println("Size is " + bucket.size);
		System.out.println("Found is " + bucket.found);
		System.out.println("Max is " + bucket.max);
		System.out.println("Min is " + bucket.min);
		System.out.println("Height is " + bucket.height);

		if (bucket.justlarger == null) {
			System.out.println("Justlarger not found");
		} else {
			System.out.println("Justlarger is " + bucket.justlarger.data);
		}

		if (bucket.predecessor == null) {
			System.out.println("Predecessor not found");
		} else {
			System.out.println("Predecessor is " + bucket.predecessor.data);
		}

		if (bucket.successor == null) {
			System.out.println("Successor not found");
		} else {
			System.out.println("Successor is " + bucket.successor.data);
		}
	}

	private void MultiSolver(Node node, HeapMover bucket, int data, int depth) {
		bucket.prev = bucket.curr;
		bucket.curr = node;
		bucket.size++;
		if (bucket.found == true && bucket.successor == null) {
			bucket.successor = bucket.curr;
		}
		if (node.data == data) {
			bucket.found = true;
			bucket.predecessor = bucket.prev;
		}
		if (node.data > bucket.max) {
			bucket.max = node.data;
		}
		if (node.data < bucket.min) {
			bucket.min = node.data;
		}
		if (depth > bucket.height) {
			bucket.height = depth;
		}
		if (node.data > data) {
			if (bucket.justlarger == null) {
				bucket.justlarger = node;
			} else {
				if (node.data < bucket.justlarger.data) {
					bucket.justlarger = node;
				}
			}
		}
		for (Node child : node.children) {
			MultiSolver(child, bucket, data, depth + 1);
		}
	}

	public void kthsmallest(int k) {
		int kthsmallest = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			HeapMover mover = new HeapMover();
			kthsmallest(mover, root, kthsmallest);
			kthsmallest = mover.justlarger.data;
		}
		System.out.println(kthsmallest);
	}

	private void kthsmallest(HeapMover bucket, Node node, int data) 
	{              
		if (node.data > data) {
			if (bucket.justlarger == null) {
				bucket.justlarger = node;
			} else {
				if (node.data < bucket.justlarger.data) {
					bucket.justlarger = node;
				}
			}
		}
		for (Node child : node.children) {
			kthsmallest(bucket, child, data);
		}
	}

	public void removeLeaves() {
		removeLeaves(root);
	}

	private void removeLeaves(Node node) {
//		for(int i=0;i<=node.children.size();i++)1.Cannot use this because after removal size is dec. and i is
//		inc. then i and size will meet at the same point and full loop may not work
//		2.If we remove from starting then we have to change its indexing every time and it will be more
//		complicated to manage
//		for (Node child : node.children) cannot use in place of this
//		for (int i = node.children.size() - 1; i >= 0; i--)
//		coz in this loop we cannot remove any value for which the loop in running
		for (int i = node.children.size() - 1; i >= 0; i--) {
			Node child = node.children.get(i);
			if (child.children.size() == 0) 
			{
				node.children.remove(i);
			}
		}
		for (Node child : node.children) {
			removeLeaves(child);
		}
	}

	public void linearize() 
	{
		linearize(root);
	}

	private void linearize(Node node)
	{
		for(int i=node.children.size()-1;i>0;i--)
		{
		     Node child=node.children.get(i);
		     Node child1=node.children.get(i-1);
		     node.children.remove(i);
		     child1.children.add(child);
		}
		for(Node child:node.children)
		{
			linearize(child);
		}
	}
	
	public void levelOrderZigZag()
	{
		levelOrderZigZag(root);
	}
	
	private void levelOrderZigZag(Node node)
	{     
		LinkedList<Node> queue = new LinkedList<Node>();
		LinkedList<Node> nlqueue = new LinkedList<Node>();
		queue.addLast(root);
		int level = 1;
		System.out.print(level + ". ");
		while (queue.size() != 0) {
			if(level%2==0)
			{
			Node rem = queue.removeLast();
			System.out.print(rem.data + " ");
			for (Node child : rem.children) {
				nlqueue.addLast(child);
			}
			System.out.print(" . ");
			}
			else
			{
				Node rem = queue.removeLast();
				System.out.print(rem.data + " ");
				for (Node child :rem.children) {
					nlqueue.addLast(child);
				}
				System.out.print(" . ");
			}
			if (queue.size() == 0) {
				queue = nlqueue;
				nlqueue =new LinkedList<Node>();
				System.out.println();
				level++;
				System.out.print(level + ". ");
			}
		}
		System.out.println();
	}
	
	public boolean isisomorphic()
	{
		Scanner scn=new Scanner(System.in);
		this.root=takeInput(null,-1,scn);
	    	return isisomorphic(root);
	}
	
	private boolean isisomorphic(Node node)
	{
		for(Node child1:node.children)
		{
			isisomorphic(child1);
		for(Node child:node.children)
		{
			isisomorphic(child);
		if(child1.children!=child.children)
		{
			return false;
		}
		else
		{
			return true;
		}
		}
		}
		return false;	    
	}
	
	private class HeapMover {
		private int data;                              //initially zero
		private int size;                              //initially zero
		private boolean found;                         //initially false
		private int height;                            //initially zero
		private int max = Integer.MIN_VALUE;           //initially -infinity
		private int min = Integer.MAX_VALUE;           //initially +infinity
		private Node predecessor;                      //node initially null
		private Node successor;
		private Node prev;
		private Node curr;
		private Node justlarger;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		System.out.print(node.data + " => ");
		for (Node child : node.children) {
			System.out.print(child.data + " , ");
		}
		System.out.println(" . ");
		for (Node child : node.children) {
			display(child);
		}
	}
}
