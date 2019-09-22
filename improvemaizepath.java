package july5;

public class improvemaizepath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=cmp(0,0,16,16,new int[17][17]);
		System.out.println(a);
	}
	public static int cmp(int cr,int cc,int er,int ec,int[][] strg)
	{
		if(cr==er &&cc==ec)
		{
			return 1;
		}
		if(cr>er||cc>ec)
		{
			return 0;
		}
		if(strg[cr][cc]!=0)
		{
			return strg[cr][cc];
		}
		int ch=cmp(cr,cc+1,er,ec,strg);
		int cv=cmp(cr+1,cc,er,ec,strg);
		int count=ch+cv;
		strg[cr][cc]=count;
		return count;
	}
}
