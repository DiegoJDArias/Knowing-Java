package patrones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosYRegEx {
	
	public static void main(String args[]) {
		
		String regEx = "[+|-]?(\\d+(\\.\\d+)?)|(\\.\\d+)"; 
		String str = "256 es el cuadrado de 16 y -2.5 al 1 cuadrado es 6.25 " +
		"y -.243 es menor que 0.1234.";
		
		Pattern pattern = Pattern.compile(regEx);
		Matcher m = pattern.matcher(str);
		
		while (m.find ()) {
			System.out.println(m.group());	
		}
	}
}
