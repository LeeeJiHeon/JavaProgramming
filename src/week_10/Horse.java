package week_10;

//추상 클래스 Animal
abstract class Animal {
	protected int color;
	protected int speed;

	// 추상 메서드 run()
	public abstract void run();
}

//Horse 클래스 (Animal을 상속받음)
public class Horse extends Animal  {
    private int numOfLeg;
    private int power;
    private int color;
    private int speed;

    // 기본 생성자
    public Horse() {
        // 아무 초기화도 필요하지 않을 경우
    }

    // 파라미터를 통해 속성을 초기화하는 생성자
    public Horse(int numOfLeg, int power, int color, int speed) {
        this.numOfLeg = numOfLeg;
        this.power = power;
        this.color = color;
        this.speed = speed;
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
    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    // speed의 Setter와 Getter 메서드
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void run() {
    	System.out.println(toString()); // toString() 호출하여 속성 값 출력
    }
    public String toString() {
        return "=====[Horse]=====" +
               "\nnumOfLeg = " + numOfLeg +
               "\npower = " + power +
               "\ncolor = " + color + 
               "\nspeed = " + speed;
    }
    
    
}



