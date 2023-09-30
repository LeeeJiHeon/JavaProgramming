package week_4;
import java.util.*;

/* 마트에서 구입한 물건 값과 구입 시간을 입력 받아 실제 지불한 금액을 출력하는 프로그램을 작성하시어.
 *  마트는 시간대별로 할인율을 다르게 적용한다. */
public class Question_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 사용자의 입력을 받도록 함
		int Sale_price = 0;						// 실제 구입급액 선언
		
		System.out.print("구입한 시간 : ");		// 구입한 시간을 입력받아 time에 저장
		int time = sc.nextInt();
		
		System.out.print("마트에서 구입한 물건 값 : ");	// 마트에서 구입한 물건 값을 입력받아 price에 저장
		int price = sc.nextInt();
		
		if(time > 0 && time < 12)				// 조건문
		{
			Sale_price = (int) (price * 0.95);
		}
		else if(time >= 12 && time <= 24)
		{
			Sale_price = (int) (price * 0.975);
		}
		
		/* 구매정보 출력 */
		System.out.println("\n[구매 정보]");
		System.out.println("구입 시간 : " + time +" 시");
		System.out.println("총 구입 금액 : " + price);
		System.out.println("실제 구입 금액 : " + Sale_price);
		
	}

}
