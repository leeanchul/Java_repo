package test.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		
		Calc add1=new Calc() {
			
			@Override
			public double excute(double num1, double num2) {
				
				return num1+num2;
			}
		};
		double result=add1.excute(10, 20);
		
		//매개변수의 type 은 선언할 필요가 없다, 매개변수의 갯수만 맞으면 됨!
		Calc add2=(num1,num2)->{
			return num1+num2;
		};
		
		//중괄호 안에서 따로 실행할 code 가 없다면 중괄호 생략, return 예약어 생략 후 리턴할 값만 명시하면된다.
		Calc add3=(num1,num2)->num1+num2; //한줄짜리 함수모양 => 람다식
		
		Calc add=(a,b)->a+b;
		Calc sub=(a,b)->a-b;
		Calc mul=(a,b)->a*b;
		
		double result2=add.excute(11, 20);
		double result3=sub.excute(100, 20);
		double result4=mul.excute(10, 20);
		
		System.out.println(result);
	}
}
