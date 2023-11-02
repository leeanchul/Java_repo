package test.mypac;

public class Challenger extends Gold{
	
	public Challenger(String name) {
		super(name);
		
	}


	@Override
	public void margin() {
		System.out.println("*"+name+"님* 이중 테투리 보상을 받았어요");
	}
	
	
	public void Propsal() {
		System.out.println("*"+name+"님* 프로 제의가 들어왔어요!");
	}
}
