package week_4;

import java.util.*;
/* ���� 1. ���̿� ������ �Է� �޾� ���̰� 30�� �̸��̰�, ������ 3.5 �̻��̸� ����õ ����Դϴ١��� ����ϰ�,
 *  �׷��� ������ ����õ ����� �ƴմϴ١��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class Question_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	// ������� �Է��� �޵��� ��
		
		System.out.print("���� �Է� : ");			// ���̸� �Է� �޾� age�� ����
		int age = sc.nextInt();
		
		System.out.print("���� �Է� : ");			// ������ �Է� �޾� score�� ����
		double score = sc.nextDouble();
		
		if(age < 30 && score >= 3.5) 			// ���ǹ�
		{
			System.out.print("��õ ����Դϴ� !");
		}
		else
		{
			System.out.print("��õ ����� �ƴմϴ� �Ф�");
		}
	}

}
