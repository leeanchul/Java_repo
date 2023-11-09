package test.frame06;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	JTextField inputMsg;
	JLabel label;
	public MyFrame(String title) {
		super(title);
		
		
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//문자열을 한줄 입력 받을수 있는 JTextField 객체 생성
		inputMsg=new JTextField(20);
		JButton sendBtn=new JButton("전송");
		JButton sendBtn2=new JButton("전송");
		label=new JLabel("...");	
		
		/*
		 * JTextField 에 문자열을 입력하고 전송버튼을 누르면
		 * 1.입력한 문자열이 콘솔창에 출력되도록 해 보세요
		 * 2.입력한 문자열이 알림창에 출력되도록 해 보세유~
		 * 
		 */
		
		sendBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String msg=inputMsg.getText();
				System.out.println("버튼1에서누름"+msg);
				JOptionPane.showMessageDialog(MyFrame.this, "버튼1에서누름"+msg);
				label.setText("버튼1에서누름"+msg);
			}
		});
		
		sendBtn2.addActionListener(this);
			
		add(inputMsg);
		add(sendBtn);
		add(sendBtn2);
		add(label);
		//this.setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame f=new MyFrame("나의 프레임 6");
		f.setVisible(true);
	}
	
	//ActionListener 인터페이스를 implements 했기떄문에 강제로 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=inputMsg.getText();
		System.out.println("버튼2에서누름"+msg);
		JOptionPane.showMessageDialog(this, "버튼2에서누름"+msg);
		label.setText("버튼2에서누름"+msg);
	}
}
