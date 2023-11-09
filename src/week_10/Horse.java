package week_10;

//�߻� Ŭ���� Animal
abstract class Animal {
	protected int color;
	protected int speed;

	// �߻� �޼��� run()
	public abstract void run();
}

//Horse Ŭ���� (Animal�� ��ӹ���)
public class Horse extends Animal  {
    private int numOfLeg;
    private int power;
    private int color;
    private int speed;

    // �⺻ ������
    public Horse() {
        // �ƹ� �ʱ�ȭ�� �ʿ����� ���� ���
    }

    // �Ķ���͸� ���� �Ӽ��� �ʱ�ȭ�ϴ� ������
    public Horse(int numOfLeg, int power, int color, int speed) {
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
    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    // speed�� Setter�� Getter �޼���
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void run() {
    	System.out.println(toString()); // toString() ȣ���Ͽ� �Ӽ� �� ���
    }
    public String toString() {
        return "=====[Horse]=====" +
               "\nnumOfLeg = " + numOfLeg +
               "\npower = " + power +
               "\ncolor = " + color + 
               "\nspeed = " + speed;
    }
    
    
}



