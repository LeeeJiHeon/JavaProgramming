package week_3;
import java.util.Scanner;

/* ��ǰ�� ������ �ܰ��� �Է� �޾� �� �ݾ��� ����Ͽ� ����Ͻÿ�. 
 * ��, ��ǰ�� ������ 100-199 �����̸� 8%, 200-299 �����̸� 15%, 300�� �̻��̸� 20%�� ���� �ݾ��� �����Ѵ�. 
 * 100�� �̸��̸� ���� �ݾ��� �������� �ʴ´�. */
public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// �Է� �ޱ� ���� Scanner ��ü ����
		
		System.out.print("��ǰ�� ���� : ");
		int product = sc.nextInt();
		
		System.out.print("��ǰ�� �ܰ� : ");
		int price = sc.nextInt();
		
		if(product >= 100 && product <= 199)			// ��ǰ�� ���� 100 ~ 199��
		{
			price = (int) ((price * product) * 0.92);
		}
		else if (product >= 200 && product <= 299)		// ��ǰ�� ���� 200 ~ 299��
		{
			price = (int) ((price * product) * 0.85);
		}
		else if (product >= 300) 						// ��ǰ�� ���� 300�� �̻�
		{
			price = (int) ((price * product) * 0.8);
		}
		else											// ��ǰ�� ���� 100�� �̸�
		{
			price = price * product;
		}

		System.out.print("�� �ݾ� : " + price + " ��");

	}

}
