import java.util.Scanner;

public class AreaTeat {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.141592;
		double radius, area;
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		radius= input.nextInt();
		
		area = radius* radius * PI;
		
		System.out.println("반지름이"+radius+"인 원의 면적은"+area+"입니다.");
		//pritn에 ln을 붙이면 기본적으로 줄바꿈이 들어간다
	}
}
