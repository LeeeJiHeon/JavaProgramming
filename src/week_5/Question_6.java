package week_5;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �Է� : ");
		int user = sc.nextInt();
		int number = 8;						// �ʱⰪ = 8
		
		System.out.println("** " + user + "�� **");	// ����ڰ� �Է��� ������ �� ���
		
		do
		{
			// ���� ���
			System.out.println(number + " * " + user + " = " + number * user); 
			number -= 2;	// number�� 2�� ���� 
		} while(number >= 2);

	}

}