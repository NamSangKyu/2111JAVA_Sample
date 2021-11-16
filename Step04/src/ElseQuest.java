import java.util.Scanner;

public class ElseQuest {

	public static void main(String[] args) {
		/*
		 * 	숫자 두개 입력을 받고
		 *  두숫자의 뺄셈 결과가 무조건 양수가 나오게끔 처리
		 *             
		 *               결과
		 *  5 3 입력  ---> 2
		 *  3 5 입력  ---> 2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		
		if(n1 < n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;			
		}
		
		System.out.println(n1 - n2);
			
	}

}







