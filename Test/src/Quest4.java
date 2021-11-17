import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=0, e=9;
		int[] arr =new int[10];
		for(int i=0;i<arr.length;i++) {
			System.out.print("숫자 입력 : ");
			int temp = sc.nextInt();
			if(temp % 2 == 0)
				arr[e--]=temp;
			else
				arr[s++]=temp;
		}
		for(int i=0;i<arr.length;i++) 
			System.out.print(arr[i]+ " ");
	
	}

}
