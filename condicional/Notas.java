package condicional;

public class Notas {
	public static void main(String[] args) {
		
		int puntuacion = 65;
		String nota = null;
		if (puntuacion >= 90) {
			nota = "Sobresaliente";
		} else if (puntuacion >= 80) {
			nota = "Notable";
		} else if (puntuacion >= 70) {
			nota = "Bien";
		} else if (puntuacion >= 60) {
			nota = "Suficiente";
		} else {
			nota = "Insuficiente";
		}
		System.out.println("la nota es: " + nota);
	}
}
