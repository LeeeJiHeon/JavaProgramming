package week_10;

class Horse {
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

    // Getter�� Setter �޼���
    public int getNumOfLeg() {
        return numOfLeg;
    }

    public void setNumOfLeg(int numOfLeg) {
        this.numOfLeg = numOfLeg;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

public class Question_1 {

	public static void main(String[] args) {

	}

}
