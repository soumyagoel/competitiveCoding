package aug2;

public class HuffClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HuffManEncoder hme=new HuffManEncoder("aaaabbcd");
		System.out.println(hme.encode("abcd"));		
		System.out.println(hme.decode("010111110"));
	}
}
