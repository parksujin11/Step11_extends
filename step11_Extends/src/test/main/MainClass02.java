package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass02 {
	//smartphone ��ü�� �������� �پ��� type ������ ���� �� �ִ�.(������)
	//HandPhone a=new HandPhone-> Phone a =new HandPhone �ڵ���Ÿ������ ���� �ʰ� 
	//�θ��� Phone Ÿ������ ���� �� �ִ�.  Object a =new HandPhone ���� ���� ���� �ִ�.
	//�θ�Ÿ������ ������ ���������� ���� �� �ִ�.
	//Object,Phone, HandPhone ���� �� ���� �� �ִ�. �ʿ信 ���� ����.
	//���� Phone b = new Phone �ϰ�� Object�� Phone�� ������ HandPhone �ȵȴ�.
	//SmartPhone c=new SmartPhone c�� �� �� �޼ҵ峪 �ʵ������Ҷ� ������ ���
	// �� ������ ��õ� ��ɹۿ� ����� �� ����. ex)HandPhone c =new SmartPhone����
	// HandPhoneŸ������ ���� ���� ������. c�� ��������� HandPhone�� ��� �ۿ� ��� ����
	//SmartPhone ��ü�ε� �� ����� �� �� ����. 
	public static void main(String[] args) {
		Object p1=new SmartPhone();
		Phone p2=new SmartPhone();
		HandPhone p3=new SmartPhone();
		SmartPhone p4=new SmartPhone();
		
	}
}
