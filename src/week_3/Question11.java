package week_3;
import java.util.Scanner;

/* 상품의 개수와 단가를 입력 받아 총 금액을 계산하여 출력하시오. 
 * 단, 상품의 개수가 100-199 사이이면 8%, 200-299 사이이면 15%, 300개 이상이면 20%의 할인 금액을 적용한다. 
 * 100개 미만이면 할인 금액을 적용하지 않는다. */
public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 입력 받기 위한 Scanner 객체 생성
		
		System.out.print("상품의 개수 : ");
		int product = sc.nextInt();
		
		System.out.print("상품의 단가 : ");
		int price = sc.nextInt();
		
		if(product >= 100 && product <= 199)			// 상품의 개수 100 ~ 199개
		{
			price = (int) ((price * product) * 0.92);
		}
		else if (product >= 200 && product <= 299)		// 상품의 개수 200 ~ 299개
		{
			price = (int) ((price * product) * 0.85);
		}
		else if (product >= 300) 						// 상품의 개수 300개 이상
		{
			price = (int) ((price * product) * 0.8);
		}
		else											// 상품의 개수 100개 미만
		{
			price = price * product;
		}

		System.out.print("총 금액 : " + price + " 원");

	}

}
