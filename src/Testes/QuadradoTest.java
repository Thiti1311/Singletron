package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.Quadrado;

class QuadradoTest {
	
	Quadrado quadrado1;
	Quadrado quadrado2;
	Quadrado quadrado3;
	Quadrado quadrado4;
	Quadrado quadrado5;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		quadrado1 =  new Quadrado(5);
		quadrado2 =  new Quadrado(1);
		quadrado3 =  new Quadrado(8);
		quadrado4 =  new Quadrado(9);
		quadrado5 =  new Quadrado(13);
	}

	@Test
	void test1() {
		assertEquals(25, quadrado1.getArea());
	}
	
	@Test
	void test2() {
		assertEquals(1, quadrado2.getArea());
	}
	
	@Test
	void test3() {
		assertEquals(64, quadrado3.getArea());
	}
	
	@Test
	void test4() {
		assertEquals(81, quadrado4.getArea());
	}
	
	@Test
	void test5() {
		assertEquals(169, quadrado5.getArea());
	}
	
	@Test
	void test6() {
		assertEquals(20, quadrado1.getPerimetro());
	}
	
	@Test
	void test7() {
		assertEquals(4, quadrado2.getPerimetro());
	}
	
	@Test
	void test8() {
		assertEquals(32, quadrado3.getPerimetro());
	}
	
	@Test
	void test9() {
		assertEquals(36, quadrado4.getPerimetro());
	}
	
	@Test
	void test10() {
		assertEquals(52, quadrado5.getPerimetro());
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
