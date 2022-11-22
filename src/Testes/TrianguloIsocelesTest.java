package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.TrianguloIsoceles;

class TrianguloIsocelesTest {
	
	TrianguloIsoceles isoceles;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		isoceles = TrianguloIsoceles.getInstance();
		isoceles.setBase(4);
		isoceles.setLado(3);
	}

	@Test
	void test1() {
		assertEquals(4.47213595499958, isoceles.getArea());
	}
	
	@Test
	void test6() {
		assertEquals(10, isoceles.getPerimetro());
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
}
