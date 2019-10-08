
public class Stackclient
{
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		constructor ab=new constructor(10);
		constructor ab=new dynamicstack();
		ab.push(10);
		ab.push(20);
		ab.push(30);
		ab.push(40);
//		ab.display();
		ab.push(50);
		ab.display();
		ab.pop();
//		ab.display();
		ab.pop();
		ab.pop();
		ab.pop();
		
		System.out.println(ab.top());
		System.out.println(ab.size());
		System.out.println(ab.isempty());
	}

}
