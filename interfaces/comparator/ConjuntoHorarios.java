package interfaces.comparator;

import java.util.TreeSet;

public class ConjuntoHorarios {

	public static void main(String[] args) {
		ComparaHorasHorario ch = new ComparaHorasHorario();
		ComparaHorasYMinutosHorario cm = new ComparaHorasYMinutosHorario();
		TreeSet horarioSetPorHora = new TreeSet(ch);
		TreeSet horarioSetPorMinuto = new TreeSet(cm);

		Horario h1 = new Horario(2, 10, 30, 15, 0, 4);
		Horario h2 = new Horario(2, 8, 0, 12, 0, 4);
		Horario h3 = new Horario(3, 9, 0, 13, 0, 4);
		Horario h4 = new Horario(3, 8, 0, 13, 0, 3);

		horarioSetPorHora.add(h1);
		horarioSetPorHora.add(h2);
		horarioSetPorHora.add(h3);
		horarioSetPorHora.add(h4);

		System.out.println("--- Ordenando solo por hora ---");
		Object[] vectorHorarios = horarioSetPorHora.toArray();
		Horario s;
		for (Object obj : vectorHorarios) {
			s = (Horario) obj;
			System.out.printf(
					"Dia = %s Comienza a las %s:%s y termina a las %s:%s\n",
					s.getDia(), s.getHoraComienzo(), s.getMinutosComienzo(),
					s.getHoraFin(), s.getMinutosFin());
		}

		System.out.println("--- Ordenando por horas y minutos ---");

		horarioSetPorMinuto.add(h1);
		horarioSetPorMinuto.add(h2);
		horarioSetPorMinuto.add(h3);
		horarioSetPorMinuto.add(h4);

		vectorHorarios = horarioSetPorMinuto.toArray();
		for (Object obj : vectorHorarios) {
			s = (Horario) obj;
			System.out.printf(
					"D�a = %s Comienza a las %s:%s y termina a las %s:%s\n",
					s.getDia(), s.getHoraComienzo(), s.getMinutosComienzo(),
					s.getHoraFin(), s.getMinutosFin());
		}
	}
}
