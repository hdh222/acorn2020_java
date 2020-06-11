package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;
import test.mypac.Orange;

public class MainClass02 {
	public static void main(String[] args) {
		//객체를 생성할 때 Generic 클래스는 생략이 가능하다.
		//Generic은 저장할 때 타입을 지정해주면 문제가 되지 않는다.
		FruitBox<Apple> box1 = new FruitBox<>();
		FruitBox<Orange> box2 = new FruitBox<>();
		FruitBox<Banana> box3 = new FruitBox<>();
		
		
		new FruitBox<Apple>().push(new Apple());
	}
}
