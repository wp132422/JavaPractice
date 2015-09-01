package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   ��_ SmartPhoneTest
 *
 * 1. ���� :
 * 2. �ۼ��� : 2015. 8. 28.
 * </pre>
 *
 * @author  : ���⼮
 * @version : 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone i = new IPhone("IPhone6", "����", 700000);
		SmartPhone g = new Galaxy("������ S6", "�Ｚ", 650000);
		
		System.out.println(i.toString());
		i.turnOn();
		i.pay(); 
	 	i.useSpecialFunction(); 
	 	i.turnOff();
	 	System.out.println();
	 	
	 	System.out.println(g.toString());
	 	g.turnOn();
		g.pay(); 
	 	g.useSpecialFunction(); 
	 	g.turnOff();
	}

}

