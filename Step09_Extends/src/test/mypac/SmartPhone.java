package test.mypac;

public class SmartPhone extends HandPhone{
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	public SmartPhone() {
		System.out.println("SmartPhone() 생성자 호출");
	}
	
	//@override 는 부모의 메소드를 재정의한 메소드라고 표시해주는 어노테이션
	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		super.takePicture();
		System.out.println("1000만 화소의 사진을 찍어요 ");
	}
}
