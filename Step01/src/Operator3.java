
public class Operator3 {
	/*
	 * 증감 연산자
	 * 		변수에 있는 값을 1씩 증가, 1씩 감소
	 * 		++			--
	 * 		변수++ --> 후위형 : 변수가 포함된 일을 먼저 실행한 후 증가
	 * 		++변수 --> 전위형 : 변수를 먼저 증가 후 일을 실행
	 */
	public static void main(String[] args) {
		int n1 = 10;
		
		System.out.println(n1);//10
		System.out.println(n1++);//10
		System.out.println(n1);//11
		
		int n2 = 10;
		
		System.out.println(n2); //10
		System.out.println(++n2); //11
		System.out.println(n2); //11
		
		int n3 = 10;

		int result = n3++ + 10 + ++n3 - 2;
		System.out.println(result);//30
	}

}




