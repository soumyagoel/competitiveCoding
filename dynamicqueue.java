package july17;

public class dynamicqueue extends queue
{
	@Override
	public void enqueue(int value) throws Exception
	{
		if(this.size==this.data.length)
		{
			int[] oa=this.data;
			this.data=new int[2*oa.length];
			for(int i=0;i<oa.length;i++)
			{
				this.data[i]=oa[(front+i)%oa.length];
			}
			super.front=0;
		}
		super.enqueue(value);
	}

}
