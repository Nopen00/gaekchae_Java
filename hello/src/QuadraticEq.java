
import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		float a= 1;
		float b, c;
		double dum1;
		double root1,root2;
		
		System.out.print("B값을 입력하시오: ");
		b= input.nextFloat();
		
		System.out.print("C값을 입력하시오: ");
		c= input.nextFloat();
		
		dum1 = b*b-4*a*c;
		if (dum1<0) {
			System.out.print("해가 실수가 아닙니다.");
		}
		
		root1 = (-b+Math.sqrt(dum1))/(2*a);
		root2 = (-b-Math.sqrt(dum1))/(2*a);
		
		System.out.printf("근은 %.2f, %.2f입니다.",root1,root2);
	}

}
