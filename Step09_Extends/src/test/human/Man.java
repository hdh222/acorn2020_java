package test.human;

public class Man extends Person{

	//생성자
	public Man(Blood blood) {
		super(blood);	//부모생성자에 필요한 값을 전달
		// TODO Auto-generated constructor stub
	}
	
	public void seeMovie() {
		System.out.println("영화를 봐요");
	}

}
