package com.kleyton.volumeCalculator.factory;

import com.kleyton.volumeCalculator.entities.Cube;
import com.kleyton.volumeCalculator.entities.Shape;

/**
 * Generate {@code Cube} object.
 * 
 * @author <a href="mailto:kleyton.ohare@gmail.com">Kleyton O'Hare</a>
 *
 */
public class CubeFactory implements ShapeAbstractFactory {
	private int width;

	public CubeFactory(int width) {
		this.width = width;
	}

	@Override
	public Shape createShape() {
		return new Cube(width);
	}
}
