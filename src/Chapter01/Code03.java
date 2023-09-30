package Chapter01;
import java.util.*;

public class Code03 {
	
	public static void main(String[] args) {
		String str = "Hello";
		String input = null;	// ¾ø¾îµµ µÊ
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please type a string : ");
		input = sc.next();	// scanf("%d", &input)
		
		if(str.equals(input)) {	// input.equals(str)
			System.out.println("String match! :-)");
		}
		else {
			System.out.println("String do not match! :-(");
		}
		sc.close();
	}
}
