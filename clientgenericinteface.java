
public class clientgenericinteface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr={55,11,33,44,22};
		Student[] stu=new Student[5];
		stu[0]=new Student("bng",42,5);
		stu[1]=new Student("def",100,1);
		stu[2]=new Student("bcd",50,7);
		stu[3]=new Student("wrg",55,9);
		stu[4]=new Student("abc",60,3);
		bubblesort(stu);
		display(stu);
//		Integer[] arr={55,11,33,44,22};
//		display(arr);
//		bubblesort(arr);
//		display(arr);
	}
	
	public static <T> void display(T[] arr)
	{
		for(T val:arr)
		{
			System.out.println(val+" ");
		}
		System.out.println(" . ");
	}
	
	public static <T extends Comparable<T>> void bubblesort(T[] arr)
	{
		int count=1;
		while(count<arr.length)
		{
			for(int i=0;i<arr.length-count;i++)
			{
			     if(((arr[i]).compareTo(arr[i+1]))>0)
			     {
			    	 T temp=arr[i];
			    	 arr[i]=arr[i+1];
			    	 arr[i+1]=temp;
			     }
			}
			count++;
		}
	}
}
