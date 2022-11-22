package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.TrianguloEquilatero;

class TrianguloEquilateroTest {
	
	TrianguloEquilatero equilatero;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		equilatero = TrianguloEquilatero.getInstance();
		equilatero.setLado(3);
	}

	@Test
	void test1() {
		assertEquals(3.8971143170299736, equilatero.getArea());
	}
	
	@Test
	void test6() {
		assertEquals(9, equilatero.getPerimetro());
	}
	
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
}
