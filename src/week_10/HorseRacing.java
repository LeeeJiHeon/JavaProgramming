package week_10;

public class HorseRacing {

	public static void main(String[] args) {
		// Animal 타입의 tony 객체 생성 (Horse 타입으로 초기화)
        Animal tony = new Horse(3, 50, 4, 10);

        // Animal 타입의 jeni 객체 생성 (Zebra 타입으로 초기화)
        Animal jeni = new Zebra(3, 50, 4, 10, 20);

        // tony 객체의 run() 메서드 호출
        tony.run();

        // jeni 객체의 run() 메서드 호출
        jeni.run();
	}

}
