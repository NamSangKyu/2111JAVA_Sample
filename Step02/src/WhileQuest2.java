import java.util.Scanner;

public class WhileQuest2 {
	/*
	 * 숫자 하나를 입력 받은 뒤
	 * 입력받은 숫자만큼 Hello World를 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나 입력");
		int n = sc.nextInt();
		
		while(n>0) {
			System.out.println("Hello World");
			n--;
		}
	}

}



