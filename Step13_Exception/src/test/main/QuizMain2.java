package test.main;

/*
 * run 했을때 콘솔창에 경과 시간이 출력되는 프로그래밍을 해 보세요
 * 0 분 1초
 * 0 분 2초
 * 0 분 3초
 * -
 * -
 * 0 분 59초
 * 1 분 0초
 * 1 분 1초
 * -
 * -
 * -*/
public class QuizMain2 {

	public static void main(String[] args) {
		int m=0;
		int s=1;
		try {
		while(true) {
			System.out.println(m+"분"+s+"초");
			s++;
			Thread.sleep(1000);
			if(s==60) {
				m++;
				s=0;
			}
		}
		}catch(Exception e) {
			
		}
	}

}