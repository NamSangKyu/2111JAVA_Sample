import java.util.Scanner;

public class ScoreIf {

	public static void main(String[] args) {
		/*
		 * 점수하나  입력 받아서
		 * 각 점수에 해당하는 성적 등급을 출력
		 * 			등급
		 * 100 ~ 90  A
		 *  89 ~ 80  B
		 *  79 ~ 70  C
		 *  69 ~ 60  D
		 *  59 ~ 00  F
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		if(score >= 90)
			System.out.println("A");
		else if(score >= 80)
			System.out.println("B");
		else if(score >= 70)
			System.out.println("C");
		else if(score >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
	}

}







