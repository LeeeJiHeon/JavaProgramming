package week_5;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		
		do
		{
			System.out.println("=======================");
			System.out.println("���� �����ϴ� ����? (���� : 0) ");
			System.out.println("=======================");
			
			month = sc.nextInt(); 		// �� �Է�
			
			// �Էµ� ���� ���� �ش��ϴ� ���� ���
			if (month >= 3 && month <= 5) 
			{
				System.out.println("****** " + month + "�� ******");
                System.out.println(month + "���� ���� �ش�˴ϴ�.");
            } 
			else if (month >= 6 && month <= 8) 
            {
				System.out.println("****** " + month + "�� ******");
                System.out.println(month + "���� ������ �ش�˴ϴ�.");
            }
            else if (month >= 9 && month <= 11) 
            {
				System.out.println("****** " + month + "�� ******");
                System.out.println(month + "���� ������ �ش�˴ϴ�.");
            } 
            else if (month == 12 || month == 1 || month == 2) 
            {
				System.out.println("****** " + month + "�� ******");
                System.out.println(month + "���� �ܿ￡ �ش�˴ϴ�.");
            } 
            else if (month == 0) 
            {
                System.out.println("���α׷��� �����մϴ�.");
            } 
            else 
            {
                System.out.println("�ùٸ� ���� �Է��ϼ���.");
            }

        } while (month != 0);

	}

}
