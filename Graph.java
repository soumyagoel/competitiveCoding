package aug2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Graph {
	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<String, Integer>();
	}

	private HashMap<String, Vertex> vces = new HashMap<String, Vertex>();

	public int numVertices() {
		return vces.size();
	}

	public boolean containsVertex(String vname) {
		return vces.containsKey(vname);
	}

	public void addVertex(String vname) {
		if (vces.containsKey(vname)) {
			return;
		} else {
			Vertex vtx = new Vertex();
			vces.put(vname, vtx);
		}
	}

	public void removeVertex(String vname) {
		Vertex vtx1 = vces.get(vname);
		if (vtx1 == null) {
			return;
		}
		Set<String> vcesnames = vces.get(vname).nbrs.keySet();
		for (String vcesname : vcesnames) {
			Vertex vtx = vces.get(vcesname);
			vtx.nbrs.remove(vname);
		}
		vces.remove(vname);
	}

	public int numEdges() {
		int rv = 0;
		Set<String> num = vces.keySet();
		for (String name : num) {
			Vertex vtx = vces.get(name);
			rv += vtx.nbrs.size();
		}
		return rv / 2;
	}

	public boolean containsEdges(String one, String two) {
		Vertex vtx1 = vces.get(one);
		Vertex vtx2 = vces.get(two);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(two)) {
			return false;
		}
		return true;
	}

	public void addEdge(String v1name, String v2name, int weight) {
		Vertex vtx1 = vces.get(v1name);
		Vertex vtx2 = vces.get(v2name);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(v2name)) {
			return;
		}
		vtx1.nbrs.put(v2name, weight);
		vtx2.nbrs.put(v1name, weight);
	}

	public void removeEdge(String v1name, String v2name) {
		Vertex vtx1 = vces.get(v1name);
		Vertex vtx2 = vces.get(v2name);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(v2name)) {
			return;
		}
		vtx1.nbrs.remove(v2name);
		vtx2.nbrs.remove(v1name);
	}

	public void display() {
		Set<String> vcesnames = vces.keySet();

		// ArrayList<String> vcesnames = new ArrayList<String>(vces.keySet()) ;
		// Collections.sort(vcesnames) ;
		for (String vcesname : vcesnames) {
			Vertex vtx = vces.get(vcesname);
			String str = vcesname + ": ";
			Set<String> vtxnbrs = vtx.nbrs.keySet();

			// ArrayList<String> vtxnbrs = new
			// ArrayList<String>(vtx.nbrs.keySet()) ;
			// Collections.sort(vtxnbrs) ;

			for (String vtxnbr : vtxnbrs) {
				str += "[" + vtxnbr + "@" + vtx.nbrs.get(vtxnbr) + "]";
			}

			System.out.println(str);
		}
	}

	public boolean hasPath(String v1name, String v2name,
			HashMap<String, Boolean> processed, String psf) {
		processed.put(v1name, true);
		psf += v1name + "==>";

		if (containsEdges(v1name, v2name)) {
			System.out.println(psf + v2name);
			return true;
		}

		Vertex vtx = vces.get(v1name);
		Set<String> vnames = vtx.nbrs.keySet();
		for (String vname : vnames) {
			if (!processed.containsKey(vname)) {
				if (this.hasPath(vname, v2name, processed, psf) == true) {
					return true;
				}
			}
		}
		return false;
	}

	public void printAllPaths(String v1name, String v2name,
			HashMap<String, Boolean> processed, String psf) {
		processed.put(v1name, true);
		psf += v1name + "==>";

		if (v1name.equals(v2name)) {
			System.out.println(psf);
			processed.remove(v1name);
			return;
		}

		Vertex vtx = vces.get(v1name);
		Set<String> vnames = vtx.nbrs.keySet();
		for (String vname : vnames) {
			if (!processed.containsKey(vname)) {
				this.printAllPaths(vname, v2name, processed, psf);
			}
		}
		processed.remove(v1name);
	}

	private class Pair {
		String vname;
		Vertex vtx;
		String psf;
		String color;

		public Pair(String vname, Vertex vtx, String psf, String color) {
			this.vname = vname;
			this.vtx = vtx;
			this.psf = psf;
			this.color = color;
		}

		public Pair(String vname, Vertex vtx, String psf) {
			this.vname = vname;
			this.vtx = vtx;
			this.psf = psf;
		}
	}

	public boolean bfs(String v1name, String v2name) {
		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> queue = new LinkedList<Pair>();
		Vertex vtx1 = vces.get(v1name);
		Pair p = new Pair(v1name, vtx1, v1name);
		queue.addLast(p);
		while (!queue.isEmpty()) {
			// 1.remove
			Pair rp = queue.removeFirst();
			// 2.process if unprocessed
			if (!processed.containsKey(rp.vname)) {
				// 2.0mark processed
				processed.put(rp.vname, true);
				// 2.1check the nbrs
				if (containsEdges(rp.vname, v2name)) {
					System.out.println(rp.psf + v2name);
					return true;
				}

				// 2.2put the unprocessed nbrs in
				// Set<String> rpnbrsnames = rp.vtx.nbrs.keySet();
				ArrayList<String> rpnbrsnames = new ArrayList<String>(
						rp.vtx.nbrs.keySet());
				Collections.sort(rpnbrsnames);
				for (String rpnbrsname : rpnbrsnames) {
					if (!processed.containsKey(rpnbrsname)) {
						Vertex nv = vces.get(rpnbrsname);
						Pair np = new Pair(rpnbrsname, nv, rp.psf + rpnbrsname);
						queue.addLast(np);
					}
				}
			}
		}
		return false;
	}

	public boolean dfs(String v1name, String v2name) {
		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> stack = new LinkedList<Pair>();
		Vertex vtx1 = vces.get(v1name);
		Pair p = new Pair(v1name, vtx1, v1name);
		stack.addFirst(p);

		while (!stack.isEmpty()) {
			// 1.remove
			Pair rp = stack.removeFirst();
			// 2.process if unprocessed
			if (!processed.containsKey(rp.vname)) {
				// 2.0mark processed
				processed.put(rp.vname, true);
				// 2.1check the nbrs
				if (containsEdges(rp.vname, v2name)) {
					System.out.println(rp.psf + v2name);
					return true;
				}

				// 2.2put the unprocessed nbrs in
				// Set<String> rpnbrsnames = rp.vtx.nbrs.keySet();

				ArrayList<String> rpnbrsnames = new ArrayList<String>(
						rp.vtx.nbrs.keySet());
				Collections.sort(rpnbrsnames);

				for (String rpnbrsname : rpnbrsnames) {
					if (!processed.containsKey(rpnbrsname)) {
						Vertex nv = vces.get(rpnbrsname);
						Pair np = new Pair(rpnbrsname, nv, rp.psf + rpnbrsname);
						stack.addFirst(np);
					}
				}
			}
		}
		return false;
	}

	public void bft() {
		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> queue = new LinkedList<Pair>();

		ArrayList<String> vnames = new ArrayList<String>(vces.keySet());
		Collections.sort(vnames);

		for (String vname : vnames) {

			if (processed.containsKey(vname)) {
				continue;
			}

			Vertex vtx1 = vces.get(vname);
			Pair p = new Pair(vname, vtx1, vname);
			queue.addLast(p);
			while (!queue.isEmpty()) {
				// 1.remove
				Pair rp = queue.removeFirst();
				// 2.process if unprocessed
				if (!processed.containsKey(rp.vname)) {
					// 2.0mark processed
					processed.put(rp.vname, true);

					// 2.1check the nbrs
					System.out.println(rp.vname + " via " + rp.psf);

					// 2.2put the unprocessed nbrs in
					// Set<String> rpnbrsnames = rp.vtx.nbrs.keySet();

					ArrayList<String> rpnbrsnames = new ArrayList<String>(
							rp.vtx.nbrs.keySet());
					Collections.sort(rpnbrsnames);

					for (String rpnbrsname : rpnbrsnames) {
						if (!processed.containsKey(rpnbrsname)) {
							Vertex nv = vces.get(rpnbrsname);
							Pair np = new Pair(rpnbrsname, nv, rp.psf
									+ rpnbrsname);
							queue.addLast(np);
						}
					}
				}
			}

		}

	}

	public void dft() {
		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> stack = new LinkedList<Pair>();

		ArrayList<String> vnames = new ArrayList<String>(vces.keySet());
		Collections.sort(vnames);

		for (String vname : vnames) {

			if (processed.containsKey(vname)) {
				continue;
			}

			Vertex vtx1 = vces.get(vname);
			Pair p = new Pair(vname, vtx1, vname);
			stack.addFirst(p);
			while (!stack.isEmpty()) {
				// 1.remove
				Pair rp = stack.removeFirst();
				// 2.process if unprocessed
				if (!processed.containsKey(rp.vname)) {
					// 2.0mark processed
					processed.put(rp.vname, true);

					// 2.1check the nbrs
					System.out.println(rp.vname + " via " + rp.psf);

					// 2.2put the unprocessed nbrs in
					// Set<String> rpnbrsnames = rp.vtx.nbrs.keySet();

					ArrayList<String> rpnbrsnames = new ArrayList<String>(
							rp.vtx.nbrs.keySet());
					Collections.sort(rpnbrsnames);

					for (String rpnbrsname : rpnbrsnames) {
						if (!processed.containsKey(rpnbrsname)) {
							Vertex nv = vces.get(rpnbrsname);
							Pair np = new Pair(rpnbrsname, nv, rp.psf
									+ rpnbrsname);
							stack.addFirst(np);
						}
					}
				}
			}

		}

	}

	public ArrayList<ArrayList<String>> getConnectedComponents() {

		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> queue = new LinkedList<Pair>();

		ArrayList<String> vnames = new ArrayList<String>(vces.keySet());
		Collections.sort(vnames);

		for (String vname : vnames) {

			if (processed.containsKey(vname)) {
				continue;
			}

			ArrayList<String> tal = new ArrayList<String>();

			Vertex vtx1 = vces.get(vname);
			Pair p = new Pair(vname, vtx1, vname);
			queue.addLast(p);
			while (!queue.isEmpty()) {
				// 1.remove
				Pair rp = queue.removeFirst();
				// 2.process if unprocessed
				if (!processed.containsKey(rp.vname)) {
					// 2.0mark processed
					processed.put(rp.vname, true);

					tal.add(rp.vname);
					// 2.1check the nbrs

					// 2.2put the unprocessed nbrs in
					// Set<String> rpnbrsnames = rp.vtx.nbrs.keySet();

					ArrayList<String> rpnbrsnames = new ArrayList<String>(
							rp.vtx.nbrs.keySet());
					Collections.sort(rpnbrsnames);

					for (String rpnbrsname : rpnbrsnames) {
						if (!processed.containsKey(rpnbrsname)) {
							Vertex nv = vces.get(rpnbrsname);
							Pair np = new Pair(rpnbrsname, nv, rp.psf
									+ rpnbrsname);
							queue.addLast(np);
						}
					}
				}
			}
			list.add(tal);
		}
		return list;
	}

	public boolean isConnected() {
		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> queue = new LinkedList<Pair>();

		ArrayList<String> vnames = new ArrayList<String>(vces.keySet());
		Collections.sort(vnames);
		Vertex vtx1 = vces.get(vnames.get(0));
		Pair p = new Pair(vnames.get(0), vtx1, vnames.get(0));
		queue.addLast(p);
		while (!queue.isEmpty()) {
			// 1.remove
			Pair rp = queue.removeFirst();
			// 2.process if unprocessed
			if (!processed.containsKey(rp.vname)) {
				// 2.0mark processed
				processed.put(rp.vname, true);

				// 2.1check the nbrs
				// System.out.println(rp.vname + " via " + rp.psf);

				// 2.2put the unprocessed nbrs in
				// Set<String> rpnbrsnames = rp.vtx.nbrs.keySet();

				ArrayList<String> rpnbrsnames = new ArrayList<String>(
						rp.vtx.nbrs.keySet());
				Collections.sort(rpnbrsnames);

				for (String rpnbrsname : rpnbrsnames) {
					if (!processed.containsKey(rpnbrsname)) {
						Vertex nv = vces.get(rpnbrsname);
						Pair np = new Pair(rpnbrsname, nv, rp.psf + rpnbrsname);
						queue.addLast(np);
					}
				}
			}
		}
		if (processed.size() == vces.size()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isCyclic() {
		HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
		LinkedList<Pair> queue = new LinkedList<Pair>();

		ArrayList<String> vnames = new ArrayList<String>(vces.keySet());
		Collections.sort(vnames);

		for (String vname : vnames) {
			if (processed.containsKey(vname)) {
				continue;
			}

			Vertex vtx1 = vces.get(vname);
			Pair p = new Pair(vname, vtx1, vname);
			queue.addLast(p);
			while (!queue.isEmpty()) {
				// 1.remove
				Pair rp = queue.removeFirst();
				// 2.process if unprocessed
				if (!processed.containsKey(rp.vname)) {
					// 2.0mark processed
					processed.put(rp.vname, true);

					// 2.1check the nbrs
					// System.out.println(rp.vname + " via " + rp.psf);

					// 2.2put the unprocessed nbrs in
					// Set<String> rpnbrsnames = rp.vtx.nbrs.keySet();

					ArrayList<String> rpnbrsnames = new ArrayList<String>(
							rp.vtx.nbrs.keySet());
					Collections.sort(rpnbrsnames);

					for (String rpnbrsname : rpnbrsnames) {
						if (!processed.containsKey(rpnbrsname)) {
							Vertex nv = vces.get(rpnbrsname);
							Pair np = new Pair(rpnbrsname, nv, rp.psf
									+ rpnbrsname);
							queue.addLast(np);
						}
					}
				} else {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isTree() {
		return this.isConnected() && !isCyclic();
	}

	public boolean isBiparite() {
		HashMap<String, String> processed = new HashMap<String, String>();
		LinkedList<Pair> queue = new LinkedList<Pair>();
		ArrayList<String> vnames = new ArrayList<String>(vces.keySet());
		Collections.sort(vnames);
		for (String vname : vnames) {
			if (processed.containsKey(vname)) {
				continue;
			}
			Vertex vtx1 = vces.get(vname);
			Pair p = new Pair(vname, vtx1, vname, "r");
			queue.addLast(p);
			while (!queue.isEmpty()) {
				// 1.remove
				Pair rp = queue.removeFirst();
				// 2.process if unprocessed
				if (!processed.containsKey(rp.vname)) {
					// 2.0mark processed
					processed.put(rp.vname, rp.color);
					// 2.1check the nbrs
					System.out.println(rp.vname + " via " + rp.psf);

					// 2.2put the unprocessed nbrs in
					// Set<String> rpnbrsnames = rp.vtx.nbrs.keySet();

					ArrayList<String> rpnbrsnames = new ArrayList<String>(
							rp.vtx.nbrs.keySet());
					Collections.sort(rpnbrsnames);

					for (String rpnbrsname : rpnbrsnames) {
						String colorToApply = rp.color.equals("r") ? "g" : "r";
						if (!processed.containsKey(rpnbrsname)) {
							Vertex nv = vces.get(rpnbrsname);
							Pair np = new Pair(rpnbrsname, nv, rp.psf
									+ rpnbrsname, colorToApply);
							queue.addLast(np);
						}
					}
				} else {
					String prevColor = processed.get(rp.vname);
					String currColor = rp.color;

					if (!prevColor.equals(currColor)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public HashMap<String, DjikstraPair> djikstra(String src) {

		HashMap<String, DjikstraPair> map = new HashMap<String, DjikstraPair>();
		GenericHeapInterface<DjikstraPair> heap = new GenericHeapInterface<DjikstraPair>();
		Set<String> vnames = this.vces.keySet();
		for (String vname : vnames) {
			Vertex vtx = this.vces.get(vname);
			DjikstraPair p = new DjikstraPair(vname, vtx, "", Integer.MAX_VALUE);
			if (src.equals(vname)) {
				p.csf = 0;
				p.psf = vname;
			}
			heap.add(p);
			map.put(vname, p);
			while (!heap.isEmpty()) {
				DjikstraPair rp = heap.removeHP();
				Set<String> nbrnames = rp.vtx.nbrs.keySet();
				for (String nbrname : nbrnames) {
					DjikstraPair np = map.get(nbrname);
					int nc = rp.csf + rp.vtx.nbrs.get(nbrname);
					int oc = np.csf;
					if (nc < oc) {
						np.csf = nc;
						np.psf = rp.psf + nbrname;
						heap.updatePriority(np);
					}
				}
			}
		}
		return map;
	}

	class DjikstraPair implements Comparable<DjikstraPair> {

		String vname;
		Vertex vtx;
		String psf;
		int csf;

		DjikstraPair(String vname, Vertex vtx, String psf, int csf)

		{
			this.vname = vname;
			this.vtx = vtx;
			this.psf = psf;
			this.csf = csf;
		}

		@Override
		public int compareTo(DjikstraPair o) {
			return o.csf - this.csf;
		}

		public String toString() {
			return "[ " + this.vname + " @ " + this.csf + " via " + this.psf
					+ " ]";
		}
	}

}