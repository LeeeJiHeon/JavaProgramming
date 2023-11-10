package week_11;

public class FoundMax_8 {
    int max;

    public FoundMax_8(int x, int y) throws MaxFoundException {
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        throw new MaxFoundException(max);
    }

    public static void main(String[] args) {
    	try {
            FoundMax_8 foundMax = new FoundMax_8(30, 40);
            throw new MaxFoundException(foundMax.max);
        } catch (MaxFoundException e) {
            System.out.println("I got it. max = " + e.max);
        }
    }
}

