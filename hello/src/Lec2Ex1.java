import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		x= input.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오: ");
		y= input.nextInt();
		
		if(x>y) {
			System.out.printf("숫자 %d가 더 큽니다.",x);
		}
		else if(x<y) {
			System.out.printf("숫자 %d가 더 큽니다.",y);
		}
		else {
			System.out.printf("두 숫자가 같습니다.");
		}
		
	}

}
