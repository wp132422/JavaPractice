package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.ingeritance
 *    ��_Circle
 *
 * 1. ����:
 * 2. �ۼ��� : 2015. 8. 12.
 * </pre>
 * 
 * @author		: ���⼮
 * @version		: 1.0
 */
public class Circle extends Figure {
	private int radius;
	
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius)
	{
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double calcArea()
	{
		
		
		double i = Double.valueOf(String.format("%.1f",Math.PI * radius * radius)).doubleValue(); 
		return i;
	}
}