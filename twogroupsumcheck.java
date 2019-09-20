
public class twogroupsumcheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30};
		sumg(arr,0,"","",0,0);

	}
	public static void sumg(int[] arr1,int vidx,String g1,String g2,int cg1,int cg2)
	{
//		int n=arr1.length;
//		int[] ar1=new int[n];
//		int[] ar2=new int[n];
		if(vidx==arr1.length)
		{
			if(cg1==cg2)
			System.out.println(g1+"and"+g2);
			return;
		}
		 sumg(arr1,vidx+1,g1+arr1[vidx]+" ",g2,cg1+arr1[vidx],cg2);
		 sumg(arr1,vidx+1,g1,g2+arr1[vidx]+" ",cg1,cg2+arr1[vidx]);
		
	}

}
