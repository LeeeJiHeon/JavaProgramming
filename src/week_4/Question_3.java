package week_4;

import java.util.*;
/* ���� 3. ������ �����̸鼭 ���� ������ 700�� �̻��� ��� �Ǵ� ������ �����̸鼭 
 * ���� ������ 800�� �̻��� ��쿡�� ���װ� �¹��� ���� �ڰ� �������Դϴ١��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
public class Question_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// ������� �Է��� �޵��� ��
		
		System.out.print("���� �Է� : ");			// ������ �Է� �޾� gender�� ����
		String gender = sc.nextLine();
		
		System.out.print("���� ���� �Է� : ");		// ���� ������ �Է� �޾� totic_score�� ����
		int toic_score = sc.nextInt();
		
		if(gender.equals("����") && toic_score >= 700) 	// ���ǹ�
		{
			System.out.print("�װ� �¹��� ���� �ڰ� �������Դϴ� !");
		}
		else if(gender.equals("����") && toic_score >= 800) 
		{
			System.out.print("�װ� �¹��� ���� �ڰ� �������Դϴ� !");
		}
		else
		{
			System.out.print("�װ� �¹��� ������ �Ұ����մϴ� �Ф�");
		}
		

	}

}
