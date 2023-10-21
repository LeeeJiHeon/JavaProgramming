package week_10;

public class Zebra extends Horse {
    private int numOfStripe; // ���ο� �Ӽ� �߰�

    // �⺻ ������
    public Zebra() {
        super(); // Horse Ŭ������ �⺻ ������ ȣ��
        this.numOfStripe = 0; // �⺻�� ����
    }

    // �Ķ���͸� ���� �Ӽ��� �ʱ�ȭ�ϴ� ������
    public Zebra(int numOfLeg, int power, String color, int speed, int numOfStripe) {
        super(numOfLeg, power, color, speed); // ���� Ŭ������ ������ ȣ��
        this.numOfStripe = numOfStripe;
    }

    // numOfStripe�� Setter�� Getter �޼���
    public void setNumOfStripe(int numOfStripe) {
        this.numOfStripe = numOfStripe;
    }

    public int getNumOfStripe() {
        return numOfStripe;
    }
}