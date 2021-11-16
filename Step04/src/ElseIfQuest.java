import java.util.Scanner;

public class ElseIfQuest {

	public static void main(String[] args) {
		/*
		 * 	입장료 계산 프로그램을 작성
		 *  나이를 입력 받아서
		 *  나이에 해당하는 입장료를 출력
		 *  
		 *  0세~7세 무료
		 *  8세~19세 1000원
		 *  20세~59세 1500원
		 *  60세~??? 1200원
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age < 8)
			System.out.println("입장료는 무료입니다.");
		else if(age < 20)
			System.out.println("입장료는 1000원입니다.");
		else if(age < 60)
			System.out.println("입장료는 1500원입니다.");
		else
			System.out.println("입장료는 1200원입니다.");
			
		
		
	}

}




