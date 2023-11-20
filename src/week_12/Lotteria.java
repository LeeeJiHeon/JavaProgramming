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

           System.out.println("[ ��� ���Ű� �ϼ��Ǿ����ϴ� ! ]");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class BurgerCook implements Runnable {

    private int burgerCount;
    private String[] grill = {" ", " ", " ", " "};	// �� �׸��� �ִ� 4���� ��Ƽ ���� ����
    
    public BurgerCook(int count) {
        burgerCount = count;
    }

    @Override
    public void run() {
        while (burgerCount > 0) {

        	// �ѹ��� �ϳ��� �����常 ���� ����
            synchronized (this) {
            	burgerCount--;
                System.out.println("�����ؾ� �� ������ �� : [ " + burgerCount + " ]");
                System.out.println("-------------------------------------------------------");
            }

            for (int i = 0; i < grill.length; i++) {
                if (!grill[i].equals(" ")) {
                    continue;
                }

                synchronized (this) {
                    grill[i] = Thread.currentThread().getName();
                    System.out.println(grill[i] + " ���� ���� ��");
                    System.out.println("-------------------------------------------------------");
                }

                // ���� ���� �뷫 3��
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }


                synchronized (this) { 
                    System.out.println(Thread.currentThread().getName() + "���� �ϼ�");
                    grill[i] = " ";
                }
                break;
            }

            // ���ο� ���Ÿ� ����� ���� �غ� �ð�
            try {
                Thread.sleep(Math.round(1000 * Math.random()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
