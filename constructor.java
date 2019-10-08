                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
public class constructor {

	protected int[] data;
	protected int tos=-1;
	constructor()
	{
		this(5);
	}
	constructor(int cap)
	{
		this.data = new int[cap];
	}
	public void push(int item) throws Exception
	{
		if(this.tos==this.data.length-1)
		{
			throw new Exception("Stack is full");
		}
		this.tos=this.tos+1;
		this.data[tos]=item;
	}
	public int pop() throws Exception
	{		
		if(this.tos==-1)
		{
			throw new Exception("Stack is empty");
		}
		int v=this.data[this.tos];
		this.data[this.tos]=0;
		this.tos=this.tos-1;
		return v;
	}
	public int top() throws Exception
	{
		if(this.tos==-1)
		{
			throw new Exception("Stack is empty");
		}
		int a=this.data[this.tos];
		return a;
	}
    public int size()
    {
    	int b=this.tos+1;
    	return b;
    }
    public void display()
    {
    	for(int i=this.tos;i>=0;i--)
    	{
    	System.out.println(this.data[i]);
    	}
    }
    public boolean isempty()
    {
    	if(this.tos==-1)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}
