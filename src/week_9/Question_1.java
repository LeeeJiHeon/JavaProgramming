package week_9;

/* �� ���迡�� ��� ������ �ǹ� �ִ� Ŭ������ �ۼ��Ѵ�.
   �ۼ��� Ŭ������ ��ü�� �����Ͽ�, ��ü�� ������� ���� ����Ѵ�. */

public class Question_1 {

	public static void main(String[] args) {
		// Person ��ü ���� �� �� ���
		Person jiheon = new Person();
		jiheon.number = 1;
		jiheon.name = "Lee Jiheon";
		jiheon.address = "���� ����";
		jiheon.phoneNumber = "010-2407-5903";
		jiheon.gender = '��';
		
		Person chulsoo = new Person();
		chulsoo.number = 2;
		chulsoo.name = "Kim Chulsoo";
		chulsoo.address = "������ ��ô��";
		chulsoo.phoneNumber = "010-1234-5678";
		chulsoo.gender = '��';
		
		Person sara = new Person();
		sara.number = 3;
		sara.name = "Lee sara";
		sara.address = "��⵵ ������";
		sara.phoneNumber = "010-9876-5432";
		sara.gender = '��';
		
		System.out.println("===========[ ��� ]==========");
		System.out.println(jiheon.toString());
		System.out.println(chulsoo.toString());
		System.out.println(sara.toString());
	  
	}

}
