package week_9;

public class Person {		
	int number;				// ��ȣ
    String name;			// �̸�
    String address;			// �ּ�
    String phoneNumber;		// ��ȭ��ȣ
    char gender;			// ����
	
    public Person() {
    	this(0, "", "", "", ' ');
    }
    
    public Person(int number, String name, String address, String phoneNumber, char gender) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
	}
    

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "number = " + number + "\nname = " + name + "\naddress = " + address + "\nphoneNumber = " + phoneNumber + "\ngender = " + gender + "\n";
	}

}

