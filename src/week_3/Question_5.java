package week_3;
import java.util.*;

/* ����5.�� ����� 8000���� ��ȭ������ 10�� �̻��� ��� 10%, 20�� �̻��� ��� 20%�� ������ �ְ� �ִ�.
 ��� ���� �Է� �޾� �����ؾ� �ϴ� �� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
public class Question_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// �Է� �ޱ� ���� Scanner ��ü ����
		
		System.out.print("��� �� : ");
		int person = sc.nextInt();
		
		int money = person * 8000;				// ���� ��, �� ���
		
		if(person >= 10 && person < 20)			// 10 ~ 19��
		{
			money = (int) (money * 0.9);
			System.out.println("�� ��� (10% ���� ����): " + money + "��");
		}
		else if(person >= 20)					// 20�� �̻�
		{
			money = (int) (money * 0.8);
			System.out.println("�� ��� (20% ���� ����): " + money + "��");
		}
		else // 10�� �̸�
		{
			System.out.println("�� ��� (0% ���� ����): " + money + "��");
		}

		
		 
	}

}
