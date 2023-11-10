package week_11;

public class FoundMax_6 {
    int max;

    public FoundMax_6(int x, int y) throws MaxFoundException {
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        throw new MaxFoundException(max);
    }

    public static void main(String[] args) {
        try {
            new FoundMax_6(30, 40);
        } catch (MaxFoundException e) {
            System.out.println("I got it. max = " + e.max);
        }
    }
}