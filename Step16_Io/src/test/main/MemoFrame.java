package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MemoFrame extends JFrame implements ActionListener{
	JButton btn1,btn2,btn3;
	JLabel la1;
	JTextField text;
	
	public MemoFrame(String title){
		super(title);
		setBounds(500, 500, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		btn1=new JButton("생성");
		btn2=new JButton("입력");
		btn3=new JButton("삭제");
		la1=new JLabel("입력!");
		text=new JTextField(20);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		
		add(la1);
		add(text);
		add(btn1);
		add(btn2);
		add(btn3);
	
	}
	public static void main(String[] args) {
		MemoFrame mf=new MemoFrame("메모장");
		mf.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		File f=new File("C://acorn202310//myFolder/MeMo.txt");
		try {
			Object obj=e.getSource();
			if(obj==btn1) {
				f.createNewFile();
				JOptionPane.showMessageDialog(this, "파일을 생성했습니다.");
	
			}else if(obj==btn2) {
				FileWriter fw=new FileWriter(f);
				fw.write(text.getText());
				fw.flush();
				fw.close();
				JOptionPane.showMessageDialog(this, "입력 되었습니다.");
				la1.setText("내용을 입력하세요");
			}else if(obj==btn3) {
				int result=JOptionPane.showConfirmDialog(this, "삭제?");
				if(result == JOptionPane.YES_OPTION) {
					f.delete();
				}else if(result ==JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(this,"취소되었습니다.");
				
				}
				la1.setText("내용!");

				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
