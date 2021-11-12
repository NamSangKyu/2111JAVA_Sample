
public class ShortCircuit {

	public static void main(String[] args) {
		int n1 = 10, n2 = 4;
		boolean result = n1 > 10 && ++n2 >3;
		result = n1 == 10 || ++n2 > 3;
		System.out.println(n2);
	}

}
