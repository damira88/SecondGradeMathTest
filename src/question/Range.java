/**
 * Generates Range of (min,max) 
 */
package question;

public class Range {
	/**
	 * The purpose of this class to use in project to use numbers in certain range.
		TODO:
		Add 2 encapsulated instance int variables min and max
		Create public getter and setter methods
		Create a constructor with 2 int arguments and assign values to min and max
	 */
	private int min;
	private int max;
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Range(int min, int max) {
		this.min = min;
		this.max = max;
		
	}
	
}
