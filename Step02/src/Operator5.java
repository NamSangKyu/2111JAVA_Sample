
public class Operator5 {
	/*
	 *	논리연산자
	 *		AND : && ---> 양쪽의 조건식이 true일때 true, 하나라도 거짓이면 거짓
	 * 		OR  : || ---> 양쪽의 조건식중 하나라도 true 이면 true
	 * 		NOT : !  ---> true --> false, false --> true 
	 */
	public static void main(String[] args) {
		// n이 5보다 크고 20보다 작은지?
		int n = 10;
		System.out.println(n > 5 && n < 20);
		System.out.println(n == 10 || n < 5);
		boolean result = n == 10 || n < 5;
		System.out.println(!result);
		result = !result;
		System.out.println(result);
		
	}

}




