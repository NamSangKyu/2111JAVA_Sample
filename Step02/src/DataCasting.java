
public class DataCasting {

	public static void main(String[] args) {
		//자동 형변환
		int r = 5;
		float area = r * r * 3.1415f;
		
		System.out.println(area);
		
		//강제로 형변환
		int a = (int)area;
		System.out.println(a);
	}

}


