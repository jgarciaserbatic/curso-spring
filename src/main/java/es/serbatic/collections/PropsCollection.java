package es.serbatic.collections;

import java.util.Map;

public class PropsCollection implements Collection {

	private Map<String, String> propiedades;

	public Map<String, String> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(Map<String, String> propiedades) {
		this.propiedades = propiedades;
	}

	@Override
	public String toString() {
		return "PropsCollection [propiedades=" + propiedades + "]";
	}
	
}
