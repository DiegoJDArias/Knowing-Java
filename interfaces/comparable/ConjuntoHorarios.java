package interfaces.comparable;

import java.util.TreeSet;

public class ConjuntoHorarios {

	public static void main(String[] args) {
		
		TreeSet conjuntoDeHorarios = new TreeSet();
		
		conjuntoDeHorarios.add(new Horario(2, 10, 30, 15, 0, 4));
		conjuntoDeHorarios.add(new Horario(2, 8, 0, 12, 0, 4));
		conjuntoDeHorarios.add(new Horario(3, 9, 0, 13, 0, 4));
		conjuntoDeHorarios.add(new Horario(3, 8, 0, 13, 0, 3));
		Object[] estudianteArray = conjuntoDeHorarios.toArray();
		
		Horario s;
		for (Object obj : estudianteArray) {
			s = (Horario) obj;
			System.out.printf("D�a = %s Comienza a las %s:%s y termina a las %s:%s\n", s.getDia(),
					s.getHoraComienzo(), s.getMinutosComienzo(),
					s.getHoraFin(), s.getMinutosFin());
		}
	}
}
