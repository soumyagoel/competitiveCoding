
public class sumarrayrecur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		sum(arr, 0, 60, "");

	}

	public static void sum(int[] arr1, int vidx, int target, String ans) {
		if (vidx == arr1.length) {
			if (target == 0)
				System.out.println(ans);
			return;
		}
		// for(int i=0;i<arr1.length;i++)
		// {
		// for(int j=i+1;j<=arr1.length;i++)
		// {
		// if(arr1[i]+arr1[j]==target)
		// {
		// sum(arr1,vidx+1,target,ans+1);
		// return;
		// }
		// else
		// {
		// sum(arr1,vidx+1,target,ans);
		// // return;
		// }
		// }
		// }
		sum(arr1, vidx + 1, target, ans); // no
		sum(arr1, vidx + 1, target - arr1[vidx], ans + " " + arr1[vidx]); // yes
	}
}
