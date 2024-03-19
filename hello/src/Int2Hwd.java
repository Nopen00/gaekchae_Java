import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String x;
		
		System.out.print("한글로 숫자를 입력하시오: ");
		x= input.next();
		
		switch(x){
		case "영":
			System.out.print("0");
			break;
		case "하나","일","첫째":
			System.out.print("1");
			break;
		case "둘","둘째","이":
			System.out.print("2");
			break;
			
		}
	}

}
