package cl.ubb.stack;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	private Pila pila;
	@Before
	public void setup(){
		pila = new Pila();
	}
	@Test
	public void creaPilaVaciaRetornaTrue() {
		/*Arrange*/		 
		/*Act*/
		boolean valor= pila.isEmpty();
		/*Assert*/
		assertEquals(true,valor);
		
	}
	@Test
	public void agregarUnoStackNoEstaVacio() {
		/*Arrange*/
		/*Act*/
		pila.push(1);		
		/*Assert*/
		assertEquals(false,pila.isEmpty());
		
	}
	@Test
	public void agregarUnoYDosStackNoEstaVacio() {
		/*Arrange*/
		/*Act*/
		pila.push(1);
		pila.push(2);		
		/*Assert*/
		assertEquals(false,pila.isEmpty());
		
	}
	@Test
	public void agregarUnoYDosStackTamañoDos() {
		/*Arrange*/		
		/*Act*/
		pila.push(1);
		pila.push(2);
		/*Assert*/
		assertEquals(2,pila.tamaño());		
	}
	@Test
	public void agregarPopUnoyDevuelveUno() {
		/*Arrange*/		
		/*Act*/
		pila.push(1);
		/*Assert*/
		assertEquals(1,pila.pop());		
	}
	
	


}
