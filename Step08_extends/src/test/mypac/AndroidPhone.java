package test.mypac;

public class AndroidPhone extends HandPhone {
	
	//생성자
	public AndroidPhone() {
		System.out.println("AndroidPhone 생성자가 호출됨");
		
	}
	//method
	public void doInternet() {
		System.out.println("인터넷을 사용해요!");
	}
	//아래의 @Override 는 해당 메소드가 재정의 되었다고 단순히 표시하는 용도이며 특별한 기능을 가지지는 않는다.
	@Override
	public void takePicture() {
		System.out.println("1000만 화소의 사진을 찍어요!");
	}
	@Override
	public void mobilecall() {
		System.out.println("누워서 전화를 걸어요~");
	}
}
