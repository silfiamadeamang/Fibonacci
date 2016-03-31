
package fibonacci;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
		Scanner show = new Scanner(System.in);
		System.out.print("Masukan Jumlah Deret Fibonacci ");
		int n = show.nextInt();
		long fibonacci[] = new long[n];
		
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(int i = 2; i < n; i++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci[i] +  " ");
		}
	}

}
