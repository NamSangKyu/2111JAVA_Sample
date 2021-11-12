
public class WhileQuest3 {
	/*
	 * 	1~100까지 숫자의 합을 출력 
	 */
	public static void main(String[] args) {
		int i = 1, total = 0;
		while(i<101) {
			total += i;
			i++;
		}
		System.out.println(total);
	}

}
