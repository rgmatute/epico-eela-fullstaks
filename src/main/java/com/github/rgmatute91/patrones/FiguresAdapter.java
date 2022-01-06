package com.github.rgmatute91.patrones;

import com.github.rgmatute91.entity.Circle;
import com.github.rgmatute91.entity.Square;

public class FiguresAdapter extends Circle {
	
	private Square square;
	
	public FiguresAdapter(Square square) {
		this.square = square;
	}

	@Override
	public double getRadius() {
		double result, result2;
		// result = (Math.sqrt(Math.pow((square.getWidth() / 2), 2)  + (Math.pow((square.getWidth() / 2), 2)))); X
		result2 = Math.hypot(Math.pow(square.getWidth()/2, 2), Math.pow(square.getWidth()/2, 2));
		
		// System.out.println("FiguresAdapter --> result="+ result);
		// System.out.println("FiguresAdapter --> result2="+ result2);
		
		return result2;
	}

}
