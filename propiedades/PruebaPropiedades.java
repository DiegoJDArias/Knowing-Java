package propiedades;

import java.util.Properties;
import java.util.Enumeration;

public class PruebaPropiedades {
	
	public static void main(String[] args) {
		
		Properties props = System.getProperties();
		Enumeration<?> prop_names = props.propertyNames();
		
		while (prop_names.hasMoreElements()) {
			String prop_name = (String) prop_names.nextElement();
			String property = props.getProperty(prop_name);
			System.out.println("propiedad '" + prop_name + "' es '" + property
					+ "'");
		}
	}
}