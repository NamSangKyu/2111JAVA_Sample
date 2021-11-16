import java.util.Scanner;

public class SwitchQuest {

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
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
	}

}
