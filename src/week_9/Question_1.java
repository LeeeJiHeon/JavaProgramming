package week_9;

/* 실 세계에서 사용 가능한 의미 있는 클래스를 작성한다.
   작성한 클래스의 객체를 생성하여, 객체의 멤버들의 값을 출력한다. */

public class Question_1 {

	public static void main(String[] args) {
		// Person 객체 생성 및 값 출력
		Person jiheon = new Person();
		jiheon.number = 1;
		jiheon.name = "Lee Jiheon";
		jiheon.address = "서울 은평구";
		jiheon.phoneNumber = "010-2407-5903";
		jiheon.gender = '남';
		
		Person chulsoo = new Person();
		chulsoo.number = 2;
		chulsoo.name = "Kim Chulsoo";
		chulsoo.address = "강원도 삼척시";
		chulsoo.phoneNumber = "010-1234-5678";
		chulsoo.gender = '남';
		
		Person sara = new Person();
		sara.number = 3;
		sara.name = "Lee sara";
		sara.address = "경기도 구리시";
		sara.phoneNumber = "010-9876-5432";
		sara.gender = '여';
		
		System.out.println("===========[ 목록 ]==========");
		System.out.println(jiheon.toString());
		System.out.println(chulsoo.toString());
		System.out.println(sara.toString());
	  
	}

}
