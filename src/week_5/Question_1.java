package week_5;

public class Question_1 {

	public static void main(String[] args) {
		int result = 0;					// ��� ���� �ʱ�ȭ
		
		for(int i =1; i <= 100; i++)	// i�� 1���� 100���� 1�� ������Ű�� �ݺ� 
		{
			if(i % 4 == 0)				// 4�� ������� Ȯ��
			{
				result += i;			// 4�� ����� ��� +
			}
		}
		
		System.out.print(result);		// ��� ���
	}

}