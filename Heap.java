
import java.util.ArrayList;

public class Heap { 
	private ArrayList<Integer> data = new ArrayList<Integer>();
	private boolean ismin;

	public Heap(boolean ismin) {
		this.ismin = ismin;
	}

	public int size() {
		return data.size();
	}

	public boolean isEmpty() {
		return data.size() == 0;
	}
                
	public void display() {
		System.out.println(data);
	}
	
	// log n
	public void add(int value) {
		data.add(value);
		upheapify(data.size() - 1);
	}

	private void upheapify(int ci) {
		if (ci == 0) {
			return;
		}
		int pi = (ci - 1) /2;
		if (islarger(ci, pi) == true) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

  	// log n
	public int removeHP() {
		swap(0, data.size() - 1);
		
		int rv = data.remove(data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int maxi = pi;
		if (lci < data.size() && islarger(lci, maxi)) {
//			swap(lci, maxi);
			maxi = lci ;
		}
		if (rci < data.size() && islarger(rci, maxi)) {
//			swap(rci, maxi);
			maxi = rci ;
		}
		if (maxi != pi) {
			swap(pi,maxi);
			downheapify(maxi);
		}
	}

	// o1
	public int getHP() {
		return data.get(0);
	}

	private void swap(int i, int j) {
		int ith = data.get(i);
		int jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);
	}

	private boolean islarger(int i, int j) {
		int ith = data.get(i);
		int jth = data.get(j);
		if (ismin) {
			if (ith < jth) {
				return true;
			} else {
				return false;
			}
		} else {
			if (ith > jth) {
				return true;
			} else {
				return false;
			}
		}
	}
                                                                                                     
	public Heap(boolean ismin,int[] ab) {
           this.ismin=ismin;
           for(int i=0;i<ab.length;i++)
           {
        	  data.add(ab[i]);
           }
           for(int i=data.size()/2-1;i>=0;i--)
           {
        	   downheapify(i);
           }
	}
}
