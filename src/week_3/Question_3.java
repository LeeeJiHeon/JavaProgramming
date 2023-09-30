package week_3;
import java.util.*;

/*문제3.유권자 수와 투표자 수를 입력 받아 투표율이 50% 이상인 경우 “유효 투표입니다”를 출력하는 프로그램을 작성하시오.*/
public class Question_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		// 입력 받기 위한 Scanner 객체 생성
		
		System.out.print("유권자 수를 입력하세요 : ");
		int voter = sc.nextInt();
		System.out.print("투표자 수를 입력하세요 : ");
		int voted = sc.nextInt();
		
		double turnout = ((double) voted / voter) * 100;	// 투표율
		
		if(turnout >= 50)	// 조건식
		{
			System.out.print("유효 투표입니다.");
		}
		else
		{
			System.out.print("무효 투표입니다.");
		}
		
	}

}
