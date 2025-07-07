package array;
import java.util.Arrays;
public class Array5 {
	    public static void main(String[] args) {
	        
	        int[] numbers = {45, 12, 67, 23, 89, 5, 90, 34};
	        Arrays.sort(numbers);
	        System.out.println("Smallest two numbers: " + numbers[0] + ", " + numbers[1]);
	        int n = numbers.length;
	        System.out.println("Largest two numbers: " + numbers[n - 2] + ", " + numbers[n - 1]);
	    }
}

