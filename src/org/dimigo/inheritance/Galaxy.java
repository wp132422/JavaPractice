package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   ㅣ_ Galaxy
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 *
 * @author  : 윤기석
 * @version : 1.0
 */
public class Galaxy extends SmartPhone{
	public Galaxy(){
		
	}
	
	public Galaxy(String model, String company, int price){
		super(model, company, price);
	}
	
	public void pay(){
		System.out.print("삼성");
		super.pay();
	}
	
	public void useWirelessCharging(){
		System.out.println("무선 충천 기능을 사용합니다.");
	}

}

