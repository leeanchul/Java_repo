package test.mypac;

public class PostDto {
	private int num;
	private String name;
	private String title;
	
	public PostDto() {
	}

	public PostDto(int num, String name, String title) {
		super();
		this.num = num;
		this.name = name;
		this.title = title;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



}
