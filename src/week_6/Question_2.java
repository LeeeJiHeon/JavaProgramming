package week_6;
import java.util.*;

public class Question_2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subject1, subject2, subject3, total;
        int student = 0;
        double average;

        // ���� �ݺ��� (����ڰ� 0�� �Է��� �� ����, ������ �Է� ����)
        while (true) 
        {
            System.out.print("3������ ������ ���ʷ� �Է��ϼ��� : ");
            subject1 = scanner.nextInt();
            subject2 = scanner.nextInt();
            subject3 = scanner.nextInt();
            
            // ������ ��� 0�� �ƴ϶�� ���� �� ��� ���, �л� �� ����
            if (subject1 != 0 && subject2 != 0 && subject3 != 0)
            {
                total = subject1 + subject2 + subject3;
                average = (double) total / 3;
                student++;

                System.out.println(student + "��° �л� : ���� " + total + "��, ��� " + average + "��\n");
            } 
            // ������ ��� 0�� ��� �ݺ��� ����
            else 
            {
                break;
            }
        }

        System.out.println("\n�� " + student + "���� ���� ó�� �Ͽ����ϴ�.");
    }
}