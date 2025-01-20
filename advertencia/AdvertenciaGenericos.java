package advertencia;

import java.util.ArrayList;
import java.util.List;

public class AdvertenciaGenericos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List lista = new ArrayList();
		lista.add(0, new Integer(42));
		int total = (Integer) lista.get(0);
	}

}
