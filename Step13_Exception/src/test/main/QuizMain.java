package test.main;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * run 했을때 콘솔차에
		 * 1초
		 * 2초
		 * 3초
		 * ..
		 * .
		 * .
		 * 경과 시간이 출려되다가
		 * .
		 * .
		 * 10초
		 * 까지만 출력하고 종료되는 프로그래밍 을 해보세요*/
		try {	
			Thread t=new Thread();
			for(int i=0;i<10;i++) {
				System.out.println(i+1+"초");
				t.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
