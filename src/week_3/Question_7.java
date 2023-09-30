package week_3;
import java.util.Scanner;

/* 문제7. 나이를 입력 받아 입력된 나이가 19세 미만이면 “미성년자입니다”, 19세이면 “19세입니다”를, 
   19세보다 많으면 “성인입니다”를 출력하는 프로그램을 작성하시오.*/
public class Question_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 입력 받기 위한 Scanner 객체 생성
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age < 19)	// 조건식
		{
			System.out.print("미성년자입니다.");
		}
		else if(age == 19)
		{
			System.out.print("19세입니다.");
		}
		else
		{
			System.out.print("성인입니다.");
		}
	}

}
