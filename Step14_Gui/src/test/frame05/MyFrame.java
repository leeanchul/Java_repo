package test.frame05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	

	public MyFrame() {
		//프레임의 제목 설정
		setTitle("촐랑 프레임");
		
		//setBounds(x,y,width,height) 창의 위치와 크기 설정
		setBounds(100,100,500,500);
		//이프레임(MyFrame) 의 x 버튼(close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정.
		//setDefaultCloseOperation(3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton sendBtn=new JButton("전송");
		JButton updateBtn=new JButton("수정");
		JButton deleteBtn=new JButton("삭제");
		
	
		
		//this (바로 이객체,MyFrame 객체) 의 type 다형성 확인
		Object a=this;
		JFrame b=this;
		MyFrame c=this;
		ActionListener d=this;
		
		
		
		sendBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		add(sendBtn);
		add(updateBtn);
		add(deleteBtn);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MyFrame();
		System.out.println("main 메소드가 종료 됩니다.");

	}
	

	//ActionListener 인터페이스를 implements 했기때문에 강제로 오버라이드 된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 액션 command 문자열을 일거온다(기본값은 버튼 text )
		String command=e.getActionCommand();
		
		if(command=="전송") {
			System.out.println("전송 합니다");
		}else if(command=="수정") {
			System.out.println("수정 합니다.");
		}else if(command=="삭제") {
			System.out.println("삭제 합니다.");
		}
		
	}


}

	
