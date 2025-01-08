public class VerificaExcepciones {
	
	public static void main(String[] args) {
		
		int vec[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		
		try {
			for (int i = 0; true; i++) {
				System.out.println("vec[" + i + "] es '" + vec[i] + "'");
		        }
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}
