package test.mypac;

@FunctionalInterface  //인터페이스에서 추상메소드를 오직 하나만 있어야 한다. 여러개 만들면 문법적으로 에러가 난다.( ()->{} 형태 보장)
public interface Calc {
	//메소드로 두개의 실수를 전달 받아서 어떤 연산을 하고 결과 값을 리턴해주는 메소드
	//어던 연산을 할지는 개발자가 알아서 정하기
	public double excute(double num1,double num2);
	
}
