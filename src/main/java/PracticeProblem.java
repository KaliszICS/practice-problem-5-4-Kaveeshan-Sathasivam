/*File: Practice Problem 5.4
Author: Kaveeshan Sathasivam
Date Created: May 4th, 2026
Date Last Modified: May 4th, 2026
*/
public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static void stringSwap(String[] arr, int i, int j) {
   		String temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
	public static void reverse(int[] arr) {
        int temp;
        
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
	public static String[] toWordArray(String str) {
    str = str.trim();

    if (str.equals("")) {
        return new String[0]; // 
    }

    return str.split(" +");
}
}
