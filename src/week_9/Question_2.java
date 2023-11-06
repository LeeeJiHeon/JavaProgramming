package week_9;

/* 실 세계에서 사용 가능한 의미 있는 클래스를 작성한다(1번 클래스 재 사용 가능).
   작성한 클래스의 객체 배열을 생성하여, 객체 배열안에 있는 객체들의 멤버들의 값을 출력한다. */
public class Question_2 {

	public static void main(String[] args) {
		// Person 객체 배열 생성
        Person[] people = new Person[3]; 

        // 객체 배열에 각각의 객체 할당
        people[0] = new Person(1, "Lee Jiheon", "서울 은평구", "010-2407-5903", '남');
        people[1] = new Person(2, "Kim Chulsoo", "강원도 삼척시", "010-1234-5678", '남');
        people[2] = new Person(3, "Lee sara", "경기도 구리시", "010-9876-5432", '여');
        
        // 객체 배열 안에 있는 객체 값을 출력
        System.out.println("===========[ 목록 ]==========");
        for (int i = 0; i < people.length; i++)
        {
            System.out.println(people[i].toString());
        }

	}

	
}