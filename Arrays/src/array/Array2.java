package array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] numbers = {15, 28, 6, 49, 3, 90, 12};

		        // Assume first element is both max and min
		        int max = numbers[0];
		        int min = numbers[0];

		        // Loop through the array to find max and min
		        for (int i = 1; i < numbers.length; i++) {
		            if (numbers[i] > max) {
		                max = numbers[i];
		            }
		            if (numbers[i] < min) {
		                min = numbers[i];
		            }
		        }

		        // Print the results
		        System.out.println("Maximum value: " + max);
		        System.out.println("Minimum value: " + min);
		    }
		}


	


