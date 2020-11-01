package com.kleyton.volumeCalculator.factory;

import com.kleyton.volumeCalculator.entities.Shape;
import com.kleyton.volumeCalculator.entities.Tetrahedron;

/**
 * Generate {@code Tetrahedron} object.
 * 
 * @author <a href="mailto:kleyton.ohare@gmail.com">Kleyton O'Hare</a>
 *
 */
public class TetrahedronFactory implements ShapeAbstractFactory {
	private int edge;

	public TetrahedronFactory(int edge) {
		this.edge = edge;
	}

	@Override
	public Shape createShape() {
		return new Tetrahedron(edge);
	}
}