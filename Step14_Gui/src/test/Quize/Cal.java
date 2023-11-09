package test.Quize;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Cal extends JFrame implements ActionListener{
	
	JButton add,sub,mul,div;
	JTextField first,second;
	JLabel result;
	public Cal(String title) {
		//기본설정 
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		//객체생성
		first=new JTextField(15);
		second=new JTextField(15);
		add=new JButton("+");
		sub=new JButton("-");
		mul=new JButton("*");
		div=new JButton("/");
		JLabel label=new JLabel("=");
		result=new JLabel();
		
		//버튼 클릭시 동작하는 객체
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
	
		//프레임에 추가하기
		add(first);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(second);
		add(label);
		add(result);
		
	}
	public static void main(String[] args) {
		Cal cal=new Cal("계산기");
		cal.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//클릭한 문자열 불러오기
		Object btn=e.getSource();
		//필드에 작성한 문자 불러오기
		String f=first.getText();
		String s=second.getText();
		
		
		try {
		//불러온 문자 double type 으로 변환하기
		double a =Double.parseDouble(f);
		double b=Double.parseDouble(s);
		double sum=0;
		//변환된 double type 계산해서 문자열로 변한하기

		
			if(btn==add) {
				sum=a+b;
			} else if(btn==sub) {
				sum=a-b;
			}else if(btn==mul) {
				sum=a*b;
			}else if(btn==div) {
				if(b==0) {
					JOptionPane.showMessageDialog(this,"0으로나눌수없음" );
					return;
				}
				sum=a/b;
			}
			
			result.setText(Double.toString(sum));
		}catch(NumberFormatException ne){
			JOptionPane.showMessageDialog(Cal.this,"숫자를 입력해주세요" );
		}
		
	}
}
	