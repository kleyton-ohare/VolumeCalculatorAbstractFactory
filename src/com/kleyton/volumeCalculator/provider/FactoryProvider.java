package com.kleyton.volumeCalculator.provider;

import com.kleyton.volumeCalculator.entities.Shape;
import com.kleyton.volumeCalculator.factory.ShapeAbstractFactory;

/**
 * Provides an interface for concrete classes instantiation.
 * 
 * @author <a href="mailto:kleyton.ohare@gmail.com">Kleyton O'Hare</a>
 */
public class FactoryProvider {
	public static Shape getShape(ShapeAbstractFactory factory) {
		return factory.createShape();
	}
}
