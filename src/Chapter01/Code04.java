package Chapter01;
import java.util.*;

public class Code04 {

	public static void main(String[] args) {
		String name = null;
		int age;
		String gender;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름, 나이, 성별을 입력하세요 :");
		
		name = sc.next();
		age = sc.nextInt();
		gender = sc.next();
		
		if(gender.equals("남")) {
			System.out.println(name + ", 당신은 " + age + "살의 남자입니다.");
		}
		else if(gender.equals("여")) {
			System.out.println(name + ", 당신은 " + age + "살의 여자입니다.");
		}
		else {
			System.out.println("성별을 (남 혹은 여)로 입력하세요.");
		}
		sc.close();	
	}
}
