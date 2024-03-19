
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int year;
		
		
		System.out.print("연도를를 입력하시오: ");
		year= input.nextInt();
		
		if(year%4==0) {
			System.out.print(year+"년은 윤년 입니다.");
		}
		else {
			System.out.print(year+"년은 윤년이 아닙니다.");
		}

	}

}
