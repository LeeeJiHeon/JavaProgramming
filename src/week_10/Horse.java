package week_10;

//추상 클래스 Animal
abstract class Animal {
	protected String color;
	protected int speed;

	// 추상 메서드 run()
	public abstract void run();
}

public class Horse extends Animal  {
    private int numOfLeg;
    private int power;
    private String color;
    private int speed;

    // 기본 생성자
    public Horse() {
        // 아무 초기화도 필요하지 않을 경우
    }

    // 파라미터를 통해 속성을 초기화하는 생성자
    public Horse(int numOfLeg, int power, String color, int speed) {
        this.numOfLeg = numOfLeg;
        this.power = power;
        this.color = color;
        this.speed = speed;
    }
    
    @Override
    public void run() {
        System.out.println("Horse is running!");
    }

    // numOfLeg의 Setter와 Getter 메서드
    public void setNumOfLeg(int numOfLeg) {
        this.numOfLeg = numOfLeg;
    }

    public int getNumOfLeg() {
        return numOfLeg;
    }

    // power의 Setter와 Getter 메서드
    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    // color의 Setter와 Getter 메서드
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // speed의 Setter와 Getter 메서드
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    
}

