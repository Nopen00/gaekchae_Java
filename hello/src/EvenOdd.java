
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int value;
		System.out.print("숫자를 입력하세요.");
		value = input.nextInt();
		
		if (value%2==0) {
			System.out.printf("숫자 %d는 짝수입니다.",value);
		}
		else {
			System.out.printf("숫자 %d는 홀수입니다.",value);
		}
	}

}
