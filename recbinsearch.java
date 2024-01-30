package binsearch;

import java.util.Arrays;
import java.util.Scanner;

public class recbinsearch {
	public static void main(String[] args) {
		Scanner scanobs = new Scanner(System.in);
		
		System.out.println("What do you want to search for?");
		int O = scanobs.nextInt();
		
		System.out.println("in an array of size:");
		int arrlen = scanobs.nextInt();
		
		int[] A; A = new int[arrlen];
		System.out.println("Enter the array elements in order separated by whitespace:");
		for (int i = 0; i < arrlen; i++) {
			A[i] = scanobs.nextInt();
		}
		
//		for (int n : A) {
//			System.out.print(n+" ");
//		}
		
		scanobs.close();
		
		recbinsearch instance = new recbinsearch();
		
		System.out.println(instance.bs(A,O));
	}
	
	int i = 0, d = -1, cutoff;
	private int bs(int[] arr, int obj) {
//		for (int dn : arr) {
//			System.out.print(dn+" ");
//		} System.out.print('\n');
		
		cutoff = (arr.length%2 == 0) ? arr.length/2-1 : (arr.length-1)/2;
//		System.out.println(cutoff);
		
		i += (d==-1) ? cutoff : ((d==1) ? cutoff+1 : cutoff-arr.length+1);
		if (arr[cutoff] == obj) return i;
		
		d = (arr[cutoff] < obj) ? 1 : 0;
		return bs(((d==0) ? Arrays.copyOfRange(arr, 0, cutoff+1) : Arrays.copyOfRange(arr, cutoff+1, arr.length-1)), obj);
	}
}
