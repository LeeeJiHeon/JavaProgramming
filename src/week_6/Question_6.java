package week_6;

public class Question_6 {

	public static void main(String[] args) {
		int line = 1;
		
		for(int i = 0; i < 5; i++)
		{
			int j = line;			// �� ���� ���� �� ����
			
			while (j < line + 5)	// 5�� ����ϸ� while�� Ż��
			{
				System.out.print(j + " ");
				j++;
			}
			System.out.println();
			line += 5;				// ���� �ٿ� 5�� ���Ͽ� ����
		}
		
	}

}
