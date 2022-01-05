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
        double result;
        // Calcula el radio de un circulo.
        result = (Math.sqrt(Math.pow((square.getWidth() / 2), 2) * 2));
        return result;
    }

}
