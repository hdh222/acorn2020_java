package test.main;

import test.mypac.Music;
import test.mypac.Pop;

public class MainClass01 {
	static Music m2 = new Music() {
		
		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("kpop정지");
		}
		
		@Override
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("kpop시작");
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music m1 = new Pop();
		m1.start();
		
		m2.start();
		
		Music m3 = new Music() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("jpop정지");
			}
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("jpop시작");
			}
		};
	}

}
