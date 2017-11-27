package test.mypac;

public class Phone extends Object {
//생성자 정의 하지 않으면 디폴트 생성자가 있는거 ->public Phone 
	//디폴트 생성자를 명시적으로 정의하기
//super 	
	public Phone() {
		System.out.println("Phone() 생성자 호출됨");
	}
	
	//맴버 메소드
	public void call() {
		System.out.println("전화를 걸어요 ");
	}
}
