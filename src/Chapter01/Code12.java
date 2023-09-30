package Chapter01;

import java.util.Scanner;

public class Code12 {
	
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
		
		int maxSum = 0;
		for(int i=0; i<n; i++)
		{
			int sum = 0;
			for(int j=i; j<n; j++)
			{
				sum += arr[j];
				if(sum > maxSum)
				{
					maxSum = sum;
				}
			}
		}
		System.out.println("최대합은 = " + maxSum);
	}

}
