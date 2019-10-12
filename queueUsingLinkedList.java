
public class queueUsingLinkedList {
	linkedlist l1=new linkedlist();
	public void enqueue(int value)
	{
		l1.AddLast(value);
	}
	public int dequeue()
	{
		try
		{
			return l1.removeFirst();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.hashCode();
		}
	}
	public int front()
	{
		try {
			return l1.getfirst();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.hashCode();
		}
	}
	public void display()
	{
		l1.display();
	}

}
