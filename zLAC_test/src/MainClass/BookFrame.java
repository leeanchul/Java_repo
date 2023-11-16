package MainClass;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.Dto.BookDto;
import test.dao.BookDao;
import test.util.DBConnect;

public class BookFrame extends JFrame implements ActionListener{
	List<BookDto> list=new ArrayList<>();
	JTable table;
	DefaultTableModel model;
	JScrollPane scroll;
	JButton manageBtn,updateBtn,soldBtn;
	JPanel jp;
	public BookFrame(String title) {
		super(title);
		
		setLayout(new BorderLayout());
		//객체생성
		manageBtn=new JButton("도서 관리");
		updateBtn=new JButton("업데이트");
		soldBtn=new JButton("판매");
		jp=new JPanel();
		
		//JPanel 에넣기
		jp.add(manageBtn);
		jp.add(updateBtn);
		jp.add(soldBtn);
		
		//테이블 객체 생성
		table=new JTable();
		String[] tabletitle= {"책이름","저자","출판사","ISBN","가격","권수"};
		model=new DefaultTableModel(tabletitle,0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		table.setModel(model);
		scroll=new JScrollPane(table);
		
		//프레임에 넣기
		add(scroll,BorderLayout.CENTER);
		add(jp,BorderLayout.SOUTH);
		
		
		manageBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		soldBtn.addActionListener(this);
		Blist();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==manageBtn) {
			BookmangeFrame bmf=new BookmangeFrame();
			bmf.setVisible(true);
		}else if(obj==updateBtn) {
			Blist();
		}else if(obj==soldBtn) {
			sold();
		}
		
	}
	public void addBook(BookDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new DBConnect().getConn();

			String sql = "insert into book"
					+ " (bname,author,publish,isbn,price,bnum)"
					+ " values(?,?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getBname());
			pstmt.setString(2, dto.getAuthor());
			pstmt.setString(3,dto.getPublish());
			pstmt.setString(4, dto.getIsbn());
			pstmt.setInt(5, dto.getPrice());
			pstmt.setInt(6, dto.getBnum());
			
			pstmt.executeUpdate();
			System.out.println("추가되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void sold() {
		int row=table.getSelectedRow();
		BookDto dto=list.get(row);
	
		if(row==-1) {
			JOptionPane.showMessageDialog(this, "삭제할 목록 클릭해라");
			return;
		}
		
		int count=dto.getBnum();
		String isbn=dto.getIsbn();
		int num=count-1;
		
		if(count<0) {
			JOptionPane.showMessageDialog(this, "책이 없습니다.");
			return;
		}else {
			new BookDao().soldBook(dto);
		}
		
		Blist();
	}
	
	public void Blist() {
		model.setRowCount(0);
		list=new BookDao().select();
		for(BookDto tmp:list) {
			Object[] row= {tmp.getBname(),tmp.getAuthor(),tmp.getPublish(),tmp.getIsbn(),tmp.getPrice(),tmp.getBnum()};
			model.addRow(row);
		}
	}
	
	public static void main(String[] args) {
		BookFrame bf=new BookFrame("book");
		bf.setBounds(100, 100, 800, 500);
		bf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bf.setVisible(true);
	}
}
