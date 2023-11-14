package test.frame04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.mypac.CountRunnable;

public class MyFrame extends JFrame implements ActionListener{
	//생성자
	public MyFrame(String title) {
		super(title);
		//프레임의 초기 설정 작업하기 
		setBounds(100, 100, 500, 500);
		// 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 설정
		setLayout(new FlowLayout());
		//여기서 this 는 MyFrame 클래스로 생성된 객체의 참조값을 가리킨다.
	
		JButton startBtn=new JButton("카운트 다운");
		startBtn.addActionListener(this);
		//프레임에 버튼 추가
		add(startBtn);
		
		JTextField tf=new JTextField(10);
		//프레임에 JTextField 추가
		add(tf);
		
		// 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Thread t=new Thread(new CountRunnable());
		t.start();
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
		
			}
		});
		
		Thread t3=new Thread(()->{
			
		});
	}

	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}
