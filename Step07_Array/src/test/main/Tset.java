package test.main;
import java.util.Scanner;

public class Tset {
	public int a;
	public String [] b;
	Scanner ac=new Scanner(System.in);
	
	public Tset(int a) {
		this.a=a;
		String [] b= new String[this.a];
		Scanner ac=new Scanner(System.in);
	}
	public void ac() {
		for(int i=0;i<a; i++) {
		b[i]=ac.next();
		System.out.println((i+1)+"이름을 입력하세요:"+b[i]);
		}
	}
}
