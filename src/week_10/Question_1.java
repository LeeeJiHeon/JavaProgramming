package week_10;

class Horse {
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

    // Getter와 Setter 메서드
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
