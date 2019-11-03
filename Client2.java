
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={700,200,100,500,300,600,400};
//		int[] arr={10,20,30,40,50,60,70};
//		int[] arr={70,60,50,40,30,20,10};
		Heap ranklist=new Heap(true,arr);
//		ranklist.add(700);
//		ranklist.add(200);
//		ranklist.add(100);
//		ranklist.add(500);
//		ranklist.add(300);
//		ranklist.add(600);
//		ranklist.add(400);
		ranklist.display();
//		System.out.println(ranklist.getHP());
//		while(!ranklist.isEmpty())
//		{
//			System.out.println(ranklist.removeHP());
//		}
//		ranklist.display();

	}

}
