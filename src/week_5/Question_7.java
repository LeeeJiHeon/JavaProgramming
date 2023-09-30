package week_5;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		
		do
		{
			System.out.println("=======================");
			System.out.println("가장 좋아하는 월은? (종료 : 0) ");
			System.out.println("=======================");
			
			month = sc.nextInt(); 		// 월 입력
			
			// 입력된 월에 따라 해당하는 게절 출력
			if (month >= 3 && month <= 5) 
			{
				System.out.println("****** " + month + "월 ******");
                System.out.println(month + "월은 봄에 해당됩니다.");
            } 
			else if (month >= 6 && month <= 8) 
            {
				System.out.println("****** " + month + "월 ******");
                System.out.println(month + "월은 여름에 해당됩니다.");
            }
            else if (month >= 9 && month <= 11) 
            {
				System.out.println("****** " + month + "월 ******");
                System.out.println(month + "월은 가을에 해당됩니다.");
            } 
            else if (month == 12 || month == 1 || month == 2) 
            {
				System.out.println("****** " + month + "월 ******");
                System.out.println(month + "월은 겨울에 해당됩니다.");
            } 
            else if (month == 0) 
            {
                System.out.println("프로그램을 종료합니다.");
            } 
            else 
            {
                System.out.println("올바른 월을 입력하세요.");
            }

        } while (month != 0);

	}

}
