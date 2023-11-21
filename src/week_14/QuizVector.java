package week_14;

import java.util.Scanner;
import java.util.Vector;

public class QuizVector {
	private Scanner sc = new Scanner(System.in);
	private Vector<Nation> nations = new Vector<Nation>();
	private Vector<Quiz> quizQuestions = new Vector<Quiz>();

    public QuizVector() {
	    nations.add(new Nation("���ѹα�", "����"));
	    nations.add(new Nation("������", "�ĸ�"));
	    nations.add(new Nation("�Ϻ�", "����"));
	    nations.add(new Nation("�߱�", "����¡"));
	    nations.add(new Nation("���þ�", "��ũ��"));
	    nations.add(new Nation("����", "������"));
	    nations.add(new Nation("������", "���帮��"));
	    nations.add(new Nation("����", "����"));
	    nations.add(new Nation("�׸���", "���׳�"));

	    // ���� �߰�
	    for (int i = 0; i < nations.size(); i++) 
	    {
	        Nation nation = nations.get(i);
	        quizQuestions.add(new Quiz(nation.getCountry(), nation.getCapital()));
	    }
    }

    // Ư�� ������ �ִ��� Ȯ���ϴ� �޼ҵ�
    private boolean contains(String country) {
    	for (int i = 0; i < nations.size(); i++) 
    	{
    	    Nation nation = nations.get(i);
    	    if (nation.getCountry().equals(country)) 
    	    {
    	        return true;
    	    }
	    }
        return false;
    }

    // ����ڷκ��� ������ ������ �Է¹޾� ���� ���Ϳ� �߰��ϴ� �޼���
    public void insert() {
    	System.out.println("\n[ ========== ��ϵ� ������ ���� ========== ]");
    	for (int i = 0; i < nations.size(); i++) 
    	{
            Nation nation = nations.get(i);
            System.out.println(nation.getCountry() + " : " + nation.getCapital());
    	}
        System.out.println("[ ======================================= ]");
        System.out.println("���� " + nations.size() + "���� ������ ������ ��ϵǾ� �ֽ��ϴ�.\n ");
        
        while (true) 
        {
            System.out.print("������ ������ �Է��ϼ��� >> (���� ��, '����' �Է�): ");
            
            String country = sc.next();
            if (country.equals("����")) 
            {
                break;
            }
            String capital = sc.next();

            // ������ �̹� �����ϴ��� Ȯ���ϰ� �ߺ��� ���, �޽��� ���
            if (contains(country)) 
            {
                System.out.println(country + "�� �̹� ��ϵǾ� �ֽ��ϴ�.");
                continue;
            }

            // ���� �� ������ ���Ϳ� �߰�
            nations.add(new Nation(country, capital));
            quizQuestions.add(new Quiz(country, capital));
		}
    }

    // ��� �÷����ϴ� �޼���
    public void play() {
        while (true) 
        {
            // �����ϰ� ���� �ϳ��� ����
            int index = (int) (Math.random() * quizQuestions.size());
            Quiz quizQuestion = quizQuestions.get(index);
            String question = quizQuestion.getQuestion();
            String answer = quizQuestion.getAnswer();

            // ������ ���� ���� ���
            System.out.print("\n[" + question +"]" + "�� ������ �Է��ϼ��� >> ");

            String capitalFromUser = sc.next(); // ����� �Է�
            if (capitalFromUser.equals("����")) 
            {
                break;
            }
            if (capitalFromUser.equals(answer)) 
            {
                System.out.println("���� ^_^\n");
            } 
            else {
                System.out.println("���� ��_��\n");
            }
        }
    }

    // ������ �����ϴ� �޼���
    public void run() {
        System.out.println("[ === ���� ���߱� ���� === ]");
        while (true) 	
        {
        	System.out.println("[ ���� �߰� : 1 ]  [ ���� Ǯ�� : 2 ] [���� : 3]");
            System.out.print("����� ����� �Է��ϼ��� >> ");
            int select = sc.nextInt();
            switch (select)
            {
                case 1:
                    insert();
                    break;
                case 2:
                    play();
                    break;
                case 3:
                    sc.close();
                    System.out.println("������ �����մϴ�.");
                    return;
            }
        }
    }

    // ���� �޼���
    public static void main(String[] args) {
        QuizVector quiz = new QuizVector();
        quiz.run();
    }
}

