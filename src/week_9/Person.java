package week_9;

public class Person {		
	int number;				// 번호
    String name;			// 이름
    String address;			// 주소
    String phoneNumber;		// 전화번호
    char gender;			// 성별
	
    @Override
	public String toString() {
		return "number = " + number + "\nname = " + name + "\naddress = " + address + "\nphoneNumber = " + phoneNumber + "\ngender = " + gender + "\n";
	}

    
    
}

