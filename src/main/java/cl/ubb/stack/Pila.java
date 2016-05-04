package cl.ubb.stack;

public class Pila {
	boolean vacia;
	
	int a,b;
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
		if(a==0){
			a=i;
		}else{
			b=i;
		}
		
	}
	public int tamaño() {
		// TODO Auto-generated method stub
		if(a!=0&&b!=0){
			return 2;
		}
		return 0;
		
	}
	public int pop() {
				// TODO Auto-generated method stub
		if(a==1){
			return 1;
		}
		return 0;
		
		
	}
	

}
