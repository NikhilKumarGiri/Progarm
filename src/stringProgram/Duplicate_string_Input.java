package stringProgram;

import java.util.Scanner;

public class Duplicate_string_Input {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Take input of string array
			System.out.print("Enter the size of array: ");
			int size = scanner.nextInt();
			String[] arr = new String[size];
			System.out.println("Enter the elements of array:");
			for (int i = 0; i < size; i++) {
			    arr[i] = scanner.next();
			}
			
			// Find duplicates using for loop
			boolean hasDuplicate = false;
			for (int i = 0; i < size; i++) {
			    for (int j = i + 1; j < size; j++) {
			        if (arr[i].equals(arr[j])) {
			            System.out.println("Duplicate element found: " + arr[j]);
			            hasDuplicate = true;
			        }
			    }
			}
			
			if (!hasDuplicate) {
			    System.out.println("No duplicates found.");
			}
		}
       
    }

}
