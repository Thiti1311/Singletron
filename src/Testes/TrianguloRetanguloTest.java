package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.TrianguloRetangulo;

class TrianguloRetanguloTest {
	
	TrianguloRetangulo trianRetangulo;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		trianRetangulo = TrianguloRetangulo.getInstance();
		trianRetangulo.setAltura(3);
		trianRetangulo.setBase(6);
	}
	@Test
	void test1() {
		assertEquals(9, trianRetangulo.getArea());
	}
	
	@Test
	void test6() {
		assertEquals(15.70820393249937, trianRetangulo.getPerimetro());
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
