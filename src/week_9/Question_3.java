package week_9;

/* 2���� �ۼ��� ��ü �迭�� ����Ͽ�, �ǹ� �ִ� ����� �ϴ� �޼ҵ带 5�� �̻� �ۼ��ϰ� �� �޼ҵ��� ����� ����Ѵ�.
   
   a. Person ��ü �迭�� ũ�⸦ ����Ѵ�.
   b.  Person ��ü �迭�� �̸��� ������ �����ϴ� ����� ������ ����Ѵ�.
   c.  Person ��ü �迭�� �̸��� ������ �����ϴ� ����� �̸��� ����Ѵ�.
   d. c.d�� �Բ� ����Ѵ�.
   e. Person ��ü �迭���� ������ ��, ������ ���� ����Ѵ�.
   f.  Person ��ü �迭���� ���ڸ� ����Ѵ�.
   g.  Person ��ü �迭���� ���ڸ� ����Ѵ� */

public class Question_3 {
	
	// a. Person ��ü �迭�� ũ�� ���
    public static void printArraySize(Person[] people) {
        int arraySize = people.length;
        
        System.out.println("Person ��ü �迭�� ũ�� : " + arraySize);
    }

    // b. Person ��ü �迭�� �̸��� ������ �����ϴ� ����� ���� ���
    public static void printKimCount(Person[] people) {
        int kimCount = 0;
       
        for (int i = 0; i < people.length; i++) 
        {
            if (people[i].getName().startsWith("Kim")) 
            {
                kimCount++;
            }
        }
        System.out.println("������ �����ϴ� ����� �� : " + kimCount + "��");
    }

    // c. Person ��ü �迭�� �̸��� ������ �����ϴ� ����� �̸��� ���
    public static void printKimNames(Person[] people) 
    {
        System.out.print("������ �����ϴ� ��� : ");
        
        for (int i = 0; i < people.length; i++) 
        {
            if (people[i].getName().startsWith("Kim")) 
            {
                System.out.print(people[i].getName() + " | ");
            }
        }
    }

    // d. b�� c�� �Բ� ���
    public static void printcd(Person[] people) {
        printKimCount(people);
        printKimNames(people);
    }

    // e. Person ��ü �迭���� ���ڿ� ������ ���� ���
    public static void printGenderCount(Person[] people) {
        int manCount = 0;
        int womanCount = 0;
        
        for (int i = 0; i < people.length; i++) 
        {
            if (people[i].getGender()=='��') 
            {
            	manCount++;
            } 
            else if (people[i].getGender()=='��') 
            {
            	womanCount++;
            }
        }
        
        System.out.println("\n���� �� : " + manCount + "��");
        System.out.println("���� �� : " + womanCount + "��");
    }

    // f. Person ��ü �迭���� ���ڸ� ���
    public static void printManCount(Person[] people) {
        System.out.print("���� �̸� : ");
        
        for (int i = 0; i < people.length; i++) 
        {
            if (people[i].getGender()=='��') 
            {
                System.out.print(people[i].getName() + " | ");
            }
        }
    }

    // g. Person ��ü �迭���� ���ڸ� ���
    public static void printWomanCount(Person[] people)
    {
        System.out.print("\n���� �̸� : ");
        
        for (int i = 0; i < people.length; i++)
        {
            if (people[i].getGender()=='��') 
            {
                System.out.print(people[i].getName() + " | ");
            }
        }
    }
    
	public static void main(String[] args) {
		// Person ��ü �迭 ����
        Person[] people = new Person[5]; 

        // ��ü �迭�� ������ ��ü �Ҵ�
        people[0] = new Person(1, "Lee Jiheon", "���� ����", "010-2407-5903", '��');
        people[1] = new Person(2, "Kim Chulsoo", "������ ��ô��", "010-1234-5678", '��');
        people[2] = new Person(3, "Lee sara", "��⵵ ������", "010-9876-5432", '��');
        people[3] = new Person(4, "Ahn Suji", "���� ���빮��", "010-3333-3333", '��');
        people[4] = new Person(5, "Kim Minjae", "��⵵ ��õ��", "010-4444-4444",  '��');
		
        System.out.println("===================[ ��� ]==================");
        printArraySize(people);
        printcd(people);
        printGenderCount(people);
        printManCount(people);
        printWomanCount(people);

	}

}
