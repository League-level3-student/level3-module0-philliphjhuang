package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] names = new String[10];
		names[0]="0";
		names[1]="1";
		names[2]="2";
		names[3]="3";
		names[4]="4";
		names[5]="5";
		names[6]="6";
		names[7]="7";
		names[8]="8";
		names[9]="9";
		printArray(names);
			System.out.println("\n");
		printReverse(names);
			System.out.println("\n");
		printEveryOtherArray(names);
			System.out.println("\n");
		printRandomArray(names);
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
		public static void printArray(String[] names) {
			for(int i = 0; i<names.length;i++) {
				System.out.print(names[i]);
			}
		}
		
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
		public static void printReverse(String[] names) {
			for(int i = 0; i<names.length;i++) {
				System.out.print(names[names.length-i-1]);
			}
		}
	//4. Write a method that takes an array of Strings and prints every other String in the array.
		public static void printEveryOtherArray(String[] names) {
			for(int i = 0; i<names.length;i+=2) {
				System.out.print(names[i]);
			}
		}
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
		public static void printRandomArray(String[] names) {
			Random y = new Random();
			int x = 0;
			for(int i = 0;i<names.length;i++) {
				x=y.nextInt(names.length-1);
				System.out.print(names[x]);
			}
		}
}
