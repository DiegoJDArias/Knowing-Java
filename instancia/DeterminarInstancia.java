package instancia;

/* /////////////////////////////////////////////////
   Author Diego J D Arias - diegojdarias@gmail.com.
*/////////////////////////////////////////////////

public class DeterminarInstancia {
	public static void main(String[] args) {
		Empleado empleado = new Empleado("Alejandro", "Ignacio", "Fursi","17.767.076", 
				"Ventas","0","GV50",5500.0F);
		Gerente gerente = new Gerente("Juan", "Pedro", "Goyena","17.767.076", 
				"Ventas","0","GV50",5500.0F,20);
		Director director = new Director("Daniel", "Federico", "Ruiz","17.767.076", 
				"Ventas","0","GV50",5500.0F,20, "vocal");
		Secretaria secretaria = new Secretaria("Mar�a", "Juana", "Roldán", "20.202.020","Ventas", "20","10", 
				800.0F);
		AgenteDeSeguridad seguridad = new AgenteDeSeguridad("Heber", "David", "Arias", "32.254.854");

		if (empleado instanceof Empleado)
			System.out.println("Empleado es una instancia de Empleado");
		if (empleado instanceof Persona)
			System.out.println("Empleado es una instancia de Persona");
		if (secretaria instanceof Empleado)
			System.out.println("Secretaria es una instancia de Empleado");
		if (gerente instanceof Empleado)
			System.out.println("Gerente es una instancia de Empleado");
		if (director instanceof Empleado)
			System.out.println("Director es una instancia de Empleado");
		if (director instanceof Empleado)
			System.out.println("Director es una instancia de Empleado");
		if (director instanceof Persona)
			System.out.println("Director es una instancia de Persona");
		
		//System.out.println(seguridad.setNroLicencia("78957"));

		// Esto es un error de compilación
		// if(ingeniero instanceof Gerente)
		// System.out.println("e es una instancia de Empleado");
	}
}
