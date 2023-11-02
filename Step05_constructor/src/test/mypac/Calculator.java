package test.mypac;

import test.mypac.Bnum;

public class Calculator {
	private int num1;
	private int num2;
	private Bnum b;
	
	
	public Calculator(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public Calculator(Bnum b) {
		this.b=b;
		b.result();
	}
	
	public void result() {
		int result=num1+num2;
		System.out.println("결과:"+num1+"+"+num2+"="+result);
	}
}
