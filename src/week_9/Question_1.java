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
}

public class Question_1 {

	public static void main(String[] args) {
		// Person ��ü ���� �� �� ���
        Person person1 = new Person(1, "������", "���� ���� ���ϵ�", "010-2407-5903", "��", 25);

        System.out.println("��ȣ : " + person1.number);
        System.out.println("�̸� : " + person1.name);
        System.out.println("�ּ� : " + person1.address);
        System.out.println("��ȭ��ȣ : " + person1.phoneNumber);
        System.out.println("���� : " + person1.gender);
        System.out.println("���� : " + person1.age);
	}

}
