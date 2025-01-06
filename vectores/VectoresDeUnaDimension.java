package vectores;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class VectoresDeUnaDimension {
	private int x;
	private int y;
	
	/**
	 * 
	 * @param var1 valor entero asignado al objeto en la
	 * variable de instancia privada x durante la construcción
	 * @param var2 valor entero asignado al objeto en la
	 * variable de instancia privada y durante la construcción
	 */
	public VectoresDeUnaDimension(int var1, int var2) {
		x = var1;
		y = var2;
	}

	/**
	 * Mostrar el uso de vectores de tipos primitivos y referenciados
	 */
	public static void main(String[] args) {
		int vec[];
		int vec2[]={2, 3, 4, 5, 6, 7};
		VectoresDeUnaDimension vecObj[];
		VectoresDeUnaDimension vecObj2[]={new VectoresDeUnaDimension(5,6), 
							new VectoresDeUnaDimension(7,8), 
							new VectoresDeUnaDimension(9,10), 
							new VectoresDeUnaDimension(11,12)};
		vec = new int[5];
		for(int i=0; i < vec.length; i++) vec[i] = i + 1;
		
		System.out.println("Impimiendo vec: ");
		for(int i=0; i < vec.length; i++) 
			System.out.println("Elemento " + i +":" + vec[i]);
		
		System.out.println("Impimiendo vec2: ");
		for(int i=0; i < vec2.length; i++) 
					System.out.println("Elemento " + i +":" + vec2[i]);
	
		vecObj = new VectoresDeUnaDimension[4];
		for(int i=0; i < vecObj.length; i++) 
				vecObj[i] = new VectoresDeUnaDimension(i * i , i + i);
		
		System.out.println("Impimiendo vecObj: ");
				for(int i=0; i < vecObj.length; i++) 
					System.out.println("Elemento " + i +":" + 
						" Variable x = "+vecObj[i].getX()+
						" Variable y = "+ vecObj[i].getY());
		
		System.out.println("Impimiendo vecObj2: ");
				for(int i=0; i < vecObj2.length; i++) 
					System.out.println("Elemento " + i +":" + 
						" Variable x = "+vecObj2[i].getX()+
						" Variable y = "+ vecObj2[i].getY());
		
		System.out.println("Impimiendo vec: ");
		imprimeVector(vec);
		System.out.println("----------------");
		System.out.println("Impimiendo vec2: ");
		imprimeVector(vec2);
		System.out.println("----------------");
		System.out.println("Impimiendo vecObj: ");
		imprimeVector(vecObj);
		System.out.println("----------------");
		System.out.println("Impimiendo vecObj2: ");
		imprimeVector(vecObj2);
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
	public static void imprimeVector(int[] vec) {
		System.out.print('<');
		for ( int i = 0; i < vec.length; i++ ) {
		  // imprime un elemento
		  System.out.print(vec[i]);
		  // imprime una coma para delimitar si no es el �ltimo elemento
		  if ( (i + 1) < vec.length ) {
		System.out.print(", ");
		  }
		}
		System.out.print('>');
		System.out.print("\n");
	  }
	
	/**
	 * Imprime un vector de objetos del tipo Vectores con formato
	 */
	public static void imprimeVector(VectoresDeUnaDimension[] vec) {
			System.out.print('<');
			for ( int i = 0; i < vec.length; i++ ) {
			  // imprime un elemento
			  System.out.print("["+vec[i].getX()+","+ vec[i].getY()+"]");
			  // imprime una coma para delimitar si no es el �ltimo elemento
			  if ( (i + 1) < vec.length ) {
			System.out.print("; ");
			  }
			}
			System.out.print('>');
			System.out.print("\n");
		  }
}
