package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.ingeritance
 *    ��_FigureTest
 *
 * 1. ����:
 * 2. �ۼ��� : 2015. 8. 13.
 * </pre>
 * 
 * @author		: ���⼮
 * @version		: 1.0
 */
public class FigureTest {
	public static void main(String[] args){
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		
		System.out.println("���� ���� : " + c.calcArea());
		System.out.println("�ﰢ���� ���� : " + t.calcArea());
		System.out.println("�簢���� ���� : " + r.calcArea());
	}
}