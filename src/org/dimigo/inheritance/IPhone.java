package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   ㅣ_ IPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 *
 * @author  : 윤기석
 * @version : 1.0
 */
public class IPhone extends SmartPhone {
	public IPhone(){
		
	}
	
	public IPhone(String model, String company, int price){
		super(model, company, price);
	}
	
	public void pay(){
		System.out.print("애플");
		super.pay();
	}
	
	public void useAirDrop(){
		System.out.println("Airdrop기능을 사용합니다.");
	}

}

