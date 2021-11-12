import java.util.Scanner;

public class InputNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//최초 한번만 선언
		
		System.out.println("숫자하나 입력하세요");
		int n = sc.nextInt();//입력받는 부분
		
		System.out.println("입력받은 숫자 : " + n);
	}

}
