package week_10;

public class HorseRacing {

	public static void main(String[] args) {
		// Animal Ÿ���� tony ��ü ���� (Horse Ÿ������ �ʱ�ȭ)
        Animal tony = new Horse(3, 50, 4, 10);

        // Animal Ÿ���� jeni ��ü ���� (Zebra Ÿ������ �ʱ�ȭ)
        Animal jeni = new Zebra(3, 50, 4, 10, 20);

        // tony ��ü�� run() �޼��� ȣ��
        tony.run();

        // jeni ��ü�� run() �޼��� ȣ��
        jeni.run();
	}

}
