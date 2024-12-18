package interfaces.comparator;

import java.util.Comparator;

public class ComparaHorasHorario implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (((Horario) o1).getHoraComienzo() == ((Horario) o2)
				.getHoraComienzo())
			if (((Horario) o1).getHoraFin() == ((Horario) o2).getHoraFin())
				return 0;
			else if (((Horario) o1).getHoraFin() < ((Horario) o2).getHoraFin())
				return 1;
			else
				return -1;
		else if (((Horario) o1).getHoraComienzo() < ((Horario) o2)
				.getHoraComienzo())
			return -1;
		else
			return 1;
	}

}
