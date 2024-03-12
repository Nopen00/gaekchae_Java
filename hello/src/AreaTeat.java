
public class AreaTeat {

	public static void main(String[] args) {
		
		final double PI = 3.141592;
		double radius, area;
		radius = 3.0;
		area = radius* radius * PI;
		
		System.out.println("반지름이"+radius+"인 원의 면적은"+area+"입니다.");
		//pritn에 ln을 붙이면 기본적으로 줄바꿈이 들어간다
	}
}
