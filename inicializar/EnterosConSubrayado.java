package inicializar;

/**
 * @author Diego J D Arias
 *
 */
public class EnterosConSubrayado {

	private int var1 = 1_000_999_000;
	private long var2 = 1_222_333_444_555_666_777L;
	
	
	/**
	 * @return Valor almacenado en var1
	 */
	public int getVar1() {
		return var1;
	}


	/**
	 * @param Almacenar valor en var1
	 */
	public void setVar1(int var1) {
		this.var1 = var1;
	}


	/**
	 * @return Valor almacenado en var2
	 */
	public long getVar2() {
		return var2;
	}


	/**
	 * @param Almacenar valor en var2
	 */
	public void setVar2(long var2) {
		this.var2 = var2;
	}


	public static void main(String[] args) {
		EnterosConSubrayado e = new EnterosConSubrayado();
		System.out.println(e.getVar1());
		System.out.println(e.getVar2());
	}

}
