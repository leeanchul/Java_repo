package MainClass;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import mypac.MemberDto;

public class InfoFrame extends JFrame implements ActionListener{
	JButton addBtn,listBtn;
	JTable table;
	JScrollPane scorll;
	JPanel jp,jpf;
	JTextField numField,nameField,addrField;
	JLabel numla,namela,addrla;
	DefaultTableModel model;
	public List<MemberDto> list=new ArrayList<>();
	
	public InfoFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		
		//객체생성
		table =new JTable();
		scorll=new JScrollPane(table);
		addBtn=new JButton("회원 정보 추가");
		listBtn=new JButton("목록 보기");
		jp=new JPanel();
		jpf=new JPanel();
		//입력 받을 텍스트 필드
		numField=new JTextField(5);
		nameField=new JTextField(15);
		addrField=new JTextField(15);
		
		numla=new JLabel("num:");
		namela=new JLabel("name:");
		addrla=new JLabel("addr:");
		//패널에 텍스트필드 넣기
		jpf.add(numla);
		jpf.add(numField);
		jpf.add(namela);
		jpf.add(nameField);
		jpf.add(addrla);
		jpf.add(addrField);
		
		//jp에 버튼넣기
		jp.add(jpf);
		jp.add(addBtn);
		jp.add(listBtn);
	
		//테이블 목록 배열에 저장해서 model을 테이블에 연결하기
		String[] colNames= {"번호","이름","주소"};
		model=new DefaultTableModel(colNames,0);
		table.setModel(model);
		
	
		
		//프레임에 레이아웃 추가하기
		add(scorll,BorderLayout.CENTER);
		add(jp,BorderLayout.SOUTH);
		
		//버튼 클릭시 메서드
		addBtn.addActionListener(this);
		listBtn.addActionListener(this);
		//테이블에 테이터 보이게하기
		Memberlist();
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		
		if(obj==addBtn) {
				Filein();
				JOptionPane.showMessageDialog(this, "추가되었습니다.");
		}else if(obj==listBtn) {
			Memberlist();
		}
		numField.setText("");
		nameField.setText("");
		addrField.setText("");
	}
	


	//조회
	public void Memberlist() {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("c:/acorn202310/myFolder/members.dat");
			ois=new ObjectInputStream(fis);
			list=(List<MemberDto>)ois.readObject();
			model.setRowCount(0);
			for(MemberDto tmp:list) {
				//MemberDto 에 담긴 내용을 Object[] 에 담은 다음 
				Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
				//row 를 추가한다.
				model.addRow(row);
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
			if(fis!=null)fis.close();
			if(ois!=null)ois.close();
			}catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	//회원추가시 파일에 저장
	public void Filein() {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			add();
			fos=new FileOutputStream("c:/acorn202310/myFolder/members.dat");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
	
		}catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				if(fos!=null)fos.close();
				if(oos!=null)oos.close();
			}catch (Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	//회원정보 추가버튼 
	public void add() {
		int num=Integer.parseInt(numField.getText());
		String name=nameField.getText();
		String addr=addrField.getText();

		MemberDto dto=new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		list.add(dto);
	}
	
	
	
	public static void main(String[] args) {
		InfoFrame f=new InfoFrame("과제");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100,1000,500);
		f.setVisible(true);
	}
}
