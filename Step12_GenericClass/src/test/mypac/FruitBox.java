package test.mypac;
/*
 * class 클래스명<Generic type>
 * 
 * 	- 클래스를 정의할 때 Generic type을 지정해서 특정 type을 종덕으로 지정할 수 있다.
 */
public class FruitBox<T> {
	//필드
	private T item;
	
	public void push(T item) {
		this.item = item;
	}
	
	public T pull() {
		return item;
	}
}


//public class FruitBox<T, T2> {
//	//필드
//	private T item;
//	
//	public void push(T item) {
//		this.item = item;
//	}
//	
//	public T pull() {
//		return item;
//	}
//}
