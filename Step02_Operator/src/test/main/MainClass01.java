package test.main;
/*
 * 1.산술연산자 테스트
 * 
 * +,-,*,/,%
 */
public class MainClass01 {
	//run (실행,app 을 launch) 했을때 실행의 흐름이 시작도니는 특별한 main 메소드
	public static void main(String[] args) {
		int num1=5;
		int num2=2;
		//연산 하기
		int sum=10+1;
		int sum2=num1+num2;
		int sum3=10+num2;
		//정수끼리 연산하면 결과는 정수만 나온다
		int result=5/3;
		int resutl2=num1/num2;
		//연산의 결과로 실수 값을 얻어내고 싶으면 적어도 하나는 실수여야 한다.
		double resutl3=5/3.0;
		double result4=num1/(double)num2;
		//앞에 있는 수를 뒤에 있는 수로 나눈 나머지 값을 얻어낸다.
		int result5=num1%num2;
	}

}
