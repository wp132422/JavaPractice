package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    ㅣ_FigureTest
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 8. 13.
 * </pre>
 * 
 * @author		: 윤기석
 * @version		: 1.0
 */
public class FigureTest {
	public static void main(String[] args){
		Circle c = new Circle(0,0,5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		Figure f = new Figure();
		System.out.println("원의 넓이 : " + c.calcArea());
		System.out.println("삼각형의 넓이 : " + t.calcArea());
		System.out.println("사각형의 넓이 : " + r.calcArea());
		System.out.print("원 중심좌표 : ");
		c.printCenter();
		System.out.print("삼각형 중심좌표 : ");
		t.printCenter();
		System.out.print("사각형 중심좌표 : ");
		r.printCenter();
		
		System.out.println("--중심좌표 이동 (x,y축 5씩)");
	
		c.moveFigure(5, 5);
		r.moveFigure(5, 5);
		t.moveFigure(5, 5);
		System.out.print("원 중심좌표 : ");
		c.printCenter();
		System.out.print("삼각형 중심좌표 : ");
		t.printCenter();
		System.out.print("사각형 중심좌표 : ");
		r.printCenter();
		
	}
}