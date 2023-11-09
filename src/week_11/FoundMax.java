package week_11;

public class FoundMax {
	int max;

	public FoundMax(int x, int y) throws MaxFoundException {
		if (x > y) 
		{
		    max = x;
		} 
		else {
		    max = y;
		}
		throw new MaxFoundException(max);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new FoundMax(30, 40);
		} catch (MaxFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("I got it. max = " + e.max);
		}

	}
}
