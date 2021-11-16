import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		
		System.out.println("1. 블랙커피");
		System.out.println("2. 설탕커피");
		System.out.println("3. 밀크커피");
		System.out.print("원하시는 메뉴를 선택하세요 : ");
		no = sc.nextInt();
		
		switch(no) {
		case 3:
			System.out.println("프림");
		case 2:
			System.out.println("설탕");
		case 1:
			System.out.println("커피가루");
		default:
			System.out.println("뜨거운물");
		}
		System.out.println("커피가 나왔습니다.");
	}
}
