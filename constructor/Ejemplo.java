package constructor;

public class Ejemplo {
	
	public Ejemplo(int v){ var1=v;}
	private int var1;
	private int var2;
	public int getVar1(){return var1;}
	
	
	public static void main(String[] args) {
		Ejemplo obj = new Ejemplo(8);
	}
}
