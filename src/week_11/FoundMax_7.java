package week_11;

public class FoundMax_7 {
	int max;

	public FoundMax_7(int x, int y) throws MaxFoundException {
		if (x > y) 
		{
		    max = x;
		} 
		else {
		    max = y;
		}
	}
	 public int getMax() {
	        return max;
    }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
            FoundMax_7 foundMax = new FoundMax_7(30, 40);
            int max = foundMax.getMax();
            if (max > 0) {
                throw new MaxFoundException(max);
            } else {
                System.out.println("No exception thrown. Max value is: " + max);
            }
        } catch (MaxFoundException e) {
            System.out.println("I got it. " + e.toString());
        }
	}
}

