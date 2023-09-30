package Chapter01;
import java.util.*;

public class Code11 {
	public static void main(String[] args)
	{
		System.out.print("입력받을 정수의 개수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt(); 
		}
		sc.close();
		
		int count=0;
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(arr[i]== arr[j])
				{
					count++;
				}
			}
		}
		System.out.println("쌍의 갯수 : " + count);
		
	}

}
