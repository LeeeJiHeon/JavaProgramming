package week_9;

/* �� ���迡�� ��� ������ �ǹ� �ִ� Ŭ������ �ۼ��Ѵ�(1�� Ŭ���� �� ��� ����).
   �ۼ��� Ŭ������ ��ü �迭�� �����Ͽ�, ��ü �迭�ȿ� �ִ� ��ü���� ������� ���� ����Ѵ�. */
public class Question_2 {

	public static void main(String[] args) {
		// Person ��ü �迭 ����
        Person[] people = new Person[3]; 

        // ��ü �迭�� ������ ��ü �Ҵ�
        people[0] = new Person(1, "Lee Jiheon", "���� ����", "010-2407-5903", '��');
        people[1] = new Person(2, "Kim Chulsoo", "������ ��ô��", "010-1234-5678", '��');
        people[2] = new Person(3, "Lee sara", "��⵵ ������", "010-9876-5432", '��');
        
        // ��ü �迭 �ȿ� �ִ� ��ü ���� ���
        System.out.println("===========[ ��� ]==========");
        for (int i = 0; i < people.length; i++)
        {
            System.out.println(people[i].toString());
        }

	}

	
}