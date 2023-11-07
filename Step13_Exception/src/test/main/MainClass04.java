package test.main;

import javax.xml.stream.util.EventReaderDelegate;

public class MainClass04 {

	public static void main(String[] args){
		System.out.println("main 메소드가 시작 됩니다.");
		
		
		try {
			//스레드를 일정시간 지연 시키긱 mili sceond 단위로 숫자를 전달하면된다.)
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}

}
