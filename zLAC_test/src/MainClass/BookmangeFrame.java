package MainClass;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

import test.Dto.BookDto;
import test.dao.BookDao;
import test.dao.MemberDao;

public class BookmangeFrame extends JFrame implements ActionListener{
	
	  
	List<BookDto> list=new ArrayList<>();
	JTable table;
	JLabel bnamela,authorla,publishla,isbnla,pricela,bnumla;
	JTextField bnametf,authortf,publishtf,isbntf,pricetf,bnumtf;
	DefaultTableModel model;
	JScrollPane scroll;
	JButton addBtn,updateBtn,deleteBtn;
	JPanel jp,jp2;
	Boolean istable =false;
	public BookmangeFrame() {
		setBounds(900, 100, 300, 660);
		setTitle("관리");
		setLayout(new BorderLayout());
		//객체생성
		addBtn=new JButton("추가");
		updateBtn=new JButton("수정");
		deleteBtn=new JButton("삭제");
		jp=new JPanel();
		jp2=new JPanel();
		
		bnamela=new JLabel("책이름");
		authorla=new JLabel("저자");
		publishla=new JLabel("출판사");
		isbnla=new JLabel("ISBN");
		pricela=new JLabel("가격");
		bnumla=new JLabel("권수");
		
		bnametf=new JTextField(20);
		authortf=new JTextField(20);
		publishtf=new JTextField(20);
		isbntf=new JTextField(20);
		pricetf=new JTextField(20);
		bnumtf=new JTextField(20);
		
		jp2.add(bnamela);
		jp2.add(bnametf);
		jp2.add(authorla);
		jp2.add(authortf);
		jp2.add(publishla);
		jp2.add(publishtf);
		jp2.add(isbnla);
		jp2.add(isbntf);
		jp2.add(pricela);
		jp2.add(pricetf);
		jp2.add(bnumla);
		jp2.add(bnumtf);
		
		
		
		//테이블 객체 생성
		table=new JTable();
		String[] tabletitle= {"책이름","저자","출판사","ISBN","가격","권수"};
		
		model=new DefaultTableModel(tabletitle,0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				if(istable) {
					if(column==3) {
						return false;
					}else {
						return true;
					}
				}else {
					return false;
				}
			}
		};
		
		table.setModel(model);
		scroll=new JScrollPane(table);
		//JPnel에 넣기
		jp.add(addBtn);
		jp.add(updateBtn);
		jp.add(deleteBtn);
		
		
		//프레임에 넣기
		add(scroll,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		add(jp,BorderLayout.SOUTH);
		
		//버튼 클릭시 이벤트
		addBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		table.addPropertyChangeListener((p)->{
			System.out.println("리스너 동작!");
			System.out.println(p.getPropertyName());
			System.out.println(table.isEditing());
			if(p.getPropertyName().equals("tableCellEditor")&&!table.isEditing()) {
				int indexrow=table.getSelectedRow();
				
				String bname=(String)model.getValueAt(indexrow, 0);
				String author=(String)model.getValueAt(indexrow, 1);
				String publish=(String)model.getValueAt(indexrow, 2);
				String isbn=(String)model.getValueAt(indexrow, 3);
				int price=(int)model.getValueAt(indexrow, 4);
				int bnum=(int)model.getValueAt(indexrow, 5);
				
				BookDto dto=new BookDto(bname,author,publish,isbn,price,bnum);
				new BookDao().update(dto);
				table.clearSelection();
				istable=false;
			}
		});
		Blist();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		
		if(obj==addBtn) {
			Badd();
		}else if(obj==updateBtn) {
			istable=true;
			//Bupdate();
		}else if(obj==deleteBtn) {
			Bdelete();
		}
		bnametf.setText("");
		authortf.setText("");
		publishtf.setText("");
		isbntf.setText("");
		pricetf.setText("");
		bnumtf.setText("");
		
	}
	public void Blist() {
		model.setRowCount(0);
		list=new BookDao().select();
		for(BookDto tmp:list) {
			Object[] row= {tmp.getBname(),tmp.getAuthor(),tmp.getPublish(),tmp.getIsbn(),tmp.getPrice(),tmp.getBnum()};
			model.addRow(row);
		}

	}
	public void Badd() {
		String bname=bnametf.getText();
		String author=authortf.getText();
		String publish=publishtf.getText();
		String isbn=isbntf.getText();
		int price=Integer.parseInt(pricetf.getText());
		int bnum=Integer.parseInt(bnumtf.getText());
		
		BookDto dto=new BookDto();
		dto.setBname(bnametf.getText());
		dto.setBname(bname);
		dto.setAuthor(author);
		dto.setPublish(publish);
		dto.setIsbn(isbn);
		dto.setPrice(price);
		dto.setBnum(bnum);
		
		new BookDao().addBook(dto);

	}
	
	
	public void Bupdate() {
		table.addPropertyChangeListener((p)->{
			System.out.println("리스너 동작!");
			System.out.println(p.getPropertyName());
			System.out.println(table.isEditing());
			if(p.getPropertyName().equals("tableCellEditor")&&!table.isEditing()) {
				int indexrow=table.getSelectedRow();
				
				String bname=(String)model.getValueAt(indexrow, 0);
				String author=(String)model.getValueAt(indexrow, 1);
				String publish=(String)model.getValueAt(indexrow, 2);
				String isbn=(String)model.getValueAt(indexrow, 3);
				int price=(int)model.getValueAt(indexrow, 4);
				int bnum=(int)model.getValueAt(indexrow, 5);
				
				BookDto dto=new BookDto(bname,author,publish,isbn,price,bnum);
				new BookDao().update(dto);
				table.clearSelection();
				istable=false;
			}
		});
	}
	
	public void Bdelete() {
		int indexrow=table.getSelectedRow();
		if(indexrow==-1) {
			JOptionPane.showMessageDialog(this, "삭제할 목록 클릭해라");
			return;
		}
		BookDto dto=list.get(indexrow);
		String isbn=dto.getIsbn();
		new BookDao().delete(isbn);
	}
	
	public static void main(String[] args) {
		BookmangeFrame bmf=new BookmangeFrame();
		bmf.setVisible(true);
	}
}