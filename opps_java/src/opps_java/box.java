package opps_java;
import java.util.Scanner;
public class box {
		double length;double width;double height;
		box(double l,double w,double h){
			length=l;
			width=w;
			height=h;
		}
		double volume() {
			return length*width*height;
			
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Width");
	      double width=sc.nextInt();
	      System.out.println("height");
	      double height=sc.nextInt();
	      System.out.println("length");
	      double length=sc.nextInt();
	      box obj=new box(width,height,length);
	      
	      System.out.println(obj.volume());
		}

	}

