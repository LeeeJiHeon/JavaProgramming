package week_4;
import java.util.*;

/* 문제7. 첫 번째로 숫자를, 두 번째로 연산자(+, -)를, 세 번째로 숫자를 입력 받아 두 번째로 지정된 연산을 수행하고
 * 그 결과가 0보다 크면 “수식의 결과는 양수입니다”, 0이면 “수식의 결과가 0입니다”, 
 * 0보다 작으면 “수식의 결과가 음수입니다”를 출력하는 프로그램을 작성하시오. */

public class Question_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 사용자의 입력을 받도록 함
		int result = 0;							// 결과값 선언
		
		System.out.print("첫 번째 숫자 입력 : ");	// 첫 번째 숫자를 입력받아 num1에 저장
		int num1 = sc.nextInt();
			
		System.out.print("연산(+, -) 입력 : ");	// 연산자를 입력받아 calculation에 저장
		char calculation = sc.next().charAt(0);
		
		System.out.print("두 번째 숫자 입력 : ");	// 두 번째 숫자를 입력받아 num2에 저장
		int num2 = sc.nextInt();
		
		// 조건문 : 연산자가 (+)일 경우
		if(calculation == '+')	
		{
			result = num1 + num2;
			if(result > 0)
			{
				System.out.print("수식의 결과는 양수(+)입니다.");
			}
			else if(result == 0)
			{
				System.out.print("수식의 결과는 0입니다.");
			}
			else if(result < 0)
			{
				System.out.print("수식의 결과가 음수(-)입니다.");
			}
		}
		
		// 조건문 : 연산자가 (-)일 경우
		else if(calculation == '-')
		{
			result = num1 - num2;
			if(result > 0)
			{
				System.out.print("수식의 결과는 양수(+)입니다.");
			}
			else if(result == 0)
			{
				System.out.print("수식의 결과는 0입니다.");
			}
			else if(result < 0)
			{
				System.out.print("수식의 결과가 음수(-)입니다.");
			}
		}
		
		// (+, -)를 제외한 연산자를 입력한 경우
		else
		{
			System.out.println("연산자를 다시 입력해주세요.");
		}
	}

}
