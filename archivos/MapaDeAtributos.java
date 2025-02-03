package archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;

public class MapaDeAtributos {

	public static void main(String[] args) throws Exception {
		Path ruta = Paths.get("/documentos/poemas/Si");
		try {
			Map<String, Object> mapaDeAtributos = Files.readAttributes(ruta,"*");
			Set<String> claves = mapaDeAtributos.keySet();
			for (String clave : claves) {
				System.out.println(clave + ": "
						+ Files.getAttribute(ruta, clave));
			}
		} finally {
		}
	}
}
