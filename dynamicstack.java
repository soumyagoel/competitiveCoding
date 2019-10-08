package july12;

public class dynamicstack extends constructor
{
	@Override            //	spell checker of function
	public void push(int item) throws Exception
	{
	if(this.tos==this.data.length-1)
	{
		int[] oa=this.data;
		this.data = new int[2*oa.length];
		for(int i=0;i<oa.length;i++)
		{
			this.data[i]=oa[i];
		}
	}
      super.push(item);
	}	
}
