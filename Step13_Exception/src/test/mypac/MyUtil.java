package test.mypac;

import java.util.ArrayList;
import java.util.List;

public class MyUtil {
	
	public static void sendMessage(String msg) {
		List<String> no=new ArrayList<>();
			no.add("바보");
			no.add("김구라");
			no.add("원숭이");
			no.add("해골");
			//전송할 문자열에 금지어가 있는지 확인하기	
			
			//for문 ,확장 for문 ,forEach 문을 사용할 수 있다.
			for(String tmp:no) {
			if(msg.contains(tmp)) {
			//예외 발생 시키기
			throw new WordFilterException(tmp+"는 금지된 단어입니다.");	
			}
			}
			System.out.println(msg+"을(를) 전송했어요!");
		
	}
	
	//5 초가 걸리는 가상의 그림을 그리는 메소드
	public static void draw() {
		System.out.println("5초 동안 그림을 그려요 ...");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("그림 완성!");
		
	}
	//5초가 걸리는 가상의 전송을 하는 메소드
	public static void send() throws InterruptedException {
		System.out.println("5초 동안 전송을 해요...");
		
		Thread.sleep(5000);
		
		System.out.println("전송 완료");
	}
}
