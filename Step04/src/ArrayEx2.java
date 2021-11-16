
public class ArrayEx2 {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5,6};
		int[] arr3 = new int[7];
		double[] arr4 = new double[5];
		boolean[] arr5 = new boolean[5];
		//각각의 배열 출력
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i] + " ");
		System.out.println();
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i] + " ");
		System.out.println();
		for(int i=0;i<arr4.length;i++)
			System.out.print(arr4[i] + " ");
		System.out.println();
		for(int i=0;i<arr5.length;i++)
			System.out.print(arr5[i] + " ");
		System.out.println();
	}

}
