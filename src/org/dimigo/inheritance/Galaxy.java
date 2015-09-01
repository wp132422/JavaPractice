package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   ��_ Galaxy
 *
 * 1. ���� :
 * 2. �ۼ��� : 2015. 8. 28.
 * </pre>
 *
 * @author  : ���⼮
 * @version : 1.0
 */
public class Galaxy extends SmartPhone{
	public Galaxy(){
		
	}
	
	public Galaxy(String model, String company, int price){
		super(model, company, price);
	}
	
	public void pay(){
		System.out.print("�Ｚ");
		super.pay();
	}
	
	public void useWirelessCharging(){
		System.out.println("���� ��õ ����� ����մϴ�.");
	}

}

