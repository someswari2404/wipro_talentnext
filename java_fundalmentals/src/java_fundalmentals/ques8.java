package java_fundalmentals;
import java.util.Scanner;
public class ques8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		char c=sc.next().charAt(0);
		if((c>='a'&&c<='z')||(c>='A' && c<='Z')){
			System.out.println("Alphabet");
			
		}
		else if(c>=0 && c<=9) {
			System.out.println("Digit");
			
		}
		else {
			System.out.println("Special character");
		}
	}

}