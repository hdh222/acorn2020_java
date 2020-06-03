package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1.Bike 객체를 담을수 있는 방 3개짜리 배열객체를 생성해서 참조 값을 
		 * bikes라는 지역변수에 담아보세요.
		 * 
		 * 2.배열의 각각의 방(0,1,2번)에 bike객체를 생성해서 담아보세요
		 * 3.반복문 for를 이용해서 배열의 각각의 방에 있는 bike 객체의 ride()메소드를 호출해보세요.
		 */
		
		Bike[] bikes = new Bike[3];				//배열 객체 생성
		
		for(int i = 0; i < bikes.length; i++) {	//각각의 방에 생성한 -bike객체 참조 값 저장
			bikes[i] = new Bike();
		}
		
		for(int i = 0; i < bikes.length; i++) { //각각의 방에 ride()함수 호출
//			bikes[i].ride();				//i번째에 있는 Bike객체의 메소드 호출
			
			//i번째 방에 있는 Bike객체의 참조값 불러오기
			Bike tmp = bikes[i];
			
			//Bike객체의 메소드 호출
			tmp.ride();
		}
	}
}
