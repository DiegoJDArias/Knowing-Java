package vectores;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class Matrices {
	private int x;
	private int y;
	
	
	/**
	 * @param var1 valor entero asignado al objeto en la
	 * variable de instancia privada x durante la construcci�n
	 * @param var2 valor entero asignado al objeto en la
	 * variable de instancia privada y durante la construcci�n
	 */
	public Matrices(int var1, int var2) {
		x = var1;
		y = var2;
	}
/**
 * Mostrar el uso de matrices de tipos primitivos y referenciados
 */
	public static void main(String[] args) {
		int mat[][];
		int mat2[][]={
		{0},
		{1, 2},
		{3, 4, 5},
		{6, 7, 8, 9}
		};
		
		Matrices matObj[][];
		Matrices matObj2[][]={
		{new Matrices(11,22)},
		{new Matrices(33,44),new Matrices(55,66)},
		{new Matrices(77,88),new Matrices(99,100), new Matrices(110,120)}};
		
		matObj = new Matrices[4][];
		for(int i=0; i < matObj.length; i++) 
			matObj[i] = new Matrices[i + 1];
		
		for(int i=0; i < matObj.length ; i++)
			for(int j=0; j < matObj[i].length; ++j) 
					matObj[i][j] = new Matrices(i*i, (i+1) * (i+1));
		
		mat = new int[4][];
		for(int i=0; i < mat.length; i++) mat[i] = new int[i + 1];
		for(int i=0; i < mat.length ; i++)
			for(int j=0; j < mat[i].length; ++j)
				mat[i][j] = i + j;
		
		System.out.println("Impimiendo mat: ");
		for(int i=0; i < mat.length ; i++)
			for(int j=0; j < mat[i].length && j<= i; j++)
				System.out.println(mat[i][j]);
		
		System.out.println("Impimiendo mat2: ");	
		for(int i=0; i < mat2.length ; i++)
			for(int j=0; j < mat2[i].length && j<= i; j++)
				System.out.println(mat2[i][j]);
						
		System.out.println("Impimiendo mat: ");
		for(int i=0; i < mat.length ; i++){
			System.out.println("Impimiendo fila: " + i);
				imprimeVector(mat[i]);
				System.out.println("----------------");
		}
		
		System.out.println("Impimiendo mat2: ");	
		for(int i=0; i < mat2.length ; i++){
		System.out.println("Impimiendo fila: " + i);
			imprimeVector(mat2[i]);
			System.out.println("----------------");
		}
		
		System.out.println("Impimiendo mat: ");
				for(int i=0; i < matObj.length ; i++){
					System.out.println("Impimiendo fila: " + i);
						imprimeVector(matObj[i]);
						System.out.println("----------------");
				}
		
		System.out.println("Impimiendo mat2: ");	
		for(int i=0; i < matObj2.length ; i++){
		System.out.println("Impimiendo fila: " + i);
			imprimeVector(matObj2[i]);
			System.out.println("----------------");
		}
	}
	
	
	/**
	 * Retorna el valor de la variable privada x
	 * @return
	 * valor entero asignado al objeto en la
	 * variable de instancia privada x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Retorna el valor de la variable privada y
	 * @return
	 * valor entero asignado al objeto en la
	 * variable de instancia privada y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Cambia el valor de la variable privada x
	 * @param i
	 * valor entero a asignar al objeto en la
	 * variable de instancia privada x
	 */
	public void setX(int i) {
		x = i;
	}

	/**
	 * Cambia el valor de la variable privada y
	 * @param i
	 * valor entero a asignar al objeto en la
	 * variable de instancia privada y
	 */
	public void setY(int i) {
		y = i;
	}
	
	/**
	 * Imprime un vector del tipo int con formato
	 */
	public static void imprimeVector(int[] vector) {
		System.out.print('<');
		for ( int i = 0; i < vector.length; i++ ) {
		  // imprime un elemento
		  System.out.print(vector[i]);
		  // imprime una coma para delimitar si no es el último elemento
		  if ( (i + 1) < vector.length ) {
		System.out.print(", ");
		  }
		}
		System.out.print('>');
		System.out.print("\n");
	  }
	/**
	 * Imprime un vector de objetos del tipo Matrices con formato
	 */
	public static void imprimeVector(Matrices[] vector) {
			System.out.print('<');
			for ( int i = 0; i < vector.length; i++ ) {
			  // imprime un elemento
			  System.out.print("["+vector[i].getX()+","+ vector[i].getY()+"]");
			  // imprime una coma para delimitar si no es el último elemento
			  if ( (i + 1) < vector.length ) {
			System.out.print("; ");
			  }
			}
			System.out.print('>');
			System.out.print("\n");
		  }
}
