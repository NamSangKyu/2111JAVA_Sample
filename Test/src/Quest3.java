import java.util.Scanner;

public class Quest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max, min, total;
		int[] arr =new int[10];
		for(int i=0;i<arr.length;i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		max = min = total = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
			total += arr[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(total);
	
	}

}
