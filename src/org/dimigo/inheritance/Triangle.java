package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    ��_Triangle
 *
 * 1. ����:
 * 2. �ۼ��� : 2015. 8. 12.
 * </pre>
 * 
 * @author		: ���⼮
 * @version		: 1.0
 */
public class Triangle extends Figure {
	private int width;
	private int height;
	
	Triangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	Triangle(int centerX, int centerY, int width, int height)
	{
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	protected void printCenter()
	{
		System.out.println("("+centerX+","+centerY+")");
				
	}
	protected void moveFigure(int x,int y){
		centerX += x;
		centerY += y;
	}
	protected double calcArea()
	{
		return width * height / 2;
	}
}

