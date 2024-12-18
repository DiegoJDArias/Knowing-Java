package invarianza;

import java.util.ArrayList;
import java.util.List;

public class VerificaInvarianza {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<A> la;
		List<C> lc = new ArrayList<C>();
		List<D> ld = new ArrayList<D>();
		
//		 //si lo siguiente fuese posible...
//		 la = lc;
//		 la.add(new C());
//		
//		 //lo siguiente también debería ser posible...
//		 la = ld;
//		 la.add(new D());
//		
//		 //por tanto...
//		 C sa = ld.get(0); //¡No!!	
	}
}
