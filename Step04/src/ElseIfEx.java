import java.util.Scanner;

public class ElseIfEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		
		if(n == 0)
			System.out.println("입력하신 숫자는 0 입니다.");
		else if(n % 2 == 0)
			System.out.println("입력하신 숫자는 짝수 입니다.");
		else
			System.out.println("입력하신 숫자는 홀수 입니다.");
	}

}
