package Chapter01;
import java.util.*;

public class Code04 {

	public static void main(String[] args) {
		String name = null;
		int age;
		String gender;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �̸�, ����, ������ �Է��ϼ��� :");
		
		name = sc.next();
		age = sc.nextInt();
		gender = sc.next();
		
		if(gender.equals("��")) {
			System.out.println(name + ", ����� " + age + "���� �����Դϴ�.");
		}
		else if(gender.equals("��")) {
			System.out.println(name + ", ����� " + age + "���� �����Դϴ�.");
		}
		else {
			System.out.println("������ (�� Ȥ�� ��)�� �Է��ϼ���.");
		}
		sc.close();	
	}
}
