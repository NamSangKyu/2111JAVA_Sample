
public class ForQuest5 {
	// 구구단 2단부터 9단까지 출력
	public static void main(String[] args) {
		for (int dan = 2; dan < 10; dan++) {
			for (int is = 1; is < 10; is++) {
				System.out.println(dan + " * " + is + " = " + dan * is);
			}
		}
	}
}
