package week_9;

/* 실 세계에서 사용 가능한 의미 있는 클래스를 작성한다(1번 클래스 재 사용 가능).
   작성한 클래스의 객체 배열을 생성하여, 객체 배열안에 있는 객체들의 멤버들의 값을 출력한다. */
public class Question_2 {

	public static void main(String[] args) {
		// Person 객체 배열 생성
        Person[] people = new Person[3]; 

        // 객체 배열에 각각의 객체 할당
        people[0] = new Person(1, "이지헌", "서울 은평구 응암동", "010-2407-5903", "남자", 25);
        people[1] = new Person(2, "홍길동", "강원도 삼척시 교동", "010-1234-5678", "남자", 30);
        people[2] = new Person(3, "이슬이", "서울 강남구 신사동", "010-9876-5432", "여자", 40);
        
        // 객체 배열 안에 있는 객체 값을 출력
        System.out.println("=========[ 정보 ]========");
        for (int i = 0; i < people.length; i++)
        {
            System.out.println("번호 : " + people[i].getNumber());
            System.out.println("이름 : " + people[i].getName());
            System.out.println("주소 : " + people[i].getAddress());
            System.out.println("전화번호 : " + people[i].getPhoneNumber());
            System.out.println("성별 : " + people[i].getGender());
            System.out.println("나이 : " + people[i].getAge() + "\n=======================");
        }

	}

}
