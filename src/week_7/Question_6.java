package week_7;

/* 1�� ������ �迭�� �̿��Ͽ� �� ��(������)�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
public class Question_6 {

	public static void main(String[] args) {
		int[][] arr = {
	            {28, 33, 36, 7},
	            {56, 66, 44, 20},
	            {88, 7, 21, 44},
	            {33, 2, 643, 4}
		};
		
		// �� ���� ���� ������ �迭
		int[] sum = new int [arr[0].length];
		
		// for���� ���� �� ���� �� ���
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				sum[j] += arr[i][j];
			}
		}
		
		// �� ���� �� ���
		for(int i = 0; i < sum.length; i++)
		{
			System.out.println((i + 1) + "���� �հ� : " + sum[i]);
		}
	}

}