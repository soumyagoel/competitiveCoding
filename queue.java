
public class queue {
	protected int[] data;
	protected int front;
	protected int tail;
	protected int size;
	queue()
	{
		this(5);
	}
	queue(int cap)
	{
		this.data=new int[cap];
	}
	public void enqueue(int value) throws Exception
	{
		if(this.size==this.data.length)
		{
			throw new Exception("Queue is full");
		}
		this.tail=(this.front+this.size)%(this.data.length);
		this.data[this.tail]=value;
		this.size++;
	}
	public int dequeue() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("Queue is empty");
		}
		int rv=this.data[this.front];
		this.data[this.front]=0;
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return rv;
	}
	public int front() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("Stack is empty");
		}
		int rv=this.data[this.front];
		return rv;
	}
    public int size()
    {
    	return this.size;
    }
    public boolean isempty()
    {
    	return this.size==0;
    }
    public void display()
    {
    	System.out.println(".......................");
    	for(int i=0;i<this.size;i++)
    	{
//    		System.out.print(this.data[(i)%this.data.length]+"  ");
    		System.out.print(this.data[(this.front+i)%this.data.length]+"  ");
    	}
    	System.out.println();
    	System.out.println(".....................");
    }
}
