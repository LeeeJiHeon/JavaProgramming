package week_4;

import java.util.*;
/* 문제 3. 성별이 여자이면서 토익 성적이 700점 이상인 경우 또는 성별이 남자이면서 
 * 토익 성적이 800점 이상인 경우에만 “항공 승무원 지원 자격 가능자입니다”를 출력하는 프로그램을 작성하시오. */
public class Question_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 사용자의 입력을 받도록 함
		
		System.out.print("성별 입력 : ");			// 성별을 입력 받아 gender에 저장
		String gender = sc.nextLine();
		
		System.out.print("토익 성적 입력 : ");		// 토익 성적을 입력 받아 totic_score에 저장
		int toic_score = sc.nextInt();
		
		if(gender.equals("여자") && toic_score >= 700) 	// 조건문
		{
			System.out.print("항공 승무원 지원 자격 가능자입니다 !");
		}
		else if(gender.equals("남자") && toic_score >= 800) 
		{
			System.out.print("항공 승무원 지원 자격 가능자입니다 !");
		}
		else
		{
			System.out.print("항공 승무원 지원이 불가능합니다 ㅠㅠ");
		}
		

	}

}
