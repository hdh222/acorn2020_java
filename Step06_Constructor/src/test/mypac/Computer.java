package test.mypac;

public class Computer {
	//필드
	public Cpu cpu;
	
	//생성자
	public Computer(Cpu cpu) {
		this.cpu = cpu;
	}
	
	//메소드
	public void doGame() {
		if(this.cpu == null) {
			System.out.println("cpu가 없어서 컴퓨터 동작을 안해요");
			return;
		}
		System.out.println("컴퓨터로 게임을 해요");
	}
}
