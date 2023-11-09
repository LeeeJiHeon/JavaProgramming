package week_11;

public class MaxFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int max;

	public MaxFoundException(int max) {
		this.max = max;
	}
	
	public String toString() {
		return "max = " + max;
	}
}