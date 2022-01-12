package psa.naloga5;

public class Prim {
	int[][] data;
	int n;

	public Prim(int n) {
		data = new int[n][n];
		this.n = n;
	}

	public Prim(int[][] d) {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}

	public void addEdge(int i, int j, int d) {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}

	public int MSTcost() {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}

	public int[] prim(int s) {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}

}
