package week_7;

/* ������ ���� 2���� �迭���� ���� ���ڰ� �� �� ���������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
   ��, ���ڴ� �� ���� ��µǾ�� �Ѵ�. */

public class Question_7 {

	public static void main(String[] args) {
		int[][] arr = {
                {7, 9, 4, 7, 2},
                {3, 4, 6, 7, 2},
                {3, 2, 6, 9, 8},
        };
		
		// ������ ���� ������ �迭
		 int[] count = new int[10];

        // for�� ���鼭 ������ ������ ���
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                count[arr[i][j]]++;
            }
        }

        // ��� ���
        for (int i = 0; i < count.length; i++) 
        {
            if (count[i] > 0) {
                System.out.println(i + "�� ���� : " + count[i]);
            }
        }
	}

}