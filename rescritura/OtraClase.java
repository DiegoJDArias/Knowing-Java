package rescritura;

public class OtraClase extends MiClase {
	boolean unaVariable;

	void unMetodo() {
		unaVariable = false;
		super.unMetodo();
		System.out.println(unaVariable);
		System.out.println(super.unaVariable);
	}
}
