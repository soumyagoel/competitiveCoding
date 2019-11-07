package july30;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Trie tr=new Trie();
		tr.addWord("arc");
		tr.addWord("art");
		tr.addWord("ant");
		tr.addWord("and");
		tr.addWord("bug");
		tr.addWord("bugs");
		tr.addWord("see");
		tr.addWord("sea");
		tr.addWord("seen");
		tr.display();
		System.out.println(tr.search("bug"));
		System.out.println(tr.search("an"));
		tr.removeWord("bug") ;
		System.out.println(tr.search("bug"));
	}
}
