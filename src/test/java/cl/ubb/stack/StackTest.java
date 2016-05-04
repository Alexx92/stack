package cl.ubb.stack;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class StackTest {

	@Test
	public void creaPilaVaciaRetornaTrue() {
		/*Arrange*/
		Pila pila = new Pila();
		/*Act*/
		boolean valor= pila.isEmpty();
		/*Assert*/
		assertEquals(true,valor);
		
	}
	@Test
	public void agregarUnoStackNoEstaVacio() {
		/*Arrange*/
		Pila pila = new Pila();
		/*Act*/
		pila.push(1);
		boolean valor= pila.isEmpty();
		/*Assert*/
		assertEquals(false,valor);
		
	}
	


}
