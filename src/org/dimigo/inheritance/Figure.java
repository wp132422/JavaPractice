package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.ingeritance
 *    ��_Figure
 *
 * 1. ����:
 * 2. �ۼ��� : 2015. 8. 12.
 * </pre>
 * 
 * @author		: ���⼮
 * @version		: 1.0
 */
public class Figure {
	private int centerX;
	private int centerY;
	
	public Figure()
	{
		
	}
	
	public Figure(int centerX, int centerY){
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea()
	{
		return 0.0;
	}
}