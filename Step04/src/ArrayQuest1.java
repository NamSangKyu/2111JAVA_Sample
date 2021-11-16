import java.util.Scanner;

public class ArrayQuest1 {

	public static void main(String[] args) {
		/*
		 * 정수형 배열 길이가 10개인 배열 선언
		 * 배열에 숫자를 전부 입력
		 * 배열에 입력된 숫자들을 전부 출력
		 */
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}

}
