package test.armory;

public class SniperGun extends Gun{
	//생성자
	public SniperGun(Bullet bullet) {
		super(bullet);
	}
	//fire() 메소드 재정의하기 
	@Override
	public void fire() {
		//super 는 부모객체의 참조값을 가리키는 예약어이다.
		//super.fire() 재정의의 대상이 된 부모 메소드를 호출하는 표현 식이다.
		//super부모 fire 재정의 되었기 때문에 오버라이드된 fire가 불러옴
		super.fire();
		
		System.out.println("좀 더 멀리 정밀하게 빵~~");
	}
}
