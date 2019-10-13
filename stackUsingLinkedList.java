package july18;

public class stackUsingLinkedList {
	linkedlist l3=new linkedlist();
	public void push(int value)
	{
		l3.AddFirst(value);
	}
	public int pop()
	{
		try {
			return l3.removeFirst();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.hashCode();
		}
	}
	public int top()
	{
		try {
			return l3.getfirst();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.hashCode();
		}
	}
	public void display()
	{
		l3.display();
	}

}
