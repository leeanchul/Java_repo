package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemoFrame2 extends JFrame implements ActionListener{
	JButton btn1;
	JTextField text;
	public MemoFrame2(String title){
		super(title);
		setBounds(500, 500, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		btn1=new JButton("입력");
		text=new JTextField(20);
		JButton readBtn1=new JButton("읽어오기");
		JTextArea ta=new JTextArea();
		JButton deleteBtn=new JButton("삭제하기");
		
		JPanel p1=new JPanel();
		p1.setBackground(Color.green);
		//ui를 감쌀패널
		
		p1.add(text);
		p1.add(btn1);
		p1.add(readBtn1);
		p1.add(deleteBtn);
		
		add(p1,BorderLayout.SOUTH);
		add(ta,BorderLayout.CENTER);
		
		
	
		btn1.addActionListener(this);
	
	
		readBtn1.addActionListener((e)->{
			FileReader fr=null;
			BufferedReader br=null;
			ta.setText("");
			try {
				//파일에서 문자열을 읽어들일 객체
				fr=new FileReader("C:/acorn202310/myFolder/diary.txt");
				//문자열을 좀더 편하게 읽어들이기 위해 FileReader 를 BufferdReader 로 업그레이드.
				br=new BufferedReader(fr);
				while(true) {
					String line=br.readLine();
					if(line==null)break;
					ta.append(line);
					ta.append("\r\n");
				}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		});
		
		
		deleteBtn.addActionListener((e)->{
			File f=new File("C:/acorn202310/myFolder/diary.txt");
			int result=JOptionPane.showConfirmDialog(this, "삭제할거에유~!?");
			System.out.println(result);
			if(result==JOptionPane.YES_OPTION) {
				f.delete();
			}
			
			
			
			
		});
	
	}
	public static void main(String[] args) {
		MemoFrame2 mf=new MemoFrame2("메모장");
		mf.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		File f=new File("C:/acorn202310/myFolder/diary.txt");
		try {
			f.createNewFile();
			FileWriter fw=new FileWriter(f);
			fw.write(text.getText());
			fw.flush();
			fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
}
