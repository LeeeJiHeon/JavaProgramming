package week_6;
import java.util.*;

public class Question_2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subject1, subject2, subject3, total;
        int student = 0;
        double average;

        // 무한 반복문 (사용자가 0을 입력할 때 까지, 성적을 입력 받음)
        while (true) 
        {
            System.out.print("3과목의 성적을 차례로 입력하세요 : ");
            subject1 = scanner.nextInt();
            subject2 = scanner.nextInt();
            subject3 = scanner.nextInt();
            
            // 성적이 모두 0이 아니라면 총점 및 평균 계산, 학생 수 증가
            if (subject1 != 0 && subject2 != 0 && subject3 != 0)
            {
                total = subject1 + subject2 + subject3;
                average = (double) total / 3;
                student++;

                System.out.println(student + "번째 학생 : 총점 " + total + "점, 평균 " + average + "점\n");
            } 
            // 성적이 모두 0인 경우 반복문 종료
            else 
            {
                break;
            }
        }

        System.out.println("\n총 " + student + "명을 성적 처리 하였습니다.");
    }
}