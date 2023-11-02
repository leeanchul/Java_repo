package test.mypac;

public class Lol {
	protected String name;
	
	public Lol(String name) {
		this.name=name;
	}
	public void margin() {
		System.out.println(name+"티어 테두리를 받았어요");
	}
	
	public void box() {
		System.out.println(name+"스킨 상자를 받았어요");
	}
	
	public void Reword() {
		System.out.println(name+"보상을 받았어요");
	}
}
