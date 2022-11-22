package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.Circulo;

class CirculoTest {

	Circulo circulo;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		circulo = Circulo.getInstance();
		circulo.setRaio(8);
	}

	@Test
	void test1() {
		assertEquals(200.96, circulo.getArea());
	}
	
	@Test
	void test6() {
		assertEquals(50.24, circulo.getPerimetro());
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
}
