import java.util.Scanner;

public class DoWhileQuest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, total = 0;
		do{
			System.out.println("숫자 입력");
			n = sc.nextInt();
			total += n;
		}while(n != 0);
		System.out.println(total);

	}

}
