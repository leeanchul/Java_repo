package test.mypac;

public class FrultBox <T> {
	//필드
	private T item;
	
	

	//고일을 포장하는 메소드
	public void pack(T item) {
		this.item=item;

	}
	
	
	//과일을 꺼내는 메소드
	public T unpack() {
		return item;
	}
}
