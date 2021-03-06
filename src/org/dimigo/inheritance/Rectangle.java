package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    ㅣ_Rectangle
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author		: 윤기석
 * @version		: 1.0
 */
public class Rectangle extends Figure {
	private int width;
	private int height;
	
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height= height;
	}
	
	public Rectangle(int centerX, int centerY, int width, int height)
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
		return width * height;
	}
}

