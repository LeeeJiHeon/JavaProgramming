package week_12;

public class Lotteria {
	public static void main(String[] args) {
        try {
            BurgerCook burger = new BurgerCook(10);
            Thread t1 = new Thread(burger, "Bulgogi");
            Thread t2 = new Thread(burger, "Chicken");
            Thread t3 = new Thread(burger, "HotCrispy");
            Thread t4 = new Thread(burger, "Shrimp");

            t1.start();
            t2.start();
            t3.start();
            t4.start();

            t1.join();
            t2.join();
            t3.join();
            t4.join();

           System.out.println("[ 모든 버거가 완성되었습니다 ! ]");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class BurgerCook implements Runnable {

    private int burgerCount;
    private String[] grill = {" ", " ", " ", " "};	// 한 그릴에 최대 4개의 패티 조리 가능
    
    public BurgerCook(int count) {
        burgerCount = count;
    }

    @Override
    public void run() {
        while (burgerCount > 0) {

        	// 한번에 하나의 쓰레드만 접근 가능
            synchronized (this) {
            	burgerCount--;
                System.out.println("조리해야 할 버거의 수 : [ " + burgerCount + " ]");
                System.out.println("-------------------------------------------------------");
            }

            for (int i = 0; i < grill.length; i++) {
                if (!grill[i].equals(" ")) {
                    continue;
                }

                synchronized (this) {
                    grill[i] = Thread.currentThread().getName();
                    System.out.println(grill[i] + " 버거 조리 중");
                    System.out.println("-------------------------------------------------------");
                }

                // 버거 조리 대략 3초
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }


                synchronized (this) { 
                    System.out.println(Thread.currentThread().getName() + "버거 완성");
                    grill[i] = " ";
                }
                break;
            }

            // 새로운 버거를 만들기 위한 준비 시간
            try {
                Thread.sleep(Math.round(1000 * Math.random()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
