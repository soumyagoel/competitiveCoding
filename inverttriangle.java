package june21;
public class inverttriangle 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int row=1;
		int col=1;
		int n=5;
		intriangle(row,col,n);
		in1triangle(row,col,n);
	}
	public static void intriangle(int row,int col,int n)
	{
		if(row>n)
		{
			return;
		}
		if(col>row)
		{
			System.out.println();
			intriangle(row+1,1,n);
			return;
		}
		System.out.print("*");
		intriangle(row,col+1,n);
	}
	public static void in1triangle(int row,int col,int n)
	{
		if(row>n)
		{
			return;
		}
		if(col>row)
		{
			in1triangle(row+1,1,n);
			System.out.println();
			return;
		}		
		in1triangle(row,col+1,n);
		System.out.print("*");
	}
}
