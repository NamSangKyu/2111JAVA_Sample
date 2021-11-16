
public class BreakEx {

	public static void main(String[] args) {
		int i = 1, total = 0;
		
		while(true) {
			total += i;
			i++;
			if(total > 5000)
				break;//break를 감싸고 있는 반복문 하나를 강제 종료
		}
		System.out.println(total);
	}

}
