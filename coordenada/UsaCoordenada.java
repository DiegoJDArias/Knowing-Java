package genericos.coordenada;

public class UsaCoordenada {
	public static void main(String[] args) {
		
		Coordenada<Integer> c = new Coordenada<Integer>(2,3,4);
		System.out.println("X: " + c.getX() + ", y: " 
				+ c.getY() + ", Z: " + c.getZ());
		
		int suma = c.getX() + c.getY() + c.getZ();
		System.out.println("La suma de las coordenadas es: " + suma);
		
		String nombre = "Diego J D Arias";
		
		System.out.println(nombre + " es mi nombre, y soy programador de C++\nProgramando en Java...");
	}

}
