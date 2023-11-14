package MainClass;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CookFrame extends JFrame implements ActionListener{
	int count=0;
	int num=0;
	JButton cook,serving,drive,wait;
	JLabel la1,la2;
	
	public CookFrame(String title) {
		//기본설정
		super(title);
		setBounds(200, 200, 300, 600);
		setLayout(new FlowLayout());
		
		//객체생성
		cook=new JButton("요리");
		serving=new JButton("서빙");
		drive=new JButton("배달");
		wait=new JButton("대기");
		la1=new JLabel("");
		la2=new JLabel("");
		
		//버튼 클릭
		cook.addActionListener(this);
		serving.addActionListener(this);
		drive.addActionListener(this);
		wait.addActionListener(this);
		
		//프레임추가
		add(la1);
		add(cook);
		add(serving);
		add(drive);
		add(wait);
		add(la2);
		
	}
	public static void main(String[] args) {
		CookFrame frame=new CookFrame("안녕");
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==cook) {
			JOptionPane.showMessageDialog(this, "요리중슉!슉");
		}else if(obj==serving) {
			JOptionPane.showMessageDialog(this,"서빙중~맛있게드세요");
		}else if(obj==drive) {
			JOptionPane.showMessageDialog(this,"배달가는중이에요ㅡㅡ");
		}else if(obj==wait) {
			Thread t=new Thread(new MyThread());
			count++;
			num++;
			JOptionPane.showMessageDialog(this,num+"예약 되었습니다");
			t.start();
		}
	}
	
	
	class MyThread implements Runnable{

		@Override
		public void run() {
		
			la1.setText("현재"+count+"팀 대기중입니다.");
			try {
				Thread.sleep(10000);
				la2.setText(num+"입장해주세요");
				count--;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
