package test.dto;

public class MemoDto {
	private int num;
	private String content;
	private String regDate;
	
	public MemoDto() {}
	
	public MemoDto(int num, String content, String regDate) {
		this.num = num;
		this.content = content;
		this.regDate = regDate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	
	
}
