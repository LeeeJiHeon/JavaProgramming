package week_10;


abstract class Symbol {
    abstract void symbolize();
}


interface KeyInterface {
    void symbolizeI();
}

class Key extends Symbol implements KeyInterface {
    int no;
    String passwd;

    public Key(int no, String passwd) {
        this.no = no;
        this.passwd = passwd;
    }

    @Override
    void symbolize() {
    	
    }

    @Override
    public void symbolizeI() {
    	
    }

    @Override
    public String toString() {
        return "no =  " + no + "\npasswd =  " + passwd + "\n";
    }
}


class BioKey extends Key {
    int fingerprint;

    public BioKey(int no, String passwd, int fingerprint) {
        super(no, passwd);
        this.fingerprint = fingerprint;
    }

    @Override
    public String toString() {
        return super.toString() + "fingerprint =  " + fingerprint + "\n";
    }
}

class CardKey extends Key {
    int distance;

    public CardKey(int no, String passwd, int distance) {
        super(no, passwd);
        this.distance = distance;
    }

    @Override
    public String toString() {
        return super.toString() + "distance =  " + distance + "\n";
    }
}

public class KeyTest {
	Key k1, k2, k3;
	CardKey c1, c2;
	BioKey b1, b2;  // °´Ã¼ ¼±¾ð

	public KeyTest() {
		//super(); // Object()
		k1 = new Key(1, "1234");
		c1 = new CardKey(2, "4321", 10);
		b1 = new BioKey(3, "4321", 5);
		System.out.println("[Key]\n" + k1 + "\n" + "[CardKey]\n" +  c1 + "\n" + "[BioKey]\n" + b1);
		
		k2 = new CardKey(4, "4321", 10);
		k3 = new BioKey(5, "4321", 5);
		System.out.println("[Key]\n"+ k2 + "\n" + "[Key]\n" + k3 );		
	}

	public static void main(String[] args) {	
		 KeyTest kt = new KeyTest();
		 
    }

}
