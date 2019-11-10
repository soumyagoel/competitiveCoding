
import java.util.Comparator;

public class Student implements Comparable<Student> {

	private String name;
	private int marks;
	private int rank;
	
	/**
	 * @param args
	 */
	public Student(String name,int marks,int rank)
	{
		this.name=name;
		this.marks=marks;
		this.rank=rank;
	}

	@Override
	public int compareTo(Student o)
	{
		return this.marks-o.marks;
//		return o.rank-this.rank;
	}
	
	@Override
	public String toString()
	{
	      return name+"=="+marks+"=="+rank;
	}

	
	static class StudentMarksComparator implements Comparator<Student>
	{
		@Override
		public int compare(Student o1,Student o2)
		{
		return o1.marks-o2.marks;
		}
	}
	
	static class StudentRankComparator implements Comparator<Student>
	{
		@Override
		public int compare(Student o1,Student o2)
		{
			return o2.rank-o1.rank;		
		}
	}
	
	static class StudentNameComparator implements Comparator<Student>
	{
		@Override
		public int compare(Student o1,Student o2)
		{
			return o2.name.compareTo(o1.name);		
		}
	}
}
