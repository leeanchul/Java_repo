package MainClass;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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

public class MemoFrame extends JFrame implements ActionListener{

	JButton update,create,load,delete,cook;
	JPanel jp,jp2;
	JTextArea ta;
	JLabel la;
	JTextField tf;

	public MemoFrame(String title) {
		super(title);
		
		//프레임 기본 설정
		setBounds(500, 500, 600, 500);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//객체 생성
		update=new JButton("프레임 변신!");
		create=new JButton("메모 생성");
		load=new JButton("메모 불러오기");
		delete=new JButton("메모 삭제");
		cook=new JButton("요리 게임");
		jp=new JPanel();
		ta=new JTextArea();
		tf=new JTextField(20);
		jp2=new JPanel();

		
		//패널에 추가
		jp.add(tf);
		jp.add(create);
		jp.add(load);
		jp.add(delete);
		//패널 2에 추가
		jp2.add(update);
		jp2.add(cook);
		
		//프레임에 추가!
		
		add(jp2,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		add(jp,BorderLayout.SOUTH);
		
		//버튼 클릭시 동작할 메소드에 객체를 전달
		update.addActionListener(this);
		create.addActionListener(this);
		load.addActionListener(this);
		delete.addActionListener(this);
		cook.addActionListener(this);
		
		
	}
	public static void main(String[] args) {
		MemoFrame mf=new MemoFrame("메모입니다.");
		mf.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object btn=e.getSource();
		File f=new File("C:/acorn202310/myFolder/diary.txt");
		FileReader fr=null;
		BufferedReader br=null;
		
		if(btn==create) {
			try {
				f.createNewFile();
				FileWriter fw=new FileWriter(f);
				fw.write(tf.getText());
				fw.flush();
				fw.close();
				tf.setText("");
				JOptionPane.showMessageDialog(this, "메모가 생성되었습니다.");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}else if(btn==load) {
			try {
					fr=new FileReader(f);
					br=new BufferedReader(fr);
				while(true) {
					String msg=br.readLine();
					if(msg==null)break;
					ta.append(msg);
					ta.append("\r\n");

			}
			}catch (Exception ex) {
				ex.printStackTrace();
			}
		}else if(btn==delete) {
			int result=JOptionPane.showConfirmDialog(this, "삭제 하시겠습니까?");
			if(result==JOptionPane.YES_OPTION) {
				f.delete();
				JOptionPane.showMessageDialog(this, "삭제 되었습니다.");
				ta.setText("");
			}else if(result==JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(this, "취소 되었습니다.");
			}
		}else if(btn==update) {
			
			jp.setBackground(Color.green);
			jp2.setBackground(Color.green);
			create.setBackground(Color.red);
			load.setBackground(Color.blue);
			delete.setBackground(Color.yellow);
			ta.setBackground(Color.gray);
		}else if(btn==cook) {
			CookFrame cf=new CookFrame("요리");
			cf.setVisible(true);
		}
			
		
		
	}
	
}
