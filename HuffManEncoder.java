package aug2;

import java.util.ArrayList;
import java.util.HashMap;

public class HuffManEncoder {

	private class Node implements Comparable<Node> {
		Character ch;
		int cost;
		Node left;
		Node right;

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return o.cost - this.cost;
		}
	}

	private HashMap<Character, String> encoder = new HashMap<Character, String>();
	private HashMap<String, Character> decoder = new HashMap<String, Character>();

	public HuffManEncoder(String feeder) {
		// 1.freq map
		HashMap<Character, Integer> fmap = new HashMap<Character, Integer>();
		for (int i = 0; i < feeder.length(); i++) {
			char ch = feeder.charAt(i);
			if (fmap.containsKey(ch)) {
				fmap.put(ch, fmap.get(ch) + 1);
			} else {
				fmap.put(ch, 1);
			}
		}
		
		// 2.create nodes for all keys and fill in the heap
		GenericHeapInterface<Node> heap = new GenericHeapInterface<Node>();
		ArrayList<Character> keys = new ArrayList<Character>(fmap.keySet());
		for (Character key : keys) {
			Node node = new Node();
			node.ch = key;
			node.cost = fmap.get(key);
			heap.add(node);
		}

		// 3.till heap size is 1 remove two,merge and put it back
		while (heap.size() != 1) {
			Node one = heap.removeHP();
			Node two = heap.removeHP();
			Node merged = new Node();
			merged.cost = one.cost + two.cost;
			merged.left = one;
			merged.right = two;
			heap.add(merged);
		}

		// 4.get the final node out
		Node finalnode = heap.removeHP();
		fillEncoderDecoder(finalnode , "") ;
	}

	public void fillEncoderDecoder(Node node, String wsf) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			encoder.put(node.ch, wsf);
			decoder.put(wsf, node.ch);
		}
		fillEncoderDecoder(node.left, wsf + "0");
		fillEncoderDecoder(node.right, wsf + "1");
	}

	public String encode(String str) {
		String rv = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String code = encoder.get(ch);
			rv += code;
		}
		return rv;
	}

	public String decode(String str) {
		String rv = "";
		String key = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			key += ch;
			if (decoder.containsKey(key)) {
				rv += decoder.get(key);
				key = "";
			}
		}
		return rv;
	}
}
