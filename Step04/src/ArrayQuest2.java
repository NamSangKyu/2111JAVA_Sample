import java.util.Scanner;

public class ArrayQuest2 {

	public static void main(String[] args) {
		/*
		 * 정수형 배열 길이가 10인 배열을 생성
		 * 배열에 내용을 전부 입력 받은 후
		 * 3의 배수 합을 출력
		 */
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int total = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 3 == 0)
				total += arr[i];
		}
		
		System.out.println("3의 배수의 합 : " + total);
	}

}




