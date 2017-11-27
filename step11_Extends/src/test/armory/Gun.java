package test.armory;
/*
 * [접근 지정자]:class, 생성자, 필드, 메소드에 지정할 수 있다. 
 * 
 * class 접근 지정자(import를 할 수 있느냐 없느냐에 영향을 미침)
 * 1. public : 전체 공개
 * 2. default : 같은 패키지 내에서만 접근가능
 * 
 * 생성자, 필드, 메소드의 접근 지정자
 * 1. public : 전체 공개
 * 2. protected : 같은 패키지 혹은 상속관계의 자식에서 접근가능
 * 3. default : 같은 패키지 내에서만 접근가능
 * 4. private : 정의된 클래스 안에서만 접근 가능 
 */
public class Gun {
	//맴버 필드
	protected Bullet bullet;
	//생성자 
	public Gun(Bullet bullet) {
		this.bullet=bullet;
	}
	//메소드
	public void fire() {
		if(bullet==null) {
			System.out.println("총알 객체가 없어서 사용불가");
			return; //메소드 종료
		}
		
		System.err.println("빵~~");
	}
}
