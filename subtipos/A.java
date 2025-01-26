package subtipos;

public class A <T>{


	private T t;

	public void agregar(T t) {
		this.t = t;
	}

	public T obtener() {
		return t;
	}
	
	public void unMetodo(A<Number> a){
		// Hace algo
	}

	public static void main(String[] args) {
		A<Number> a = new A<Number>();
		a.agregar(new Integer(10)); // Bien
		a.agregar(new Double(10.1)); // Bien
		
		A<Double> a2 = new A<>();
//		a.unMetodo(a2); //Error
		B<Double> b1 = new B<>();
//		a2.unMetodo(b1); //Error
		B<Number> b2 = new B<>();
		a2.unMetodo(b2); //Correcto
	}

}
