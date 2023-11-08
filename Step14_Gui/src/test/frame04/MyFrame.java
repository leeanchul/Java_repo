package test.frame04;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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
		
		//BorderLayout 메니저 사용해보기
		setLayout(new BorderLayout());
		
		JButton btn1=new JButton("버튼1");
		//프레임에 버튼 추가 하기 
		add(btn1, BorderLayout.NORTH);
		
		JButton btn2=new JButton("버튼2");
		add(btn2, BorderLayout.EAST); //프레임에 버튼 추가 하기 
      
		JButton btn3=new JButton("버튼3");
		add(btn3, BorderLayout.SOUTH); //프레임에 버튼 추가 하기 
		
		JButton btn4=new JButton("버튼4");
		add(btn4, BorderLayout.WEST); //프레임에 버튼 추가 하기 
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MyFrame();
		System.out.println("main 메소드가 종료 됩니다.");

	}

}
