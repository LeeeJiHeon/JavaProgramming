package week_14;

import java.util.Scanner;
import java.util.Vector;

public class QuizVector {
	private Scanner sc = new Scanner(System.in);
	private Vector<Nation> nations = new Vector<Nation>();
	private Vector<Quiz> quizQuestions = new Vector<Quiz>();

    public QuizVector() {
	    nations.add(new Nation("대한민국", "서울"));
	    nations.add(new Nation("프랑스", "파리"));
	    nations.add(new Nation("일본", "도쿄"));
	    nations.add(new Nation("중국", "베이징"));
	    nations.add(new Nation("러시아", "모스크바"));
	    nations.add(new Nation("독일", "베를린"));
	    nations.add(new Nation("스페인", "마드리드"));
	    nations.add(new Nation("영국", "런던"));
	    nations.add(new Nation("그리스", "아테네"));

	    // 퀴즈 추가
	    for (int i = 0; i < nations.size(); i++) 
	    {
	        Nation nation = nations.get(i);
	        quizQuestions.add(new Quiz(nation.getCountry(), nation.getCapital()));
	    }
    }

    // 특정 국가가 있는지 확인하는 메소드
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

    // 사용자로부터 국가와 수도를 입력받아 국가 벡터에 추가하는 메서드
    public void insert() {
    	System.out.println("\n[ ========== 등록된 국가와 수도 ========== ]");
    	for (int i = 0; i < nations.size(); i++) 
    	{
            Nation nation = nations.get(i);
            System.out.println(nation.getCountry() + " : " + nation.getCapital());
    	}
        System.out.println("[ ======================================= ]");
        System.out.println("현재 " + nations.size() + "개의 국가와 수도가 등록되어 있습니다.\n ");
        
        while (true) 
        {
            System.out.print("국가와 수도를 입력하세요 >> (종료 시, '종료' 입력): ");
            
            String country = sc.next();
            if (country.equals("종료")) 
            {
                break;
            }
            String capital = sc.next();

            // 국가가 이미 존재하는지 확인하고 중복된 경우, 메시지 출력
            if (contains(country)) 
            {
                System.out.println(country + "은 이미 등록되어 있습니다.");
                continue;
            }

            // 국가 및 수도를 벡터에 추가
            nations.add(new Nation(country, capital));
            quizQuestions.add(new Quiz(country, capital));
		}
    }

    // 퀴즈를 플레이하는 메서드
    public void play() {
        while (true) 
        {
            // 랜덤하게 국가 하나를 선택
            int index = (int) (Math.random() * quizQuestions.size());
            Quiz quizQuestion = quizQuestions.get(index);
            String question = quizQuestion.getQuestion();
            String answer = quizQuestion.getAnswer();

            // 문제와 정답 여부 출력
            System.out.print("\n[" + question +"]" + "의 수도를 입력하세요 >> ");

            String capitalFromUser = sc.next(); // 사용자 입력
            if (capitalFromUser.equals("종료")) 
            {
                break;
            }
            if (capitalFromUser.equals(answer)) 
            {
                System.out.println("정답 ^_^\n");
            } 
            else {
                System.out.println("오답 ㅠ_ㅠ\n");
            }
        }
    }

    // 게임을 실행하는 메서드
    public void run() {
        System.out.println("[ === 수도 맞추기 게임 === ]");
        while (true) 	
        {
        	System.out.println("[ 퀴즈 추가 : 1 ]  [ 퀴즈 풀이 : 2 ] [종료 : 3]");
            System.out.print("사용할 기능을 입력하세요 >> ");
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
                    System.out.println("게임을 종료합니다.");
                    return;
            }
        }
    }

    // 메인 메서드
    public static void main(String[] args) {
        QuizVector quiz = new QuizVector();
        quiz.run();
    }
}

