package week_10;

public class Horse {
    private int numOfLeg;
    private int power;
    private String color;
    private int speed;

    // �⺻ ������
    public Horse() {
        // �ƹ� �ʱ�ȭ�� �ʿ����� ���� ���
    }

    // �Ķ���͸� ���� �Ӽ��� �ʱ�ȭ�ϴ� ������
    public Horse(int numOfLeg, int power, String color, int speed) {
        this.numOfLeg = numOfLeg;
        this.power = power;
        this.color = color;
        this.speed = speed;
    }

    // numOfLeg�� Setter�� Getter �޼���
    public void setNumOfLeg(int numOfLeg) {
        this.numOfLeg = numOfLeg;
    }

    public int getNumOfLeg() {
        return numOfLeg;
    }

    // power�� Setter�� Getter �޼���
    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    // color�� Setter�� Getter �޼���
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // speed�� Setter�� Getter �޼���
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}