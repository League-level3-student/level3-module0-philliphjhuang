package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] arr = new String[5];
		// 2. print the third element in the array
		System.out.println(arr[3]);
		// 3. set the third element to a different value
		arr[3] = "Hi";
		// 4. print the third element again
		System.out.println(arr[3]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for(int i = 0; i<arr.length;i++) {
			arr[i]="Hey";

		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		// 7. make an array of 50 integers
		int[]arrayInt=new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for(int i = 0;i<arrayInt.length;i++) {
			int r = rand.nextInt(1000);
			arrayInt[i]=r;
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int minValue = arrayInt[0];
		for(int i = 0; i<arrayInt.length;i++) {
			if(arrayInt[i]<minValue) {
				minValue=arrayInt[i];
			}
		}
		System.out.println(minValue+"\n");
		
		// 10 print the entire array to see if step 8 was correct
		for(int i = 0; i<arrayInt.length;i++) {
			System.out.println(arrayInt[i]);
		}
		// 11. print the largest number in the array.
		int maxValue = arrayInt[0];
		for(int i = 0; i<arrayInt.length;i++) {
			if(arrayInt[i]>minValue) {
				maxValue=arrayInt[i];
			}
		}
		System.out.println("\n"+maxValue);
		// 12. print only the last element in the array
		System.out.print("\n"+arrayInt[arrayInt.length-1]);
	}
}
