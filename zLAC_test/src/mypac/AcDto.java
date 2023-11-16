package mypac;

public class AcDto {
	private String bname;
	private String pub;
	private int price;
	
	public AcDto() {
	}

	public AcDto(String bname, String pub, int price) {
		this.bname = bname;
		this.pub = pub;
		this.price = price;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	public void print() {
		String result=String.format("책 제목:%s ,출판사:%s ,가격:%d", bname,pub,price);
		System.out.println(result);
	}
}
