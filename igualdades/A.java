package igualdades;

public class A {
	
	final B valorNoNulo = new B();
	C otrovalorNoNulo = new C();
	int valorQueNoDeterminaEstado;

	public boolean equals(Object otro) {
		if (this == otro)
			return true;
		if (!(otro instanceof A))
			return false;
		A otroA = (A) otro;
		return (valorNoNulo.equals(otroA.valorNoNulo))
				&& ((otrovalorNoNulo == null) ? otroA.otrovalorNoNulo == null
						: otrovalorNoNulo.equals(otroA.otrovalorNoNulo));
	}

	public int hashCode() {
		int hash = 1;
		hash = hash * 31 + valorNoNulo.hashCode();
		hash = hash * 31
				+ (otrovalorNoNulo == null ? 0 : otrovalorNoNulo.hashCode());
		return hash;
	}
}
