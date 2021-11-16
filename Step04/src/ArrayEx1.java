
public class ArrayEx1 {
	/*
	 *	 배열(Array)
	 *		변수명 하나로 데이터를 여러개 저장
	 *		여러개의 데이터를 특정하기 위해서 인덱스라는 번호표를 이용
	 *	 인덱스 번호는 0부터 시작 
	 */
	public static void main(String[] args) {
		//길이가 5개짜리인 배열 선언
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i=0;i<5;i++)
			System.out.println(arr[i]);
	}

}

