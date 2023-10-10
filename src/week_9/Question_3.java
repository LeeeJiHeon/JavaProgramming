package week_9;

/* 2에서 작성한 객체 배열을 사용하여, 의미 있는 출력을 하는 메소드를 5개 이상 작성하고 각 메소드의 결과를 출력한다.
   
   a. Person 객체 배열의 크기를 출력한다.
   b.  Person 객체 배열의 이름이 김으로 시작하는 사람의 갯수를 출력한다.
   c.  Person 객체 배열의 이름이 김으로 시작하는 사람의 이름을 출력한다.
   d. c.d를 함께 출력한다.
   e. Person 객체 배열에서 남자의 수, 여자의 수를 출력한다.
   f.  Person 객체 배열에서 남자만 출력한다.
   g.  Person 객체 배열에서 여자만 출력한다 */

public class Question_3 {
	// a. Person 객체 배열의 크기 출력
    public static void printArraySize(Person[] people) {
        int arraySize = people.length;
        System.out.println("Person 객체 배열의 크기 : " + arraySize);
    }

    // b. Person 객체 배열의 이름이 김으로 시작하는 사람의 수를 출력
    public static void printKimCount(Person[] people) {
        int kimCount = 0;
        for (int i = 0; i < people.length; i++) 
        {
            if (people[i].getName().startsWith("김")) 
            {
                kimCount++;
            }
        }
        System.out.println("김으로 시작하는 사람의 수 : " + kimCount + "명");
    }

    // c. Person 객체 배열의 이름이 김으로 시작하는 사람의 이름을 출력
    public static void printKimNames(Person[] people) 
    {
        System.out.print("김으로 시작하는 사람 : ");
        for (int i = 0; i < people.length; i++) 
        {
            if (people[i].getName().startsWith("김")) 
            {
                System.out.print(people[i].getName() + " ");
            }
        }
    }

    // d. b와 c를 함께 출력
    public static void printcd(Person[] people) {
        printKimCount(people);
        printKimNames(people);
    }

    // e. Person 객체 배열에서 남자와 여자의 수를 출력
    public static void printGenderCount(Person[] people) {
        int manCount = 0;
        int womanCount = 0;
        for (int i = 0; i < people.length; i++) 
        {
            if (people[i].getGender().equals("남자")) 
            {
            	manCount++;
            } 
            else if (people[i].getGender().equals("여자")) 
            {
            	womanCount++;
            }
        }
        System.out.println("\n남자 수 : " + manCount + "명");
        System.out.println("여자 수 : " + womanCount + "명");
    }

    // f. Person 객체 배열에서 남자만 출력
    public static void printManCount(Person[] people) {
        System.out.print("남자 이름 : ");
        for (int i = 0; i < people.length; i++) 
        {
            if (people[i].getGender().equals("남자")) 
            {
                System.out.print(people[i].getName() + " ");
            }
        }
    }

    // g. Person 객체 배열에서 여자만 출력
    public static void printWomanCount(Person[] people)
    {
        System.out.print("\n여자 이름 : ");
        for (int i = 0; i < people.length; i++)
        {
            if (people[i].getGender().equals("여자")) 
            {
                System.out.print(people[i].getName() + " ");
            }
        }
    }
    
	public static void main(String[] args) {
		// Person 객체 배열 생성
        Person[] people = new Person[5]; 

        // 객체 배열에 각각의 객체 할당
        people[0] = new Person(1, "이지헌", "서울 은평구 응암동", "010-2407-5903", "남자", 25);
        people[1] = new Person(2, "홍길동", "강원도 삼척시 교동", "010-1234-5678", "남자", 30);
        people[2] = new Person(3, "이슬이", "서울 강남구 신사동", "010-9876-5432", "여자", 40);
        people[3] = new Person(4, "김철수", "서울 서대문구 홍제동", "010-3333-3333", "남자", 20);
        people[4] = new Person(5, "김미향", "경기도 이천시 중리동", "010-4444-4444", "여자", 28);
		
        System.out.println("===============[ 정보 ]==============");
        printArraySize(people);
        printcd(people);
        printGenderCount(people);
        printManCount(people);
        printWomanCount(people);

	}

}
