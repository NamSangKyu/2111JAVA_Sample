
public class Variable {
	/*
	 * 	변수(Variable) 
	 * 		하나의 공간에 값을 하나만 저장
	 *  변수를 만들려면 어떤 데이터 타입으로 저장하고 이름을 지정해야함
	 * 
	 *  데이터타입 변수명;
	 *  
	 *  ※변수명 지을때 주의 사항
	 *  1. 알파벳 대소문자, 숫자, _, $만 사용 가능
	 *  2. 동일한 변수명 X
	 *  3. 변수명 첫글자로는 숫자가 올수가 없음
	 *  4. 키워드 사용할수 없음(키워드와 동일하면 안됨)
	 *  5. 대소문자 구분함
	 *  
	 *  다음중 올바른 변수명이 아닌것은?
	 *  	_std_num 	(O)
	 *  	$test		(O)
	 *  	num1		(O)
	 *  	1_student	(X)
	 */
	public static void main(String[] args) {
		int num;//정수형으로 변수를 num이라는 이름으로 하나 만듬
		num = 30;//변수 num에 30을 저장
		num = 20;//변수 num에 20을 저장
		System.out.println(num);//num이 저장하고 있는 값 20을 꺼내서 출력
	}

}


