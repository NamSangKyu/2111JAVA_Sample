
public class Operator1 {
	/*
	 * 	사칙연산
	 * 		+ 덧셈
	 * 		- 뺄셈
	 * 		* 곱셉
	 * 		/ 나눗셈 -> 몫
	 * 		% 나눗셈 -> 나머지
	 */
	public static void main(String[] args) {
		//정수형 변수 2개 선언 - n1, n2 
		//데이터는 자유롭게 초기화
		int n1 = 10, n2 = 7; //동시에 정수형 변수를 두개 선언하겠다.
		int result = 0;
		result = n1 + n2; //n1 + n2의 결과값이 저장, n1+n2 식이 저장 X
		System.out.println(result);
		//뺄셈, 곱셈, 나눗셈
		result = n1-n2;
		System.out.println(result);
		result = n1 * n2;
		System.out.println(result);
		result = n1 / n2; //결과 : 몫
		System.out.println(result);
		result = n1 % n2; //결과 : 나머지
		System.out.println(result);
	}

}





