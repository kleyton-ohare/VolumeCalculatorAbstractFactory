package com.kleyton.volumeCalculator.factory;

import com.kleyton.volumeCalculator.entities.Shape;
import com.kleyton.volumeCalculator.entities.Sphere;

/**
 * Generate {@code Sphere} object.
 * 
 * @author <a href="mailto:kleyton.ohare@gmail.com">Kleyton O'Hare</a>
 *
 */
public class SphereFactory implements ShapeAbstractFactory {
	private int radius;
	
	public SphereFactory(int radius) {
		this.radius = radius;
	}

	@Override
	public Shape createShape() {
		return new Sphere(radius);
	}	
}
