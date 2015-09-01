package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   ㅣ_ SmartPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 *
 * @author  : 윤기석
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
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff(){
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void pay(){
		System.out.println(" 페이로 결제합니다.");
		
	}
	
	public void useSpecialFunction(){
 		if(this instanceof IPhone) ((IPhone)this).useAirDrop(); 
	    if(this instanceof Galaxy) ((Galaxy)this).useWirelessCharging(); 
	}

	@Override
	public String toString() {
		return "모델명 = " + model + ", company = " + company + ", price = " + String.format("%,d", price);
	}
}

