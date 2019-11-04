
import java.util.ArrayList;
import java.util.HashMap;

public class Trie {
	private class Node {
		Character data;
		boolean eow;
		HashMap<Character, Node> children = new HashMap<Character, Node>();

	}

	private Node root = new Node();
	private int numwords = 0;
	private int numnodes = 1;

	public void addWord(String word) {
		addWord(root, word);
	}

	private void addWord(Node node, String word) {
		if (word.length() == 0) {
			node.eow = true;
			numwords++;
			return;
		}
		char ch = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.children.get(ch);
		if (child == null) {
			numnodes++;
			child = new Node();
			child.data = ch;
			node.children.put(ch, child);
			addWord(child, ros);
		} else {
			addWord(child, ros);
		}
	}

	public boolean search(String word) {
		return search(root, word);
	}

	private boolean search(Node node, String word) {
		if (word.length() == 0) {
			return node.eow;
		}
		char ch = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.children.get(ch);
		if (child == null) {
			return false;
		} else {
			return search(child, ros);
		}
	}

	public void removeWord(String word) {
		removeWord(root, word);
	}

	private void removeWord(Node node, String word) {
		if (word.length() == 0) {
			node.eow = false;
			this.numwords--;
			return;
		}
		char ch = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.children.get(ch);
		if (child == null) {
			return;
		} else {
			
			removeWord(child, ros);
		}

		if (child.eow == false && child.children.size() == 0) {
			node.children.remove(ch);
			this.numnodes--;
		}
		
	}

	public void display() {
		display(root, "");
	}

	private void display(Node node, String osf) {
		if (node.eow) {
			System.out.println(osf);
		}
		ArrayList<Character> keys = new ArrayList<Character>(
				node.children.keySet());
		for (char key : keys) {
			Node child = node.children.get(key);
			display(child, osf + key);
		}
	}
}
