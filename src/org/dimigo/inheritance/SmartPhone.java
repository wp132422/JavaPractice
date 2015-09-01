package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   ��_ SmartPhone
 *
 * 1. ���� :
 * 2. �ۼ��� : 2015. 8. 28.
 * </pre>
 *
 * @author  : ���⼮
 * @version : 1.0
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){
		
	}
	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(model + "�� ������ �մϴ�.");
	}
	
	public void turnOff(){
		System.out.println(model + "�� ������ ���ϴ�.");
	}
	
	public void pay(){
		System.out.println(" ���̷� �����մϴ�.");
		
	}
	
	public void useSpecialFunction(){
 		if(this instanceof IPhone) ((IPhone)this).useAirDrop(); 
	    if(this instanceof Galaxy) ((Galaxy)this).useWirelessCharging(); 
	}

	@Override
	public String toString() {
		return "�𵨸� = " + model + ", company = " + company + ", price = " + String.format("%,d", price);
	}
}

