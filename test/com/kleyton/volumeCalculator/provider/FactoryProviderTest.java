package com.kleyton.volumeCalculator.provider;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kleyton.volumeCalculator.entities.Shape;
import com.kleyton.volumeCalculator.factory.CubeFactory;
import com.kleyton.volumeCalculator.factory.SphereFactory;
import com.kleyton.volumeCalculator.factory.TetrahedronFactory;

class FactoryProviderTest {

	private Shape sphere;
	private Shape cube;
	private Shape tetrahedron;
	private double result;

	@Test
	void testSphere() {
		// Test 1 - A sphere of radius 1 has volume 4.19
		sphere = FactoryProvider.getShape(new SphereFactory(1));	// first arg in Uppercase 
		result = sphere.getVolume();
		assertEquals(4.19, result, "Expecting 4.19");	// args: expected, actual, message

		// Test 2 - A sphere of radius 2 has volume 33.51
		sphere = FactoryProvider.getShape(new SphereFactory(2));
		result = sphere.getVolume();
		assertEquals(33.51, result, "Expecting 33.51");

		// Test 3 - A sphere of radius 3 has volume 113.1
		sphere = FactoryProvider.getShape(new SphereFactory(3));
		result = sphere.getVolume();
		assertEquals(113.1, result, "Expecting 113.1");

		// Test 4 - A sphere of radius 4 has volume 268.08
		sphere = FactoryProvider.getShape(new SphereFactory(4));
		result = sphere.getVolume();
		assertEquals(268.08, result, "Expecting 268.08");

		// Test 5 - A sphere of radius 5 has volume 523.6
		sphere = FactoryProvider.getShape(new SphereFactory(5));
		result = sphere.getVolume();
		assertEquals(523.6, result, "Expecting 523.6");
	}

	@Test
	void testCube() {
		// Test 1 - A cube of width 1 has volume 1
		cube = FactoryProvider.getShape(new CubeFactory(1));	// first arg in Uppercase
		result = cube.getVolume();
		assertEquals(1, result, "Expecting 1");

		// Test 2 - A cube of width 2 has volume 8
		cube = FactoryProvider.getShape(new CubeFactory(2));
		result = cube.getVolume();
		assertEquals(8, result, "Expecting 8");

		// Test 3 - A cube of width 3 has volume 27
		cube = FactoryProvider.getShape(new CubeFactory(3));
		result = cube.getVolume();
		assertEquals(27, result, "Expecting 27");

		// Test 4 - A cube of width 4 has volume 64
		cube = FactoryProvider.getShape(new CubeFactory(4));
		result = cube.getVolume();
		assertEquals(64, result, "Expecting 64");

		// Test 5 - A cube of width 5 has volume 125
		cube = FactoryProvider.getShape(new CubeFactory(5));
		result = cube.getVolume();
		assertEquals(125, result, "Expecting 125");
	}

	@Test
	void testTetrahedron() {
		// Test 1 - A regular tetrahedron with edge 1 has volume 0.12
		tetrahedron = FactoryProvider.getShape(new TetrahedronFactory(1));	// first arg in Uppercase
		result = tetrahedron.getVolume();
		assertEquals(0.12, result, "Expecting 0.12");

		// Test 2 - A regular tetrahedron with edge 2 has volume 0.94
		tetrahedron = FactoryProvider.getShape(new TetrahedronFactory(2));
		result = tetrahedron.getVolume();
		assertEquals(0.94, result, "Expecting 0.94");

		// Test 3 - A regular tetrahedron with edge 3 has volume 3.18
		tetrahedron = FactoryProvider.getShape(new TetrahedronFactory(3));
		result = tetrahedron.getVolume();
		assertEquals(3.18, result, "Expecting 3.18");

		// Test 4 - A regular tetrahedron with edge 4 has volume 7.54
		tetrahedron = FactoryProvider.getShape(new TetrahedronFactory(4));
		result = tetrahedron.getVolume();
		assertEquals(7.54, result, "Expecting 7.54");

		// Test 5 - A regular tetrahedron with edge 5 has volume 14.73
		tetrahedron = FactoryProvider.getShape(new TetrahedronFactory(5));
		result = tetrahedron.getVolume();
		assertEquals(14.73, result, "Expecting 14.73");
	}

}
