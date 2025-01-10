package archivos;

import java.io.InputStream;
import java.io.OutputStream;

public class ThreadDeESBytes extends Thread {

	InputStream is = null;
	OutputStream os = null;
	String proceso = null;

	ThreadDeESBytes(String proceso, InputStream is, OutputStream os) {
		this.is = is;
		this.os = os;
		this.proceso = proceso;
	}

	public void run() {
		byte[] buffer = new byte[512];
		int bytes_read;
		try {
			for (;;) {
				bytes_read = is.read(buffer);
				if (bytes_read == -1) {
					os.close();
					is.close();
					return;
				}
				os.write(buffer, 0, bytes_read);
				os.flush();
				System.out.println("Procesando: " + proceso);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}
}
