package MainClass;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.Dto.MemberDto;
import test.dao.MemberDao;




public class DbFrame extends JFrame implements ActionListener{
	JScrollPane jScroll;
	JButton addBtn,selectBtn,deleteBtn;
	DefaultTableModel model;
	JTable table;
	JTextField numField,nameField,addrField;
	JLabel la1,la2,la3;
	MemberDao dao=null;
	MemberDto dto=null;
	public DbFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		JPanel jp=new JPanel();
		addBtn=new JButton("추가");
		selectBtn=new JButton("조회");
		deleteBtn=new JButton("삭제");
		numField=new JTextField(10);
		nameField=new JTextField(10);
		addrField=new JTextField(10);
		la1=new JLabel("번호");
		la2=new JLabel("이름");
		la3=new JLabel("주소");
		//jpanel jp에 버튼 넣기 
		jp.add(la1);
		jp.add(numField);
		jp.add(la2);
		jp.add(nameField);
		jp.add(la3);
		jp.add(addrField);
		jp.add(addBtn);
		jp.add(selectBtn);
		jp.add(deleteBtn);
		//테이블 생성
		table=new JTable();
		String[] colNames= {"num","name","addr"};
		model=new DefaultTableModel(colNames, 0);
		table.setModel(model);
		jScroll=new JScrollPane(table);
		
		jp.setBackground(Color.gray);
		addBtn.setBackground(Color.red);
		selectBtn.setBackground(Color.red);
		deleteBtn.setBackground(Color.red);
		//프레임이 추가
		add(jScroll, BorderLayout.CENTER);
		add(jp,BorderLayout.SOUTH);
		
		//버튼 클릭시 이벤트
		addBtn.addActionListener(this);
		selectBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		re();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==addBtn) {
		
			dao=new MemberDao();
			dto=new MemberDto();
			dto.setNum(Integer.parseInt(numField.getText()));
			dto.setName(nameField.getText());
			dto.setAddr(addrField.getText());
			dao.insert(dto);	
			JOptionPane.showMessageDialog(this, "DB에 추가되었습니다.");
			
		}else if(obj==selectBtn) {
			re();
		}else if(obj==deleteBtn) {
			int result=JOptionPane.showConfirmDialog(this, "삭제할거?");
			if(result==JOptionPane.YES_OPTION) {
				int num=Integer.parseInt(numField.getText());
				dao=new MemberDao();
				dao.delete(num);
				JOptionPane.showMessageDialog(this, "삭제!!!");
			}else if(result==JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(this, "취소!!!");
			}
		}
		numField.setText("");
		nameField.setText("");
		addrField.setText("");
	}
	
	
	public void re() {
		model.setRowCount(0);
		List<MemberDto> list=new MemberDao().getlst();
		for(MemberDto tmp:list) {
			Object[] row= {tmp.getNum(),tmp.getName(),tmp.getAddr()};
			model.addRow(row);
		}
	}

	
	public static void main(String[] args) {
		DbFrame df=new DbFrame("test");
		df.setBounds(500, 500, 800, 500);
		df.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		df.setVisible(true);
	}
}
