package week_10;

public class Zebra extends Horse {
    private int numOfStripe; // 새로운 속성 추가

    // 기본 생성자
    public Zebra() {
        super(); // Horse 클래스의 기본 생성자 호출
        this.numOfStripe = 0; // 기본값 설정
    }

    // 파라미터를 통해 속성을 초기화하는 생성자
    public Zebra(int numOfLeg, int power, String color, int speed, int numOfStripe) {
        super(numOfLeg, power, color, speed); // 상위 클래스의 생성자 호출
        this.numOfStripe = numOfStripe;
    }

    // numOfStripe의 Setter와 Getter 메서드
    public void setNumOfStripe(int numOfStripe) {
        this.numOfStripe = numOfStripe;
    }

    public int getNumOfStripe() {
        return numOfStripe;
    }
}