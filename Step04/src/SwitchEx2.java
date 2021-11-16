import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("One");
		case 2:
			System.out.println("Two");
		case 3:
			System.out.println("Three");
		default:
			System.out.println("None");
		}
	}

}
