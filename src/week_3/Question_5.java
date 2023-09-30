package week_3;
import java.util.*;

/* 문제5.한 사람당 8000원인 영화관에서 10명 이상일 경우 10%, 20명 이상일 경우 20%를 할인해 주고 있다.
 사람 수를 입력 받아 지불해야 하는 총 비용을 출력하는 프로그램을 작성하시오.*/
public class Question_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 입력 받기 위한 Scanner 객체 생성
		
		System.out.print("사람 수 : ");
		int person = sc.nextInt();
		
		int money = person * 8000;				// 할인 전, 총 비용
		
		if(person >= 10 && person < 20)			// 10 ~ 19명
		{
			money = (int) (money * 0.9);
			System.out.println("총 비용 (10% 할인 적용): " + money + "원");
		}
		else if(person >= 20)					// 20명 이상
		{
			money = (int) (money * 0.8);
			System.out.println("총 비용 (20% 할인 적용): " + money + "원");
		}
		else // 10명 미만
		{
			System.out.println("총 비용 (0% 할인 적용): " + money + "원");
		}

		
		 
	}

}
