import java.util.Scanner;

public class BreakQuest {
	/*
	 * 숫자 0을 입력할때까지 입력을 받고
	 * 0을 입력하면 더이상 입력받지 않고
	 * 입력한 숫자들의 총합을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = -1, total = 0;
		while(true) {
			System.out.println("숫자 입력");
			n = sc.nextInt();
			if(n == 0) 
				break;
			total += n;
		}
		System.out.println(total);
	}

}



