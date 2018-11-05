package buildUp;

public class Iteratorius implements IteratorLauncher {

	private int[] ints;
	private int position;
	
	public Iteratorius(int[] ints) {
		this.ints = ints;	
	}
	public boolean hasNext() {
		return ints.length > position;
	}
	public int next() {
		int result = ints[position];
		position++;
		return result;
	}
}