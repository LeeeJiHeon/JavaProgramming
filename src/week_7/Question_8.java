package week_7;

/* ������ ���� �� ���� 2���� �迭�� �� ��Ҹ� ���Ͽ� total �迭�� �����ϰ� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�  */

public class Question_8 {

	public static void main(String[] args) {
		int[][] a = {
                {7, 9, 4, 7, 2},
                {3, 4, 6, 7, 2},
        };
		
		int[][] b = {
                {3, 1, 4, 8, 0},
                {3, 5, 6, 9, 1},
        };
		
		// total �迭 
		int [][] total = new int[a.length][a[0].length];
		
		// for�� ���鼭 �� ��� ����
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				total[i][j] = a[i][j] + b[i][j];
			}
		}
		
		// total �迭 ���
		for(int i = 0; i < total.length; i++)
		{
			for(int j = 0; j < total[i].length; j++)
			{
				System.out.print(total[i][j] + " ");	
			}
			System.out.println();
		}
	}

}
