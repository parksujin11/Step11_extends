package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass02 {
	//smartphone 객체의 참조값을 다양한 type 변수에 담을 수 있다.(다형성)
	//HandPhone a=new HandPhone-> Phone a =new HandPhone 핸드폰타입으로 받지 않고 
	//부모인 Phone 타입으로 받을 수 있다.  Object a =new HandPhone 으로 받을 수도 있다.
	//부모타입으로 받으면 유지보수가 편할 수 있다.
	//Object,Phone, HandPhone 으로 다 받을 수 있다. 필요에 따라 정의.
	//만약 Phone b = new Phone 일경우 Object와 Phone은 되지만 HandPhone 안된다.
	//SmartPhone c=new SmartPhone c에 쩜 찍어서 메소드나 필드정의할때 변수에 담긴
	// 그 설명서에 명시된 기능밖에 사용할 수 없다. ex)HandPhone c =new SmartPhone에서
	// HandPhone타입으로 받을 수는 있지만. c에 쩜찍었을때 HandPhone의 기능 밖에 사용 못함
	//SmartPhone 객체인데 그 기능을 쓸 수 없다. 
	public static void main(String[] args) {
		Object p1=new SmartPhone();
		Phone p2=new SmartPhone();
		HandPhone p3=new SmartPhone();
		SmartPhone p4=new SmartPhone();
		
	}
}
