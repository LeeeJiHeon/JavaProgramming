package week_9;

public class Person {		
	int number;				// 번호
    String name;			// 이름
    String address;			// 주소
    String phoneNumber;		// 전화번호
    char gender;			// 성별
	
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

