
public class WhileInWhile {

	public static void main(String[] args) {
		int dan = 2, is = 1;
		
		while(dan < 10) {
			is=1;
			while(is<10) {
				//2 * 1 = 2
				System.out.println(dan + " * " + is + " = "+ dan * is);
				is++;
			}			
			dan++;
		}
	}

}
