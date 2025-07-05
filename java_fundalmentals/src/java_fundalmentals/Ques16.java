package java_fundalmentals;
import java.util.*;
public class Ques16 {
public static void main(String[] args) {
	for(int i=10;i<=99;i++) {
		if(isPrime(i)) {
			System.out.println(i+" ");
			
		}
	}
}

public static boolean isPrime(int num) {
	if(num<2)
	return false;
	for(int i=2;i<=Math.sqrt(num);i++) {
		if(num%i==0)
			return false;
	}
	return true;
}
}

