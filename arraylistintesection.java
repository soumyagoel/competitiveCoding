
import java.util.ArrayList;

public class arraylistintesection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] one={1,1,2,2,2,3,5};
		Integer[] two={1,1,1,2,2,4,5};
		ArrayList<Integer> inter =getintersec(one,two);
		System.out.println(inter);

	}
	public static ArrayList<Integer> getintersec(Integer[] one,Integer[] two)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		int i=0;
		int j=0;
		while(i<one.length&&j<two.length)
		{
				if(one[i]==two[j])
				{
					list.add(one[i]);
					j++;
					i++;
				}
				else if(two[j]<one[i])
				{
					j++;
				}
				else
				{
					i++;
				}
			
		}
		return list;
	}
}
