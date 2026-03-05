import java.util.Scanner;
import java.util.Arrays;
public class Assignment6_5 {

	public static void main(String[] args) {
		System.out.print("Enter Array length: ");
		Scanner Input = new Scanner(System.in);
		int len = Input.nextInt();
		int[] A = new int[len];
		System.out.print("Enter Array Elements: ");
		for(int i=0;i<len;i++) {
			A[i] = Input.nextInt();
		}
		//bubble sort for simplicity
		for(int i=0;i<len;i++) {
			for(int j=0;j<i;j++) {
				if(A[j] > A[i]) {
					int temp = A[j];
					A[j] = A[i];
					A[i] = temp;
				}
			}
		}
		//
		System.out.println(Arrays.toString(A));
	}

}
