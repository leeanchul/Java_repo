package test.mypac;

public class Bnum {
	private double bnum1;
	private double bnum2;
	
	public Bnum(double num1,double num2) {
		this.bnum1=num1;
		this.bnum2=num2;
	}
	public void result() {
		double result= bnum1+bnum2;
		System.out.println("결과:"+bnum1+"+"+bnum2+"="+result);
	}
}
