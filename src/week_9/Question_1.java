package week_9;

/* �� ���迡�� ��� ������ �ǹ� �ִ� Ŭ������ �ۼ��Ѵ�.
   �ۼ��� Ŭ������ ��ü�� �����Ͽ�, ��ü�� ������� ���� ����Ѵ�. */

class Person {
	int number;				// ��ȣ
    String name;			// �̸�
    String address;			// �ּ�
    String phoneNumber;		// ��ȭ��ȣ
    String gender;			// ����
    int age;				// ����
    
    // ������
    public Person(int number, String name, String address, String phoneNumber, String gender, int age) {
        this.number = number;
    	this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }
 // Getter �޼���� (Setter �޼��嵵 �ʿ��ϴٸ� �߰� ����)
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
		// Person ��ü ���� �� �� ���
        Person person1 = new Person(1, "������", "���� ���� ���ϵ�", "010-2407-5903", "����", 25);
        Person person2 = new Person(2, "ȫ�浿", "������ ��ô�� ����", "010-1234-5678", "����", 30);
        Person person3 = new Person(3, "�̽���", "���� ������ �Ż絿", "010-9876-5432", "����", 40);
        
        System.out.println("=========[ ���� ]========");
        System.out.println("��ȣ : " + person1.number);
        System.out.println("�̸� : " + person1.name);
        System.out.println("�ּ� : " + person1.address);
        System.out.println("��ȭ��ȣ : " + person1.phoneNumber);
        System.out.println("���� : " + person1.gender);
        System.out.println("���� : " + person1.age + "\n=======================");
       
        
        System.out.println("��ȣ : " + person2.number);
        System.out.println("�̸� : " + person2.name);
        System.out.println("�ּ� : " + person2.address);
        System.out.println("��ȭ��ȣ : " + person2.phoneNumber);
        System.out.println("���� : " + person2.gender);
        System.out.println("���� : " + person2.age + "\n=======================");
        
        System.out.println("��ȣ : " + person3.number);
        System.out.println("�̸� : " + person3.name);
        System.out.println("�ּ� : " + person3.address);
        System.out.println("��ȭ��ȣ : " + person3.phoneNumber);
        System.out.println("���� : " + person3.gender);
        System.out.println("���� : " + person3.age + "\n=======================");
        
        
	}

}
