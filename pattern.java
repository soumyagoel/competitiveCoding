
public class pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pat(0,0,6,1);

	}
	public static void pat(int row,int col,int n,int val)
	{
		if(row>n-1)
		{
			return;
		}
		if(col>row)
		{
			System.out.println();
			pat(row+1,0,n,1);
			return;
		}
		System.out.print(val+"\t");
		val=(val*(row-col))/(col+1);
			pat(row,col+1,n,val);
		}
		
	}


