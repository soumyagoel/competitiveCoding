
public class linkedlist {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	//
	public void AddFirst(int value) {
		Node n = new Node();
		n.data = value;
		n.next = this.head;
		if (this.size == 0) {
			this.head = n;
			this.tail = n;
		} else {
			this.head = n;
		}
		this.size++;
	}

	//
	public int getlast() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		return this.tail.data;
	}

	//
	public int getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		return this.head.data;
	}

	//
	private Node getnodeAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Cannot obtain node");
		}
		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	//
	public void addAt(int value, int idx) throws Exception {
		if (idx < 0 || idx > this.size) {
			throw new Exception("Not found");
		}
		if (idx == 0) {

			this.AddFirst(value);
		}
		if (idx == this.size) {
			this.AddLast(value);
		}
		Node natidxm1 = getnodeAt(idx - 1);
		Node natidxp1 = natidxm1.next;
		Node n1 = new Node();
		n1.data = value;
		natidxm1.next = n1;
		n1.next = natidxp1;
		this.size++;
	}

	//
	public void AddLast(int value) {
		Node n = new Node();
		n.data = value;
		n.next = null;
		if (this.size == 0) {
			this.head = n;
			this.tail = n;
		} else {
			this.tail.next = n;
			this.tail = n;
		}
		this.size++;
	}

	//
	public int getAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Cannot obtain node");
		}
		return getnodeAt(idx).data;
	}

	//
	public int size() {
		return this.size;
	}

	//
	public boolean isempty() {
		return this.size == 0;
	}

	//
	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Empty list");
		}
		int rv = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return rv;
	}

	//
	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("list is empty");
		}
		int value = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			getnodeAt(this.size - 2).next = null;
			this.tail = getnodeAt(this.size - 2);
		}
		this.size--;
		return value;
		// int rv = this.head.data;
		// this.tail.data=rv;
		// if (this.size == 1) {
		// this.head = null;
		// this.tail = null;
		// }
		// Node sm1 = getnodeAt(size - 2);
		// this.tail = sm1;
		// this.tail.next = null;
		// this.size--;
		// return rv;
	}

	//
	public int removeAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Not found");
		}
		if (idx == 0) {

			return this.removeFirst();
		}
		if (idx == this.size) {
			return this.removeLast();
		} else {
			Node natidxm1 = getnodeAt(idx - 1);
			Node n1 = natidxm1.next;
			natidxm1.next = n1.next;
			this.size--;
			return n1.data;
		}
	}

	// on2
	public void reversedataIterative() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left <= right) {
			Node getleft = getnodeAt(left);
			Node getright = getnodeAt(right);
			int temp = getleft.data;
			getleft.data = getright.data;
			getright.data = temp;
			left++;
			right--;
		}
	}

	// on
	public void reverseIterativePointer() throws Exception {
		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	public void reversePointerRecursive() {
		this.reversePointerRecursive(this.head);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;

	}

	private void reversePointerRecursive(Node node) {
		if (node == tail) {
			return;
		}
		reversePointerRecursive(node.next);
		node.next.next = node;
		// Node temp = this.head;
		// this.head = this.tail;
		// this.tail = temp;
		// this.tail.next = null;
	}

	public void reverseDataRecursive() {
		heapmover left = new heapmover();
		left.node = this.head;
		reverseDataRecursive(left, this.head, 0);
	}

	private void reverseDataRecursive(heapmover left, Node right, int floor) {
		if (right == null) {
			return;
		}

		reverseDataRecursive(left, right.next, floor + 1);
		if (floor >= size / 2) {
			int temp = left.node.data;
			left.node.data = right.data;
			right.data = temp;
			left.node = left.node.next;
		}
	}

	public void isPallindrome() {
		heapmover left = new heapmover();
		left.node = this.head;
		boolean a = isPallindrome(left, this.head);
		System.out.println(a);
	}

	private boolean isPallindrome(heapmover left, Node right) {
		if (right == null) {
			return true;
		}
		boolean result = isPallindrome(left, right.next);
		if (result == true) {
			if (left.node.data != right.data) {
				return false;
			} else {
				left.node = left.node.next;
				return true;
			}
		} else {
			return false;
		}
		// return result;
	}

	public void fold() {
		heapmover left = new heapmover();
		left.node = this.head;
		fold(left, this.head, 0);
	}

	private void fold(heapmover left, Node right, int floor) {

		if (right == null) {
			return;
		}

		fold(left, right.next, floor + 1);
		if (floor > size / 2) {
			Node ab = left.node.next;
			left.node.next = right;
			right.next = ab;
			left.node = ab;
		}
		if (floor == size / 2) {
			this.tail = right;
			this.tail.next = null;
		}
	}

	//
	public int kthfromLast(int k) {
		Node slow = this.head;
		Node fast = this.head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	//
	public int midelement() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	// 
	public void removeDuplicate() throws Exception {
		Node slow = this.head;
		Node fast = slow.next;
	
		int i = 0;
		while (fast != null) {
			if (slow.data == fast.data) {
				removeAt(i);
				i-- ;
			}
			i++;
			slow = fast;
			fast = fast.next;
			
		}
		slow.next = null;
	}

	//
	public linkedlist mergetwosortedList(linkedlist other) {
		Node thistemp = this.head;
		Node othertemp = other.head;
		linkedlist merged = new linkedlist();

		while (thistemp != null && othertemp != null) {
			if (thistemp.data < othertemp.data) {
				merged.AddLast(thistemp.data);
				thistemp = thistemp.next;
			} else {
				merged.AddLast(othertemp.data);
				othertemp = othertemp.next;
			}
		}
		while (thistemp != null) {
			merged.AddLast(thistemp.data);
			thistemp = thistemp.next;
		}
		while (othertemp != null) {
			merged.AddLast(othertemp.data);
			othertemp = othertemp.next;
		}
		return merged;
	}

	//
	private Node midnode() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	//
	public linkedlist mergesort() {
		if (this.size == 1) {
			return this;
		}
		linkedlist merged = new linkedlist();
		Node mid = this.midnode();
		Node midnext = mid.next;
		linkedlist l1 = new linkedlist();
		l1.head = this.head;
		l1.tail = mid;
		l1.tail.next = null;
		l1.size = (this.size + 1) / 2;

		linkedlist l2 = new linkedlist();
		l2.head = midnext;
		l2.tail = this.tail;
		l2.size = this.size / 2;
		l2.tail.next = null;
		l1 = l1.mergesort();
		l2 = l2.mergesort();
		merged = l1.mergetwosortedList(l2);
		return merged;
	}

	//
	public void kreverse(int k) throws Exception {
		linkedlist prev = null;
		linkedlist curr = new linkedlist();
		while (!this.isempty()) {
			for (int i = 0; i < k; i++) {
				curr.AddFirst(this.removeFirst());
			}
			if (prev == null) {
				prev = curr;
			} else {
				prev.tail.next = curr.head;
				prev.tail = curr.tail;
				prev.size += curr.size;
			}
			curr = new linkedlist();
		}
		this.head = prev.head;
		this.tail = prev.tail;
		this.size = prev.size;
	}

	//
	public void swaptwoelements(int i, int j) throws Exception {
		Node ab = getnodeAt(i);
		Node ab1 = getnodeAt(j);
		int temp = ab.data;
		ab.data = ab1.data;
		ab1.data = temp;
	}

	//
	public linkedlist oddeven() throws Exception {
		linkedlist odd = new linkedlist();
		linkedlist even = new linkedlist();
		while (!isempty()) {
			int d = this.removeFirst();
			if (d % 2 == 0) {
				even.AddLast(d);
			} else {
				odd.AddLast(d);
			}
		}
		odd.tail.next = even.head;
		return odd;
	}

	// 
	public void bubblesort() throws Exception {
		
		int counter = 0 ;
		while( counter < this.size - 1)	{
			for (int j = 0; j < this.size - 1 - counter; j++) {
				Node ab = getnodeAt(j);
				Node ab1 = getnodeAt(j + 1);

				if (ab.data > ab1.data) {
					int a = ab.data;
					ab.data = ab1.data;
					ab1.data = a;
					// Node ab2=ab;
					// ab=ab1;
					// ab1=ab2;
				}
				//this.display();
				// else
				// {
				// ab=ab.next;
				// ab1=ab1.next;
				// }
				
			}
			counter ++ ;
		}
	}

	//
	public void selectionsort() throws Exception {
		int temp1 = 1;
		while(temp1<=this.size)
		{
//			Node ab = getnodeAt(temp1);
		   for (int i = temp1; i <= this.size-1; i++) {	
		    Node ab = getnodeAt(temp1-1);
			Node ab1 = getnodeAt(i);
			if (ab.data > ab1.data) {
				int a = ab.data;
				ab.data = ab1.data;
				ab1.data = a;
				// Node ab2=ab;
				// ab=ab1;
				// ab1=ab2;
			}
			this.display();
			// else
			// {
			// ab=ab.next;
			// ab1=ab1.next;
			// }
		   }
			temp1++;
		}
	}

	//
	private class heapmover {
		Node node;
	}

	//
	public void display() {
		Node temp = this.head;
		System.out.println("...........................");
		while (temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println(".............................");
	}
	
	public void insertionsort(){
		insertionsort(this.head , new HeapMoverInsertionSort()) ;
	}
	
	private void insertionsort(Node node, HeapMoverInsertionSort hm){
		
		Node current = node ;
		
		while(current != null){
			Node nn = current.next ;
			ILL(current , hm) ;
			current = nn ;			
		}
		
		this.head = hm.sorted ;
	}
	
	private void ILL(Node node, HeapMoverInsertionSort hm){
		
		if(hm.sorted == null || node.data < hm.sorted.data){
			node.next = hm.sorted ;
			hm.sorted = node ;
		}
	
		else{
			Node pn = hm.sorted ;
			while(pn.next != null && node.data > pn.next.data){
				pn= pn.next ;
			}
			node.next = pn.next ;
			pn.next = node ;
		}
	}
	class HeapMoverInsertionSort{
		Node sorted ;
	}
	
	public void hasCycle()
	{
		boolean ab=hasCycle(this.head);
		System.out.println(ab);
	}
	
	private boolean hasCycle(Node head) {
	       Node slow=head;
	       Node fast=head;
	       while(fast!=null)
	       {
	           slow=slow.next;
	           fast=fast.next.next;
	       if(fast==slow)
	       {
	           return true;
	       }
	       }
	       return false;
	 }
}
