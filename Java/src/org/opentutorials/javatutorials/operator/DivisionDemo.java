package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b);
		System.out.println(c/d);
		// a는 int d는 float이지만 더 세밀한 쪽으로 계산 되기 때문에 c/d와 같은 값이 나오게 된다.
		System.out.println(a/d);
		
	}

}
