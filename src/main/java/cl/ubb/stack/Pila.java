package cl.ubb.stack;

public class Pila {
	boolean vacia;
	public Pila(){
		vacia=true;
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
	}
	

}
