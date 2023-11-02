package test.main;

public class MainClass03 {
/*
 * 3.비교연산자 테스트
 * 비교연산의 결과는 boolean type 을 리턴해준다
 * ==,!=,>,>=,<,<=
 */
	public static void main(String[] args) {
	
		boolean resutl1=10==10; //true
		boolean resutl2=10!=10; //false
		boolean resutl3=10 >100; //false
		boolean resutl4=10 >=10; //true
		boolean resutl5=10 <100; //true
		boolean resutl6=10 <=10; //true
		
		//String type 변수 name 에 null 대입하기
		String name=null;
		
		//null 인지 아닌지 비교가 가능하다 (즉 java 에서 null 값은 비교가 가능)
		boolean resutl7 = name==null; //true
		boolean resutl8= name !=null; //false
		}
}
