package cl.ubb.stack;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class StackTest {

	@Test
	public void creaPilaVacia() {
		/*Arrange*/
		Pila pila = new Pila();
		/*Act*/
		boolean valor= pila.isEmpty();
		/*Assert*/
		assertEquals(true,valor);
		
	}


}
