package test.Dto;

public class BookDto {
	private String bname;
	private String author;
	private String publish;
	private String isbn;
	private int price;
	private int bnum;
	
	public BookDto() {
		
	}

	public BookDto(String bname, String author, String publish, String isbn, int price, int bnum) {
		super();
		this.bname = bname;
		this.author = author;
		this.publish = publish;
		this.isbn = isbn;
		this.price = price;
		this.bnum = bnum;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBnum() {
		return bnum;
	}

	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	
	public Object[] toRow() {
		Object[] row = {getBname(),getAuthor(),getPublish(),getIsbn(), getPrice(), getBnum() };
		return row;
	}
}
