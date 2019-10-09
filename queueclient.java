
public class queueclient {

	public static void main(String[] args)throws Exception {
		queue qe= new dynamicqueue();
//		queue qe=new queue();
		qe.enqueue(10);
		qe.display();
		qe.enqueue(20);
		qe.display();
		qe.enqueue(30);
		qe.display();
		qe.enqueue(40);
		qe.display();
		System.out.println(qe.dequeue());
		qe.display();
		System.out.println(qe.dequeue());
		qe.display();
		qe.enqueue(60);
		qe.display();
		qe.enqueue(70);
		qe.display();		
		System.out.println(qe.dequeue());
        qe.display();
	}
}
