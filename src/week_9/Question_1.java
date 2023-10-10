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
 // Getter 메서드들 (Setter 메서드도 필요하다면 추가 가능)
    public int getNumber() {
        return number;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getGender() {
        return gender;
    }
    
    public int getAge() {
        return age;
    }

}

public class Question_1 {

	public static void main(String[] args) {
		// Person 객체 생성 및 값 출력
        Person person1 = new Person(1, "이지헌", "서울 은평구 응암동", "010-2407-5903", "남자", 25);
        Person person2 = new Person(2, "홍길동", "강원도 삼척시 교동", "010-1234-5678", "남자", 30);
        Person person3 = new Person(3, "이슬이", "서울 강남구 신사동", "010-9876-5432", "여자", 40);
        
        System.out.println("=========[ 정보 ]========");
        System.out.println("번호 : " + person1.number);
        System.out.println("이름 : " + person1.name);
        System.out.println("주소 : " + person1.address);
        System.out.println("전화번호 : " + person1.phoneNumber);
        System.out.println("성별 : " + person1.gender);
        System.out.println("나이 : " + person1.age + "\n=======================");
       
        
        System.out.println("번호 : " + person2.number);
        System.out.println("이름 : " + person2.name);
        System.out.println("주소 : " + person2.address);
        System.out.println("전화번호 : " + person2.phoneNumber);
        System.out.println("성별 : " + person2.gender);
        System.out.println("나이 : " + person2.age + "\n=======================");
        
        System.out.println("번호 : " + person3.number);
        System.out.println("이름 : " + person3.name);
        System.out.println("주소 : " + person3.address);
        System.out.println("전화번호 : " + person3.phoneNumber);
        System.out.println("성별 : " + person3.gender);
        System.out.println("나이 : " + person3.age + "\n=======================");
        
        
	}

}
