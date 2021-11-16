
public class ContinuEx {

	public static void main(String[] args) {
		/*
		 * 1~100까지 숫자들중 짝수만 출력
		 */
		for(int i=1;i<=100;i++) {
			if(i%2 == 1)
				continue;
			System.out.println(i);			
		}
	}

}
