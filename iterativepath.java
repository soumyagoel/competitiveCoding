
public class iterativepath {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // TODO Auto-generated method stub
//		 int a = iterationbp(0, 10, new int[16]);
		// System.out.println(a);
		// int b=slidingwindow(10);
		// System.out.println(b);
		int c = slidingwindow1(10);
		System.out.println(c);
	}
     
	public static int iterationbp(int curr, int end, int[] strg) {
		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			for (int dice = 1; dice <= 6; dice++) {
				strg[i] += strg[i + dice];
			}
		}
		return strg[0];
	}
	public static int slidingwindow(int n) {
		int[] strg = new int[6];
		strg[0] = 1;
		for (int i = n - 1; i >= 0; i--) {
			int nv = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];
			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = nv;
		}
		return strg[0];
	}
	public static int slidingwindow1(int n) {
		int[] strg = new int[6];
		strg[0] = 1;
		for (int i = n - 1; i >= 0; i--){
			int nv = strg[0];
			for (int j = 5; j > 0; j--) {				
				nv += strg[j];
				strg[j] = strg[j - 1];
			}
			strg[0] = nv;
		}
		return strg[0];
	}
}
