package test.human;

public class Blood {
	private String rh;
	private String type;
	
	//getter, setter은 접근지정자가 private인 필드를 public메소드를 통해 값을 얻고 바꿀 수 있도록 해준다.
	
	//생성자
	public Blood(String rh, String type){
		this.rh = rh;
		this.type = type;
	}
	
	//필드에 저장된 rh를 리턴해주는 getter메소드
	public String getRh() {
		return rh;			//this.rh
	}
	//필드에 저장된 type을 리턴해주는 getter메소드
	public String getType() {
		return type;
	}
	
	public void setRh(String rh) {
		this.rh = rh;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
