package com.kleyton.volumeCalculator.factory;

import com.kleyton.volumeCalculator.entities.Shape;

/**
 * This functional interface provides an interface for concrete classes instantiation.
 * 
 * @author <a href="mailto:kleyton.ohare@gmail.com">Kleyton O'Hare</a>
 */
public interface ShapeAbstractFactory {

	/**
	 * Creates a {@code Shape} object.
	 * 
	 * @return {@code Shape} instantiation.
	 */
	Shape createShape();
}
