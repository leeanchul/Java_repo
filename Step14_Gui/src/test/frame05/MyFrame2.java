package test.frame05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame2 extends JFrame implements ActionListener{
	
	JButton sendBtn,updateBtn,deleteBtn;
	
	public MyFrame2() {
		//프레임의 제목 설정
		setTitle("촐랑 프레임");
		
		//setBounds(x,y,width,height) 창의 위치와 크기 설정
		setBounds(100,100,500,500);
		//이프레임(MyFrame) 의 x 버튼(close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정.
		//setDefaultCloseOperation(3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		sendBtn=new JButton("전송");
		sendBtn=new JButton("수정");
		sendBtn=new JButton("삭제");
		
		//버튼 클릭시 this myframe 객체에게 전달
		sendBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		
		//버튼을 프레임에 추가한것
		add(sendBtn);
		add(updateBtn);
		add(deleteBtn);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MyFrame2();
		System.out.println("main 메소드가 종료 됩니다.");

	}
	//위와 동일한 동작을 아래의 메소드가 리턴해주는 Object 의 참조값(JButton 의 참조값)을
	//활용하는 구조로 MyFrame 클래스를 수정해 보세요.

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
	
		if(obj == this.sendBtn) {
			System.out.println("전송 합니다");
		}else if(obj==this.updateBtn) {
			System.out.println("수정 합니다.");
		}else if(obj==this.deleteBtn) {
			System.out.println("삭제 합니다.");
		}
	}

	
}
