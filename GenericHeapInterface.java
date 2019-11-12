package july31;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class GenericHeapInterface<T> {
	private ArrayList<T> data = new ArrayList<T>();
	private Comparator<T> ctor;
     private HashMap<T,Integer> idxMap=new HashMap<T,Integer>();
	public GenericHeapInterface(Comparator<T> ctor) {
		this.ctor = ctor;
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
	public void add(T value) {
		data.add(value);
		this.idxMap.put(value,data.size()-1);
		upheapify(data.size() - 1);
	}

	private void upheapify(int ci) {
		if (ci == 0) {
			return;
		}
		int pi = (ci - 1) / 2;
		if (islarger(ci, pi) == true) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

  	// log n
	public T removeHP() {
		swap(0, data.size() - 1);
		
		T rv = data.remove(data.size() - 1);
		idxMap.remove(rv);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int maxi = pi;
		if (lci < data.size() && islarger(lci, maxi)) {
			//swap(lci, maxi);
			maxi = lci ;
		}
		if (rci < data.size() && islarger(rci, maxi)) {
	//		swap(rci, maxi);
			maxi = rci ;
		}
		if (maxi != pi) {
			swap(pi,maxi);
			downheapify(maxi);
		}
	}

	// o1
	public T getHP() {
		return data.get(0);
	}

	private void swap(int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);
		idxMap.put(ith,j);//putting index in front of value
		idxMap.put(jth,i);//putting index in front of value
	}

	private boolean islarger(int i, int j) {
 		T ith = data.get(i);
		T jth = data.get(j);
//        if(ctor.compare(ith, jth)>0)
//        {
//        	return true;
//        }
//        else
//        {
//        	return false;
//        }
		return (ctor.compare(ith,jth)>0);

	}

	public void updatePriority(T item)
	{
		int idx=idxMap.get(item);
		upheapify(idx);
		downheapify(idx);
	}

}
