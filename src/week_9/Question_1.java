package week_9;

/* 실 세계에서 사용 가능한 의미 있는 클래스를 작성한다.
   작성한 클래스의 객체를 생성하여, 객체의 멤버들의 값을 출력한다. */

class Person {
	int number;				// 번호
    String name;			// 이름
    String address;			// 주소
    String phoneNumber;		// 전화번호
    String gender;			// 성별
    int age;				// 나이
    
    // 생성자
    public Person(int number, String name, String address, String phoneNumber, String gender, int age) {
        this.number = number;
    	this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }
}

public class Question_1 {

	public static void main(String[] args) {
		// Person 객체 생성 및 값 출력
        Person person1 = new Person(1, "이지헌", "서울 은평구 응암동", "010-2407-5903", "남", 25);

        System.out.println("번호 : " + person1.number);
        System.out.println("이름 : " + person1.name);
        System.out.println("주소 : " + person1.address);
        System.out.println("전화번호 : " + person1.phoneNumber);
        System.out.println("성별 : " + person1.gender);
        System.out.println("나이 : " + person1.age);
	}

}
