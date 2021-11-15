
public class Quest1 {
	/*
	 * 		*
	 * 		**
	 * 		***
	 * 		****
	 * 		*****
	 * 
	 *  	반복문 중첩을 이용해야함
	 */
	public static void main(String[] args) {
		int i=0, j=0;
		
		while(i < 5) {
			j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}






