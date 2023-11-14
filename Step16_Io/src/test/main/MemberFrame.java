package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener{
	//필요한 필드 정의하기
	JTextField inputNum;
	JTextField inputName;
	JTextField inputAddr;
	//회원정보를 누적 시킬 ArrayList 객체 
	List<MemberDto> list=new ArrayList<>();
	DefaultTableModel model;
	
	public MemberFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		//JLable 3개
		JLabel label1=new JLabel("번호");
		JLabel label2=new JLabel("이름");
		JLabel label3=new JLabel("주소");
		//JTextField 3개
		inputNum=new JTextField(10);
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		//JButton
		JButton addBtn=new JButton("추가");
		
		//페널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputNum);
		panel.add(label2);
		panel.add(inputName);
		panel.add(label3);
		panel.add(inputAddr);
		panel.add(addBtn);
		
		//페널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		//버튼에 리스너 등록
		addBtn.addActionListener(this);
		//버튼에 action command 설정
		addBtn.setActionCommand("add");
		
		JTable table=new JTable();
		String[] colNames= {"번호", "이름", "주소"};
		//테이블에 연결할 모델
		model=new DefaultTableModel(colNames, 0);
		//모델을 테이블에 연결
		table.setModel(model);
		//스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
	    JScrollPane scroll=new JScrollPane(table);
	    //JScrollPane  을 프레임의 가운데에 배치하기 
	    add(scroll, BorderLayout.CENTER);
	    refreshTable();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 action command 값을 읽어온다.
		String command=e.getActionCommand();
		//action command 를 이용해서 분기 하기 
		if(command.equals("add")) {
			//입력한 번호, 이름, 주소를 읽어온다.
			int num=Integer.parseInt(inputNum.getText());
			String name=inputName.getText();
			String addr=inputAddr.getText();
			//MemberDto 객체에 회원 한명의 정보를 담는다.
			MemberDto dto=new MemberDto();
			dto.setNum(num);
			dto.setName(name);
			dto.setAddr(addr);
			//회원 한명의 정보를 List 에 담는다.
			list.add(dto);
			//List 를 ObjectOutputStream 을 이용해서 file 에 저장
			saveToFile();
		}
		refreshTable();
	}
	//테이블에 회원목록을 출력해주는 메소드
	public void refreshTable() {
		//파일에 저장된 목록을 읽어온다.
		loadFromFile();
		//현재 테이블에 출력된 모든 내용을 삭제
		model.setRowCount(0);
		//반복문 돌면서 테이블 row 추가하기
		for(MemberDto tmp:list) {
			//MemberDto 에 담긴 내용을 Object[] 에 담은 다음 
			Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			//row 를 추가한다.
			model.addRow(row);
		}
	}
	
	//파일에서 List 를 읽어와서 필드에 저장하는 메소드
	public void loadFromFile() {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("c:/acorn202310/myFolder/my_members.dat");
			//Object 를 읽어들일수 있는 객체 생성
			ois=new ObjectInputStream(fis);
			//읽어들은 Object 를 원래 type 으로 casting 에서 필드에 담기 
			list=(List<MemberDto>)ois.readObject();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois!=null)ois.close();
				if(fis!=null)fis.close();
			}catch(Exception e) {}
		}
	}
	
	//List<MemberDto> 객체를 파일에 저장하는 메소드 
	public void saveToFile() {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("c:/acorn202310/myFolder/my_members.dat");
			//Object 를 출력할수 있는 객체생성
			oos=new ObjectOutputStream(fos);
			//객체 출력하기
			oos.writeObject(list);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			}catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		JFrame f=new MemberFrame("회원관리");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}
}







