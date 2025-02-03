package archivos;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PosicionamientoConAccesoAleatorio {
	public static void main(String[] args) throws IOException {
		Path ruta = Paths.get("usuarios.txt");
		final String newLine = System.getProperty("line.separator");
		try (SeekableByteChannel sbc = Files.newByteChannel(ruta,
				StandardOpenOption.WRITE)) {
			ByteBuffer buffer;
			long posicion = sbc.size();
			sbc.position(posicion);
			System.out.println("Posición: " + sbc.position());
			buffer = ByteBuffer.wrap((newLine + "Pablo").getBytes());
			sbc.write(buffer);
			System.out.println("Posición: " + sbc.position());
			buffer = ByteBuffer.wrap((newLine + "Carola").getBytes());
			sbc.write(buffer);
			System.out.println("Posición: " + sbc.position());
			buffer = ByteBuffer.wrap((newLine + "José").getBytes());
			sbc.write(buffer);
			System.out.println("Posición: " + sbc.position());
		}
	}
}
