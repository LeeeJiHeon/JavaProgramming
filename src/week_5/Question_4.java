package week_5;

public class Question_4 {

	public static void main(String[] args) {
		int result = 0;		// ��� ���� �ʱ�ȭ
		int num = 100;		// ���� ���� = 100
		
		do
		{
			if(num % 2 == 1)	// Ȧ���� ���
			{
				result += num;	// Ȧ���� ���, +
			}
			num--;				// -�ϸ� ���� ���ڷ� �̵�
		} while(num >= 1);		// ���ڰ� 1 �̻��� ������ �ݺ�
		
		System.out.println("1���� 100������ �� = " + result);
	}

}
