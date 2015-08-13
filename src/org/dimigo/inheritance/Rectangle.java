package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    ��_Rectangle
 *
 * 1. ����:
 * 2. �ۼ��� : 2015. 8. 12.
 * </pre>
 * 
 * @author		: ���⼮
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
	
	protected double calcArea()
	{
		return width * height;
	}
}

