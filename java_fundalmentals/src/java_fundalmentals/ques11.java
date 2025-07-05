package java_fundalmentals;
import java.util.Scanner;
public class ques11 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char code=sc.next().charAt(0);
		switch(code) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'o':
			System.out.println("orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invaild code");
				}
	}
}

		




