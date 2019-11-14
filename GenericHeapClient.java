
import java.util.ArrayList;
import java.util.Comparator;

public class GenericHeapClient  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericHeapInterface<Student> gh=new GenericHeapInterface<Student>(new Student.StudentRankComparator());
		Student[] stu=new Student[5];
		stu[0]=new Student("bng",42,5);
		stu[1]=new Student("def",100,1);
		stu[2]=new Student("bcd",50,7);
		stu[3]=new Student("wrg",55,5);
		stu[4]=new Student("abc",60,3);
		gh.add(stu[0]);
		gh.add(stu[1]);
		gh.add(stu[2]);
		gh.add(stu[3]);
		gh.add(stu[4]);
		gh.display();
		
		System.out.println(gh.removeHP());
		System.out.println(gh.removeHP());
		System.out.println(gh.removeHP());
		System.out.println(gh.removeHP());
		System.out.println(gh.removeHP());
		
	}
//	public static ArrayList<Integer> mergeSortArrayList(ArrayList<ArrayList<Integer>> list)
//	{
//		
//	}

}
