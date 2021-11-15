import java.util.Scanner;

public class ForQuest4 {
	/*
	 * 숫자 0을 입력할때까지 입력을 받고
	 * 0을 입력하면 더이상 입력받지 않고
	 * 입력한 숫자들의 총합을 출력
	 */
	public static void main(String[] args) {
		int total = 0, num = -1;
		
		Scanner sc = new Scanner(System.in);
		
		for( ;num!=0; ) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			total += num;
		}
		System.out.println("입력하신 숫자들의 총합 : "+total);
	}

}




