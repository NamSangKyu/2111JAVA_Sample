
public class Operator2 {
	/*
	 * 복합 대입 연산자
	 * 		+=  -=  *=  /=  %=  
	 * 		
	 */
	public static void main(String[] args) {
		int result = 10;

		//result와 10의 더한결과를 result에 저장
		result += 10;//result = result + 10;
		System.out.println("result : " + result);
		// -=
		result -= 4;
		System.out.println("result : " + result);	
		// *=
		result *= 3;
		System.out.println("result : " + result);
		// /=
		result /= 2;
		System.out.println("result : " + result);
		// %=
		result %= 4;
		System.out.println("result : " + result);
		
		//문자열 조립 용도로 사용함
		String tel = "010";
		tel += "-3456";
		tel += "-7890";
		System.out.println(tel);
		
		
		
		
	}

}


