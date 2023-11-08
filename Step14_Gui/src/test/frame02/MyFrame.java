package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{

	public MyFrame() {
		//프레임의 제목 설정
		setTitle("촐랑 프레임2");
		
		//setBounds(x,y,width,height) 창의 위치와 크기 설정
		setBounds(100,100,500,500);
		//이프레임(MyFrame) 의 x 버튼(close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정.
		//setDefaultCloseOperation(3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//FlowLayout 매니저 사용해보기.
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btn1=new JButton("버튼1");
		add(btn1);
		
		JButton btn2=new JButton("버튼1");
		add(btn2);
		
		JButton btn3=new JButton("버튼1");
		add(btn3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MyFrame();
		System.out.println("main 메소드가 종료 됩니다.");

	}

}
