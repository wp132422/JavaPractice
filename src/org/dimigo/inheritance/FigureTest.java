package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
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
		Circle c = new Circle(0,0,5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		Figure f = new Figure();
		System.out.println("���� ���� : " + c.calcArea());
		System.out.println("�ﰢ���� ���� : " + t.calcArea());
		System.out.println("�簢���� ���� : " + r.calcArea());
		System.out.print("�� �߽���ǥ : ");
		c.printCenter();
		System.out.print("�ﰢ�� �߽���ǥ : ");
		t.printCenter();
		System.out.print("�簢�� �߽���ǥ : ");
		r.printCenter();
		
		System.out.println("--�߽���ǥ �̵� (x,y�� 5��)");
	
		c.moveFigure(5, 5);
		r.moveFigure(5, 5);
		t.moveFigure(5, 5);
		System.out.print("�� �߽���ǥ : ");
		c.printCenter();
		System.out.print("�ﰢ�� �߽���ǥ : ");
		t.printCenter();
		System.out.print("�簢�� �߽���ǥ : ");
		r.printCenter();
		
	}
}