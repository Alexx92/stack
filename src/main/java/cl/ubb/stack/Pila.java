package cl.ubb.stack;

public class Pila {
	boolean vacia;
	int cont;
	int a,b;
	public Pila(){
		vacia=true;
		cont=0;		
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(vacia)
			return true;
		
			return false;
	}

	public void push(int i) {
		// TODO Auto-generated method stub
		vacia=false;
		cont++;
	}
	public int tamaño() {
		// TODO Auto-generated method stub
		return cont;
	}
	

}
