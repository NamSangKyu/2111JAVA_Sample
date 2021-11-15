
public class Quest2 {
	/*
	 * 		    *
	 * 		   **
	 * 		  ***
	 * 		 ****
	 * 		*****
	 * 
	 *  	반복문 3개가 나옴
	 */
	public static void main(String[] args) {
			int i=0, j=0;
			
			while(i<5) {
				j=0;
				while(j < 5 - 1 - i) {
					System.out.print(" ");
					j++;
				}
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





