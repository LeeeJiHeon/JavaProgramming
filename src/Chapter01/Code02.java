package Chapter01;
import java.util.*;

public class Code02 {

		public static void main(String[] args) {
			
			int number = 123;
				
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("숫자를 입력하세요 : " );
			
			int input = keyboard.nextInt();
				
			if(input == number) {
				System.out.println("Numbers match! :-)");
			}
			else {
				System.out.println("Numbers do not match! :-(");
			}
			keyboard.close();
		}
}
