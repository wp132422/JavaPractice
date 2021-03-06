package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    ㅣ_Figure
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author		: 윤기석
 * @version		: 1.0
 */
public class Figure {
	protected int centerX;
	protected int centerY;
	
	public Figure()
	{
		
	}
	
	public Figure(int centerX, int centerY){
		this.centerX = centerX;
		this.centerY = centerY;
	}
	protected void printCenter()
	{
		System.out.println("("+centerX+","+centerY+")");
				
	}
	protected void moveFigure(int x,int y){
		centerX = x;
		centerY = y;
	}
	protected double calcArea()
	{
		return 0.0;
	}
}