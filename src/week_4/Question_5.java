package week_4;
import java.util.*;

/* ��Ʈ���� ������ ���� ���� ���� �ð��� �Է� �޾� ���� ������ �ݾ��� ����ϴ� ���α׷��� �ۼ��Ͻþ�.
 *  ��Ʈ�� �ð��뺰�� �������� �ٸ��� �����Ѵ�. */
public class Question_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// ������� �Է��� �޵��� ��
		int Sale_price = 0;						// ���� ���Ա޾� ����
		
		System.out.print("������ �ð� : ");		// ������ �ð��� �Է¹޾� time�� ����
		int time = sc.nextInt();
		
		System.out.print("��Ʈ���� ������ ���� �� : ");	// ��Ʈ���� ������ ���� ���� �Է¹޾� price�� ����
		int price = sc.nextInt();
		
		if(time > 0 && time < 12)				// ���ǹ�
		{
			Sale_price = (int) (price * 0.95);
		}
		else if(time >= 12 && time <= 24)
		{
			Sale_price = (int) (price * 0.975);
		}
		
		/* �������� ��� */
		System.out.println("\n[���� ����]");
		System.out.println("���� �ð� : " + time +" ��");
		System.out.println("�� ���� �ݾ� : " + price);
		System.out.println("���� ���� �ݾ� : " + Sale_price);
		
	}

}
