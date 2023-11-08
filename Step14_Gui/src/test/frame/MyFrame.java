package test.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{

	public MyFrame() {
		//프레임의 제목 설정
		setTitle("촐랑 프레임");
		
		//setBounds(x,y,width,height) 창의 위치와 크기 설정
		setBounds(100,100,500,500);
		//이프레임(MyFrame) 의 x 버튼(close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정.
		//setDefaultCloseOperation(3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//레이아웃 매니저는 아직 사용하지 않겠다(모든 UI  를 절대 좌표에 배치 하겠다)
		setLayout(null);
		//버튼 하나를 만들어서
		JButton btn1=new JButton("버튼1");
		//위치를 설정하고(x,y)
		btn1.setLocation(10,10);
		//크기도 설정하고(width,height)
		btn1.setSize(100,30);
		//프레임에 추가 하기
		this.add(btn1);
		
		JButton btn2=new JButton("버튼 2");
		
		btn2.setLocation(120, 10);
		btn2.setSize(100,30);
		add(btn2);
		//버튼에 등록할 엑션리스너 객체의 참조값을 얻어내서 listener 지역변수에 참조값을 담기
		ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1");
				
				//알림창 띄우기 .showMessageDiaLog (띄울 프레임의 참조값,뛰울 문자열)
				JOptionPane.showMessageDialog(MyFrame.this, "버튼1입니다");
			}
		};
		ActionListener listener2=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼2");
				
				JOptionPane.showMessageDialog(MyFrame.this, "버튼2입니다");
			}
			
		};
		
		
		//버튼을 눌렀을때 실행할 메소드를 가지고 이쓴 객체를 ㅈㄴ달해 준다.
		btn1.addActionListener(listener);
		btn2.addActionListener(listener2);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MyFrame();
		System.out.println("main 메소드가 종료 됩니다.");

	}

}
