import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자하나 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
			if(n % i == 0)
				System.out.println(i);
		}
	}

}
